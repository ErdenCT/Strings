
public class DuplicatesMoreThanTwo {
	
	void duplicate(int index, int num, int[] n) {
		int count = 1;
		for(int i=index; i<n.length; i++) {
			if(num==n[i]&&num!=0) {
				n[i]=0;	
			System.out.println(num + " is used "+count+" times at index "+i);
			count++;	
		}
		}
	}
	public static void main(String[] args) {
		DuplicatesMoreThanTwo obj = new DuplicatesMoreThanTwo();
		
		int[] arr = {1,2,3,5,11,4,1,3,2,8,8,2,9,1,8,8};
		
		
		for(int i=0; i<arr.length; i++) {
			int c = arr[i];
			
		obj.duplicate(i, c, arr);

		}
	}
}

