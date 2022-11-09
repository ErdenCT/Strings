
public class BubbleSort {

	public static void main(String[] args) {
		int[] arr= {3,7,12,11,1,9,6,5,8,10,2,3,3};
		int temp=0;
		for(int i=0; i<arr.length; i++) {
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j]<arr[j-1]) {
					temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					
				}
				
			}
			
		}
		for(int i:arr)
			System.out.print(i+" ");	
	}

}
