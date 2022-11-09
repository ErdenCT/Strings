
public class QuickSort {
	
	

	public static void main(String[] args) {
		int[] arr= {30,2,18,7,13,3,9,6,5,10};
		
		quickSort(arr, 0, arr.length-1);
		
		for(int i : arr) {
			System.out.print(i+" ");
		}
		
		
	}

	private static void quickSort(int[] array, int startIndex, int endIndex) {
		
		if(endIndex <= startIndex) return;
		int pivot = partition(array, startIndex, endIndex);
		quickSort(array, startIndex, pivot -1);
		quickSort(array, pivot +1, endIndex);
	}
	private static int partition(int[] array, int startIndex, int endIndex) {
		
		int pivot = array[endIndex];
		int i= startIndex-1;
		
		for(int j = startIndex; j<=endIndex-1; j++) {
			if(array[j]<pivot) {
				i++;
				int temp = array[i];
				array[i]=array[j];
				array[j]=temp;
			}
		}
		i++;
		int temp = array[i];
		array[i]=array[endIndex];
		array[endIndex]=temp;
		
		
		return i;
	}
}
