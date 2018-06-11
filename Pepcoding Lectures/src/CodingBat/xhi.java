package CodingBat;

public class xhi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String h="xhixhi";
		int co=countHi2(h);
		System.out.println(co);

	}
	public static int countHi2(String str) {
		  if(str.length()<2){
		    return 0;
		  }
		  if(str.length()==2){
		    if(str.equals("hi")){
		      return 1;
		    }
		  }
		  int co=count(str,0);
		  return co;
		 }
		public static int count(String st,int idx){
				  if(idx+1==st.length()){
				    return 0;
				  }
				  if(idx-1>0){
				    char x=st.charAt(idx);
				    char y=st.charAt(idx+1);
				    char z=st.charAt(idx-1);
				    if(x=='h'&&y=='i'&&z!='x'){
				      return 1+count(st,idx+1);
				    }
				    else  {
				      return count(st,idx+1);
				    }
				    
				    
				  }
				  else{ char x=st.charAt(idx);
				    char y=st.charAt(idx+1);
				    if(x=='h'&&y=='i'){
				      return 1+count(st,idx+1);
				    }
				    else  {
				      return count(st,idx+1);
				    }

				    
				    
				  }
				  
		}

}
