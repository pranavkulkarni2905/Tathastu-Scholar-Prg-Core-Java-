
public class Problem7 {

	public static void main(String[] args) {
		 String str= "Pranav", nstr="";
	        char ch;
	       
	      System.out.print("Original word: ");
	      System.out.println("Pranav"); 
	       
	      for (int i=0; i<str.length(); i++)
	      {
	        ch= str.charAt(i);
	        nstr= ch+nstr;
	      }
	      System.out.println("Reversed word: "+ nstr);
	}

}
