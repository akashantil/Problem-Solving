package NonCategory;

import java.util.ArrayList;
import java.util.Scanner;

public class Pep_Java_8NonCategory_6NavdeepGettingFamous {

	public static void main(String[] args) {
		// // TODO Auto-generated method stub
		// Scanner sc = new Scanner(System.in);
		// int not=sc.nextInt();
		// for(int i=0;i<not;i++){
		// int soa=sc.nextInt();
		// int nod=sc.nextInt();
		//// ArrayList<Integer> array= new ArrayList<Integer>();
		// int[] array= new int [soa];
		// for(int j=0;j<soa;j++){
		// array[j]=sc.nextInt();
		// }
		// while(nod>0){
		// for(int j=0;j<array.length-1 && nod>0;j++){
		// int x=array[j];
		// int y=array[j+1];
		// if(x<y && x!=0){
		// array[j]=0;
		// nod--;
		//
		// }else if(y==0){
		// if(j+2<array.length){
		// array[j+1]=array[j+2];
		// array[j+2]=0;
		// }
		// }
		// }
		// }
		// for(int k=0;k<array.length ;k++){
		// if(array[k]!=0){
		// System.out.print(array[k]+" ");
		// }
		// }
		// System.out.println();
		//
		// }
		//

		Scanner sc = new Scanner(System.in);
		int not = sc.nextInt();
		for (int i = 0; i < not; i++) {
			int soa = sc.nextInt();
			int nod = sc.nextInt();
			int[] arr = new int[soa];
			for (int j = 0; j < soa; j++) {
				arr[j] = sc.nextInt();

			}
			ArrayList<Integer> ab = new ArrayList<Integer>();

			while (nod > 0) {
				int fi = 0;
				int si = 1;
				while (si < arr.length) {

					if (arr[fi] < arr[si] && arr[fi] != -11 && arr[si] != -11) {
						arr[fi] = -11;
						nod--;
						fi++;
						si++;
					} else if (arr[fi] < arr[si] && arr[fi] == -11 && arr[si] != -11) {
						fi++;
						si++;
					} else if ( arr[fi] != -11 && arr[si] == -11) {
						si++;
					} else {
						fi++;
						si++;
					}

				}

			}
			for (int k = 0; k < arr.length; k++) {
				if (arr[k] != -11) {
					System.out.print(arr[k] + " ");
				}

			}

		}

	}

}
