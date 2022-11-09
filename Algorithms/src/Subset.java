import java.util.Arrays;

public class Subset {
	
	private void checkSubset(int[] array1, int[] array2) {
		Arrays.sort(array1);
		Arrays.sort(array2);
		int[] arrayOfEquals = new int[array2.length];
		boolean flag=true;
		
		l1:for(int i=0; i<array2.length; i++) {
			l2:for(int j=0; j<array1.length; j++) {
				if(array2[i]==array1[j]) {
					System.out.println(array2[i]+" exists in Array 1");
					arrayOfEquals[i]=array2[i];
					//continue l1;
					break;
				}
			}
		}
		for(int i=0; i<arrayOfEquals.length; i++) {
			if(arrayOfEquals[i]==array2[i]) {
				continue;
			}
			else {
				System.out.println(array2[i]+" doesn't exist in Array 1");
				System.out.println();
				System.out.println("Array 2 is not a subset of Array 1");
				flag=false;
			}
		}
		if(flag==true) {
			System.out.println();
			System.out.println("Array 2 is a subset of Array 1");
		}			
	}
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,5,6,7,8,9,11,12,15,4,10,13,14};
		int[] arr2 = {3,5,11,9,7,13};
		
		Subset isSubset = new Subset();
		isSubset.checkSubset(arr1, arr2);

	}	

}
