import java.util.*;
public class Insertion_Sort {  
public static void sortInsertion(int [] sort_arr){

      for(int i=0;i<sort_arr.length;++i){
        int j = i;
        
        while(j > 0 && sort_arr[j-1]>sort_arr[j]){
          int key = sort_arr[j];
          sort_arr[j] = sort_arr[j-1];
          sort_arr[j-1] = key;
          j = j-1; 
        }
      }
    }

    public static void main( String args[] ) {
        int [] arr = {29,2,11,505,41,6,32,506};
        System.out.println("Original Array:" + Arrays.toString(arr)+"\n");
        
        sortInsertion(arr);
        
        System.out.println("Sorted Array:");
        
        for(int i=0;i<arr.length;++i){
          System.out.print(arr[i] + " ");
        }
    }
}  