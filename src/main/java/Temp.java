import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Temp {
	static int equilibrium(int arr[]) 
    { 
        int i, j; 
        int leftsum, rightsum; 
  
        /* Check for indexes one by one until  
           an equilibrium index is found */
        for (i = 0; i < arr.length; ++i) { 
  
            /* get left sum */
            leftsum = 0;   
            for (j = 0; j < i; j++) 
                leftsum += arr[j]; 
  
            /* get right sum */
            rightsum = 0; 
            for (j = i + 1; j < arr.length; j++) 
                rightsum += arr[j]; 
  
            /* if leftsum and rightsum are same,  
               then we are done */
            if (leftsum == rightsum) 
                return i; 
        } 
  
        /* return -1 if no equilibrium index is found */
        return -1; 
    } 
    // Driver code 
    public static void main(String[] args) 
    { 
        int arr[] = { -7, 1, 5, 2, -4, 3, 0 }; 
        int arr_size = arr.length; 
        System.out.println(equilibrium(arr)); 
    } 
} 
