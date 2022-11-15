
public class Pangram {
	
	static char[] convert(String a) { //converting String a to an array of char
		char[] b= new char[a.length()];
		for(int i=0; i<b.length;i++) {
			b[i]=a.charAt(i); 
		}
		return b;
	}

	public static void main(String[] args) {
		String a="The quick brown fox jumps over the lazy dog";
		
		a=a.toUpperCase().replace(" ", "");
		
		char[] aa=Pangram.convert(a);
		
		int[] bb = new int[26];
		
		for(int i=0; i<aa.length;i++) {
			int index=aa[i]-65; //Great Logic by Hyder Abbas
			bb[index]++;
			
		}
		boolean token=true;
		for(int i=0;i<bb.length;i++) {
			if(bb[i]==0) {
				System.out.println("It's not a Pangram");
				token=false;
				break;
			}
		}
		if(token) {
			System.out.println("It's a Pangram");
		}

	}

}
