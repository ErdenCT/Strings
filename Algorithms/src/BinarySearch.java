import java.util.Scanner;

public class BinarySearch {
	
    
     public static void main(String[] args) { 
    	 
    	 int[] ar= {10,20,30,40,50,60,70,80,90,100};

         Scanner scan = new Scanner(System.in);
         System.out.println("Enter Key to be searched:");
         int key=scan.nextInt();
         int low=0;
         int high=ar.length-1;
          
         while(low<=high) {
        	 int mid=(low+high)/2;
        	 if(key==ar[mid]) {
        		 System.out.println("Key "+key+" found at index " + mid);
        		 System.out.println("(Binary search works in a Sorted Array!)");
        		 break;
        	 }
        	 else if(key<ar[mid]) {
        		 high=mid-1;
        	 }
        	 else if(key>ar[mid]) {
        		 low=mid+1;
        	 }
        	if(low>high) {
        		System.out.println("Key not found");
        	} 
         }
         
      }
}

