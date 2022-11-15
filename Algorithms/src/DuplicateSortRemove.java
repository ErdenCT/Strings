

public class DuplicateSortRemove {
	
	private void findDups(int[] array) {

		System.out.println("Our array with duplicates:");
		for(int num:array) { 
			System.out.print(num+" ");}
		
		
		int[] noDups = new int[array.length];
		l1:for(int i=0; i<array.length;i++) {
			boolean flag=false;
			l2:for(int j=i+1; j<array.length; j++) {
			if(array[i]==array[j]) {
				noDups[i]=array[i];
				array[j]=0;
				flag=true;
				//noDups[array.length-(i+1)]=array[j];
				//continue l2;
				continue l1;
				//i++;
				}
			if(flag==false) {
				noDups[i]=array[i];
			}
			}
		}
		System.out.println("\nDuplicates replaced with zero:");
		for(int num:noDups) {
			System.out.print(num+" ");
		}
		int temp=0; //BubbleSort
		for(int i=0; i<noDups.length; i++) {
			for(int j=1;j<noDups.length-i;j++) {
				if(noDups[j]<noDups[j-1]) {
					temp=noDups[j];
					noDups[j]=noDups[j-1];
					noDups[j-1]=temp;	
				}	
			}	
		}
		System.out.println("\nArray without duplicates: ");
		for(int num:noDups) {
			System.out.print(num+" ");
		}
		int count=0; //number of zeroes
		for(int i=0; i<noDups.length;i++) {
			if(noDups[i]==0) {
				count++;
			}
		}
		System.out.println();
		int[] ultimate=new int[noDups.length-count];
		for(int i=0; i<ultimate.length; i++) {
			ultimate[i]=noDups[count+i]; //insert numbers after zero to ultimate array
		}
	
		System.out.println("Trimmed array:");
		for(int num:ultimate) {
			System.out.print(num+" ");
			}
	}
	
	public static void main(String[] args) {
		DuplicateSortRemove obj= new DuplicateSortRemove();
		int[] arr= {1,3,5,7,1,4,7,8,15,9,3,2,4,8,7};
		
		
		obj.findDups(arr);

	}	
}
