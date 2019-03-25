package array;
import java.util.Arrays;
public class SortAndSearch {
	
		public static void main(String[]args){	
	        int n = 8; 
			int[] arr = {1,6,5,8,9,5,6,2,9};
			int last=arr.length-1;  
	        int result = binarySearch(arr,0,last,n);  // NOTE: doing a binary search on an unsorted array would fail if i search for 5
	        if (result == -1){
	            System.out.println("Element not found!");
	        }
	        else{
	            System.out.println("Element found at index: "+result);  
	        }
	            bubbleSort(arr); // NOTE: put these in front of your binSearch and it will return the correct result
	            printArray(arr);
		} // NOTE: would be nice to have a blank line after each method
		static int[] bubbleSort(int[] array){	
			int n = array.length;
			for(int i = 0; i <n ; i++){
				for(int j = 1; j <n-1; j++){
					int a = array[j];
					int b = array[j+1];
					int c = 0;
					if(a>b){
						c = b;
						array[j+1] = a;
						array[j] = c;
					}
				}				
			}
			return array;
		}
		
		static void printArray(int[] array){   
		    for(int i=0; i < array.length; i++)
			{  
				System.out.print(array[i] + " ");  
			} 		    
		}		
		// NOTE: indentation is a little bit off from here
		
		    public static int binarySearch(int arr[], int first, int last, int n){  
		        if (last>=first){  
		            int middle = first + (last - first)/2;  
		            if (arr[middle] == n){  
		            return middle;  
		            }  
		            if (arr[middle] > n){  
		            return binarySearch(arr, first, middle-1, n); 
		            }
		            else{  
		            return binarySearch(arr, middle+1, last, n);  
		            }  
		        }  
		        return -1;  
		    }  	      
		
		   }
	//todo: Write a method bubbleSrt which gets an integer array as input and which sorts this array according to the bubblesort algorithm
	//If you don't know how bubblesort works you can read it here: http://www.pkirs.utep.edu/CIS3355/Tutorials/chapter9/tutorial9A/bubblesort.htm
	//Now write another method binSrch. This method again receives an integer array as input together with another integer n.
	//First, it sorts this array by using the bubblSrt method. Then, it searches for n.
	//You can look up the binary search algorithm here: https://www.khanacademy.org/computing/computer-science/algorithms/binary-search/a/binary-search
