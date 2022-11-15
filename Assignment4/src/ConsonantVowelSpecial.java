import java.util.Scanner;

public class ConsonantVowelSpecial {
	static int countVow=0;
	static int countCons=0;
	
	static void vowCount(char[] b, String c) {
		
		for(int i=0; i<b.length;i++) {
			if(b[i]=='a'|| b[i]=='e'||b[i]=='i'||b[i]=='o'||b[i]=='u') {
				countVow++;
				continue;
			}
		}
		System.out.println("Number of Vowels in " +c+ " are: "+countVow);
		
	}
	static void consCount(char[] b, String c) {
		
		for(int i=0; i<b.length;i++) {
			if(b[i]!='a'&&b[i]!='e'&&b[i]!='i'&&b[i]!='o'&&b[i]!='u'
					&&Character.isLetter(b[i])) {
				countCons++;	
			}
		}
		System.out.println("Number of Consonants in " +c+ " are: "+countCons);
	}
	static void specialCount(char[] b, String c) {
		int letters = countVow+countCons;
		int countSpecial=b.length-letters;
		System.out.println("Number of Special Characters in " +c+ " are: "+countSpecial);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter string to analyze: ");
		String c=scan.nextLine();
		String a=c.toLowerCase().replace(" ", "");
		
		char[] b= new char[a.length()];
		for(int i=0; i<b.length;i++) {
			b[i]=a.charAt(i); //converting String a to an array of char
		}
		ConsonantVowelSpecial.vowCount(b,c);
		ConsonantVowelSpecial.consCount(b,c);
		ConsonantVowelSpecial.specialCount(b,c);
		
		scan.close();
	}
	
}
