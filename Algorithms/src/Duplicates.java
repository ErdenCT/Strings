
public class Duplicates {
	

	void duplicate(int index, int num, int[] n) {
		int count = 1;
		for(int i=index; i<n.length; i++) {
			if(num==n[i]) {
			if(count>1)	
			System.out.println(num + " is used "+count+" times.");
			count++;
			
			}
		}
	}
	
	public static void main(String[] args) {
		Duplicates obj = new Duplicates();
		
		int[] arr = {1,2,3,5,11,4,3,2,8,8,9,1};
		
		    for(int i=0; i<arr.length-1; i++) {
			int c = arr[i];
			obj.duplicate(i, c, arr);
				
		}
	}
}


