public class BubbleSort {  
    static void bubbleSort(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j]){  
                                 //swap elements  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }                            
                 }  
         }    
    }  
    public static void main(String[] args) {  
                int arr[] ={43,601,395,45,25,39,75,33,101,106};  
                 
                System.out.println("Array Before Bubble Sort:");  
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }  
                System.out.println(); 
                System.out.println();
                  
                bubbleSort(arr);//sorting array elements using bubble sort  
                System.out.println("Array After Bubble Sort:");  
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }  
                }  
}  
