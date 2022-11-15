
public class Palindrome {

	public static void main(String[] args) {
		boolean flag=false;
		String a="2552";
		char[] b= new char[a.length()];
		for(int i=0; i<b.length;i++) {
			b[i]=a.charAt(i); //converting String a to an array of char
		}
		for(int i=0; i<b.length; i++) {
			if(b[i]==b[b.length-i-1]) {
				flag=true;
				}
			else {
				flag=false;
				break;
			}	
		}
		if(flag) {
				System.out.println("This is a Palindrome");
			}
	    else {
	    	System.out.println("This is not a Palindrome");
	    }	
	}
		

	}


