package CodingBat;

public class strCopies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s="catcowcat";
     boolean res=straCopies(s,"cat",2);
     System.out.println(res);
	}
	public static boolean straCopies(String str, String sub, int n) {
		 int c=copies(str,sub,0);
		 System.out.println(c);
		 if(c>=n){
			 
		   return true;
		 }
		 else{
			 
		   return false;
		 }
		}
		public static int copies(String str,String sub,int count){
		   if(str.length()<sub.length()){
		    return count;
		    
		  }
		  String tc=str.substring(0,sub.length());
		  if((tc.equals(sub))){
		    String rem=str.substring(sub.length());
		    return copies(rem,sub,count+1);
		  }
		  else{
		    String rem=str.substring(1);
		    return copies(rem,sub,count);
		    
		  }
		}

}
