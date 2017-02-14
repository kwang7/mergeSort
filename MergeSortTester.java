/*======================================
  class MergeSortTester

  ALGORITHM:
  1. If the length of the array is 1, mergeSort returns the array
  2. If the length of the array is greater than 1, it creates an array called leftHalf that
	 is the size of the original array divided by 2 (half of the length if even, one less than
	 half if it's odd), and fills the array by copying the first half of the elements of the 
	 original. It then creates a second array called rightHalf, which is the size of the original
	 minus the size of leftHalf, and fills it with the remaining elements. It then calls merge for
	 both of the arrays.
	 
  Merge:
  
  <INSERT YOUR DISTILLATION OF ALGO HERE>

  BIG-OH CLASSIFICATION OF ALGORITHM:
  <INSERT YOUR EXECUTION TIME CATEGORIZATION OF MERGESORT HERE>

  Mean execution times for dataset of size n:
  Batch size: <# of times each dataset size was run>
  n=1       time: 
  n=10      time: 
  n=100     time: 
  ...
  n=<huge>  time: 

  ANALYSIS:
  <INSERT YOUR RESULTS ANALYSIS HERE>
  ======================================*/

public class MergeSortTester 
{

    /******************************
     * execution time analysis 
     * <INSERT YOUR DESCRIPTION HERE OF 
     *  YOUR APPARATUS FOR GENERATING EXECUTION 
     *  TIME DATA...>
     ******************************/
    public static void main( String[] args ) 
    {
	int[] tester = new int[]{8,4,6,2,3,7,1,5};
	MergeSort.sort(tester);
    }//end main

}//end class
