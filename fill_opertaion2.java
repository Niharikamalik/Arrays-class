import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int arr[]= {2,4,5,6,4};
		Arrays.fill(arr,1);
		System.out.println(Arrays.toString(arr));
// 		rang 
       Arrays.fill(arr,1,4,2);
       System.out.println(Arrays.toString(arr));
    //   multidimension Array
    int arr1[][] = new int [2][3];
    for(int []row:arr1){
        Arrays.fill(row,2);
    }
    System.out.println(Arrays.deepToString(arr1));
		
	}
}
