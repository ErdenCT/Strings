
public class RemoveDuplicates {
	
	static void removeDuplicates(char[] a){
		
		 for(int i=0; i<a.length; i++) {
			int j=1;
			j=i+1;
			  for( ;j<a.length; j++) {
				if(a[i]==a[j]) {
					a[j]=' '; //replacing duplicates with space		
				}
			}
		}
		 int count=0;
		 for(char c:a) {
				if(c==' ')
				count++;
			}
			System.out.println("Duplicate count= "+count);
		System.out.println("Our string without duplicates: ");
		for(char c:a) {
			if(c!=' ')
			System.out.print(c +" ");
		}
	}
	public static void main(String[] args) {
		String s = "Tennessee";
		
		System.out.println("Our string: ");
		char[] str=new char[s.length()]; //turning string s into a char array
		for(int i=0; i<str.length;i++) {
			str[i]=s.charAt(i);
		}
		for(char c:str) {
			System.out.print(c +" ");
		}
		System.out.println();
		RemoveDuplicates.removeDuplicates(str);		
	}

}
