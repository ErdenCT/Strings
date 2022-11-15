import java.util.Arrays;

public class MaxOcurringChar {
	
	static char[] convert(String a) { //converting String a to an array of char
		char[] b= new char[a.length()];
		for(int i=0; i<b.length;i++) {
			b[i]=a.charAt(i); 
		}
		return b;
	}

	public static void main(String[] args) {
		String a="Tennessee";
		
		a=a.toLowerCase().replace(" ", "");
		
		char[] aa=Anagram.convert(a); //Converting string to char array with static method
		int[] count= new int[aa.length];
		Arrays.fill(count, 1);
		
		for(int i=0; i<aa.length;i++) { //Storing letter counts in count array
			for(int j=i+1; j<aa.length; j++) {
				if(aa[i]==aa[j]&&aa[j]!=0) {
					aa[j]=0;
					count[i]++;
				}
			}
		}
		/*for(int num:count) { //Printing the count array
			System.out.print(num);
		}
		*/
		int max=count[0]; //finding the max number and the index in count array 
		int index=0;
		for(int i=0; i<count.length;i++) {
			if(count[i]>max&&count[i]!=1) {
				max=count[i];
				index=i;
			}
		}
		//System.out.println();
		
		System.out.println("Letter \""+aa[index]+"\""+" occurs " +max +" times");
	}
}
