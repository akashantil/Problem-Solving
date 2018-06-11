package CodingBat;

public class strcopiesstartandend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st="catcowcat";
		int fc=strDist(st,"cow");
		System.out.println(fc);

	}
	public static int strDist(String str, String sub) {
		  int fc=copies(str,sub,0,0,false,false);
		  return fc;
		  
		}
		public static int copies(String str,String sub,int count,int ac,boolean f,boolean en){
				   if(str.length()<sub.length()){
					   if(en==true){
				    return count+ac;
					   }
					   else return count;
				  }
				  String tc=str.substring(0,sub.length());
				  if(tc.equals(sub) && f==false){
				    f=true;
				    String rem=str.substring(sub.length());
				    return copies(rem,sub,count+sub.length(),ac,f,en);
				  }
				  else  if(!(tc.equals(sub ))&& f==true && en ==false){
				    
				    String rem=str.substring(1);
				    return copies(rem,sub,count,ac+1,f,en);
				  }
				   else  if((tc.equals(sub ))&& f==true){
				     f=false;
				     en=true;
				    
				    String rem=str.substring(sub.length());
				    return copies(rem,sub,count,ac+sub.length(),f,en);
				  }
				   else{
					   String rem=str.substring(1);
					   return copies(rem,sub,count,ac,f,en);
				   }
				    
				    
				  }
				
				



}
