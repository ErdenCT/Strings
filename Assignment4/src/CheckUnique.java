
public class CheckUnique {
	
	static char[] convert(String a) { //converting String a to an array of char
		char[] b= new char[a.length()];
		for(int i=0; i<b.length;i++) {
			b[i]=a.charAt(i); 
		}
		return b;
	}

	public static void main(String[] args) {
		String a="Michael Jordun";
		
		a=a.toLowerCase().replace(" ", "");
		
		char[] aa=Anagram.convert(a); //Converting string to char array with static method
		
		boolean token=true;
		for(int i=0; i<aa.length; i++) {
			for(int j=i+1; j<aa.length; j++) {
				if(aa[i]==aa[j]) {
					System.out.println("Not all characters are unique!");
					token=false;
					break;
				}
			}
		}
		if(token) {
		System.out.println("All characters are unique!");
		}

	}

}
