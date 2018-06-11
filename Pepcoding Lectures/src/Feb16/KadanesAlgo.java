package Feb16;

public class KadanesAlgo {

	public static void main(String[] args) {

		int[] arr = { 5, -8, 2, 7, 12, 3, -25, 15, 7, 3 };

		int cm, om, csp = 0, cep = 0, osp = 0, oep = 0;
		cm = arr[0];
		om = arr[0];

		boolean winner = false;
		if (cm > 0)
			winner = true;

		for (int i = 1; i < arr.length; i++) {
			if (winner == true) {
				cm = cm + arr[i];
				
				cep = i;

			} else if (winner == false) {
				cm = arr[i];
				csp = i;
				cep = i;
			}

			if (cm > 0)
				winner = true;
			else
				winner = false;

			if (cm > om){
				om = cm;
				osp=csp;
				oep=cep;
			}
		}
		System.out.println(om);
		
		for(int i=osp;i<=oep;i++){
			
			System.out.print(arr[i]+" ");
		}

		// TODO Auto-generated method stub

	}

}
