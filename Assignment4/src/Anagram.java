
public class Anagram {
	
	static char[] convert(String a) { //converting String a to an array of char
		char[] b= new char[a.length()];
		for(int i=0; i<b.length;i++) {
			b[i]=a.charAt(i); 
		}
		return b;
	}
	static char[] sort(char[] arr) { //BubbleSort
		char temp=' ';
		for(int i=0; i<arr.length; i++) {
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j]<arr[j-1]) {
					temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;	
				}	
			}	
		}
		return arr;
	}
	public static void main(String[] args) {
		String a ="A gentle man";
		String b ="Elegant man";
		
		a=a.toLowerCase().replace(" ", "");
		b=b.toLowerCase().replace(" ", "");
		
		char[] aa=Anagram.convert(a); //Converting string to char array with static method
		char[] bb=Anagram.convert(b);
		
		aa=Anagram.sort(aa);//Sorting char array with static method
		bb=Anagram.sort(bb);
		
		boolean token=false;
		for(int i=0; i<aa.length; i++) {
			if(aa[i]==bb[i]) {
				token=true;
				continue;
			}
			else {
				System.out.println("It's not an anagram");
				token=false;
				break;
			}
		}
		if(token) {
		System.out.println("It's an anagram");
		}
	}
}
