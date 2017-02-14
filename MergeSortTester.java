/*======================================
  class MergeSortTester

ALGORITHM:
Sort:
  1. If the length of the array is 1, mergeSort returns the array
  2. If the length of the array is greater than 1, it creates an array called leftHalf that
	 is the size of the original array divided by 2 (half of the length if even, one less than
	 half if it's odd), and fills the array by copying the first half of the elements of the 
	 original. It then creates a second array called rightHalf, which is the size of the original
	 minus the size of leftHalf, and fills it with the remaining elements. It then calls merge for
	 the arrays.
	 
  Merge:
  1. Create counters for both lists a and b and set them to 0. Create a new array. The size of the new
    array is the length of both of the small arrays added together.
  2. While both of the counters are less than the lengths of their lists, find which of the elements 
  at those counters is smaller. Add the element that is smaller to the array and increase the counter
  for the array it came from by 1.
  3. When one of the counters reaches the length of its array, check to see if one of the arrays’ 
  counters still hasn’t reached the length. Add the remaining elements in that array to the end of the sorted array. Return the array.


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
	
	/*	int[] tester1 = new int[]{7};
	int[] tester10 = new int[]{8,4,6,2,9,3,7,1,10,5};
	double a = System.currentTimeMillis();
	System.out.println("Testing mergeSort on array of size 1......\n");
	System.out.println("Original array: " + MergeSort.printArray(tester1));
	MergeSort.sort(tester1);
	double b = System.currentTimeMillis();
	System.out.println("Time(milli): " + (b-a));
	
	System.out.println("\n");
	double x = System.currentTimeMillis();
	System.out.println("Testing mergeSort on array of size 10......\n");
	System.out.println("Original array: " + MergeSort.printArray(tester10));
	MergeSort.sort(tester10);
	double y = System.currentTimeMillis();
	System.out.println("Time = " + (y-x));*/

	int[] arr = new int[10000];
	int n = 0;
	while(n<10000){
	    arr[n] = (int) (Math.random() * 10000);
	    n++;
	}
	double a = System.currentTimeMillis();
	MergeSort.sort(arr);
	double b = System.currentTimeMillis();
	System.out.println("Time= " + (b-a));

    }//end main

}//end class
