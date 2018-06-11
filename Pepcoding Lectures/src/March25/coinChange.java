package March25;

public class coinChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int coins[] ={2,3,5,6};
		CoinChangeComb(coins, 10, 0, "",0);

	}
	static int count=0;
public static void CoinChange(int[] coins,int amt,int sum,String asf){
	if(sum==amt){
		count++;
		System.out.println(count +"--> " +asf);
	}
	
	
	for(int i=0;i<coins.length && sum<=amt;i++){
		CoinChange(coins, amt, sum+coins[i], asf+coins[i]);
		
	}
	
	
}

public static void CoinChangeComb(int[] coins,int amt,int sum,String asf,int cu){
	if(sum==amt){
		count++;
		System.out.println(count +"--> " +asf);
	}
	
	
	for(int i=cu;i<coins.length && sum<=amt;i++){
		CoinChangeComb(coins, amt, sum+coins[i], asf+coins[i],i);
		
	}
	
	
}
}
