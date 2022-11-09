
public class SelectionSort {

	public static void main(String[] args) {
		int [] arr = {3,5,9,11,6,7,8,4,2,1,10};
		
		selectionSort(arr);
		
		for(int i : arr) {
			System.out.print(i+" ");
		}

	}

	private static void selectionSort(int[] array) {
		
		for(int i=0; i<array.length-1; i++) {
			int min = i;
			for(int j=i+1; j<array.length; j++) {
				if(array[min]>array[j]) {
					min = j;
				}
			}
			int temp = array[i];
			array[i]=array[min];
			array[min]=temp;
		}
	}

}
