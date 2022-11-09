import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		int[] ar= {9,12,15,56,43,33,21,4,7,22};
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter key to be searched:");
		int key=scan.nextInt();
		boolean c=false;
		
		for(int i=0; i<ar.length; i++) {
			if(key==ar[i]) {
				System.out.println("Key "+key+" found at index "+i);
				c=true;
				break;
				
			}
			}	
	if(!c) {
		System.out.println("Key not found.");}

	}

}
