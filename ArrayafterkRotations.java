//Rotate number k time
public class ArrayafterkRotations
{
	public static void main(String[] args) {
	    int[] arr= {1, 2, 3, 4, 5, 6}; int d = 2;
	    int start = 0;
	    
	   for(int i = 0; i<d; i++){
	       start = arr[arr.length-1];
	       
	       for(int j=arr.length-1; j>0; j--){
	           arr[j] = arr[j-1];
	       }
	       
	       arr[0] = start;
	   }
	    
		for(int i = 0; i<arr.length; i++){
		    System.out.print(arr[i]+" ");
		}
	}
}
