package hashMap;

public class HashmapClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hashMapGeneric<String, Integer> map = new hashMapGeneric<>();

		map.put("a", 1);
		map.put("b", 10);
		map.put("c", 11);
		map.put("d", 12);
		map.put("e", 13);
		map.put("f", 14);
		map.put("g", 15);
		map.put("h", 16);
		

		map.display();
//		map.put("a", 100);
//		
//		map.remove("a");
		map.put("aa", 111);
		map.display();

//		System.out.println(map.containsKey("h"));
		
		System.out.println(map.get("aa"));
		System.out.println(map.containsKey("aba"));

	}

}
