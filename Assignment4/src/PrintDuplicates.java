
public class PrintDuplicates {
	static int count=0;
	
	static void printDuplicates(char[] a){
		
		System.out.println("Duplicate letters in our string: ");
		 l1:for(int i=0; i<a.length; i++) {
			
			
			  l2:for(int j=i+1;j<a.length; j++) {
				if(a[i]==a[j]) {
					System.out.print(a[j]+" ");	
					continue l1;	
				}
			}
		}	
		
	}
	public static void main(String[] args) {
		String s = "Tennessee";
		System.out.println("Our string: \n" + s);
		s=s.toLowerCase().replace(" ", "");
		
		System.out.println("Our characters: ");
		char[] str=new char[s.length()]; //turning string s into a char array
		for(int i=0; i<str.length;i++) {
			str[i]=s.charAt(i);
		}
		for(char c:str) {
			System.out.print(c +" ");
		}
		System.out.println();
		PrintDuplicates.printDuplicates(str);	
	}
	
	
}
