package hashMap;

import java.util.ArrayList;

public class hashMapGeneric<K, V> {

	public class HMNode {

		K key;
		V data;

	}

	private GenericLInkedList<HMNode>[] buckets;
	int size;

	public hashMapGeneric() {
		buckets = new GenericLInkedList[4];
		for (int i = 0; i < buckets.length; i++) {
			buckets[i] = new GenericLInkedList<>();
		}

	}

	public void display() {

		System.out.println("-------------------------------");
		for (int i = 0; i < buckets.length; i++) {
			System.out.print("B[" + i + "] ->");

			for (int i1 = 0; i1 < buckets[i].size; i1++) {
				HMNode n2p = buckets[i].getAt(i1);
				System.out.print("{ " + n2p.key + " @ " + n2p.data + "}");

			}

			System.out.println(" .");
		}
		System.out.println("-------------------------------");

	}

	public void put(K key, V data) {

		int bidx = hashFn(key);
		int didx = findInBucket(bidx, key);

		if (didx == -1) {
			HMNode n2a = new HMNode();
			n2a.key = key;
			n2a.data = data;
			buckets[bidx].addLast(n2a);
			this.size++;

		} else {

			HMNode n2u = buckets[bidx].getAt(didx);
			n2u.data = data;

		}
		double lambda = this.size * 1.0 / buckets.length;
		if (lambda > 2) {
			rehash();
		}

	}

	public V remove(K key) {
		int bidx = hashFn(key);
		int didx = findInBucket(bidx, key);
		if (didx == -1)
			return null;
		else {
			HMNode n2r = buckets[bidx].removeAt(didx);
			this.size--;
			return n2r.data;

		}

	}

	public V get(K key) {
		int bidx = hashFn(key);
		int didx = findInBucket(bidx, key);
		if (didx == -1)
			return null;
		else {
			HMNode n2r = buckets[bidx].getAt(didx);
			return n2r.data;
		}

	}

	public boolean containsKey(K key) {

		return this.get(key)!=null;

	}

	public ArrayList<K> keys() {

		ArrayList<K> ab = new ArrayList<>();
		for (int i = 0; i < buckets.length; i++) {
			if (buckets[i].size > 0) {
				for (int i1 = 0; i1 < buckets[i].size; i1++) {
					ab.add(buckets[i].getAt(i1).key);

				}
			}
		}
		return ab;

	}

	private int hashFn(K key) {
		return (Math.abs(key.hashCode() % buckets.length));

	}

	private int findInBucket(int bidx, K key) {

		for (int i = 0; i < buckets[bidx].size; i++) {
			K com = buckets[bidx].getAt(i).key;
			if (com.equals(key))
				return i;
		}

		return -1;

	}

	private void rehash() {
		GenericLInkedList<HMNode>[] oldBuckets = buckets;
		buckets = new GenericLInkedList[2 * oldBuckets.length];

		for (int i = 0; i < buckets.length; i++)
			buckets[i] = new GenericLInkedList<>();

		this.size = 0;

		for (int bidx = 0; bidx < oldBuckets.length; bidx++) {
			for (int di = 0; di < oldBuckets[bidx].size; di++) {
				HMNode n2a = oldBuckets[bidx].getAt(di);
				put(n2a.key, n2a.data);
			}
		}
	}

}
