/*======================================
  class MergeSort
  Implements mergesort on array of ints.

  Summary of Algorithm: 
  1. Recieve a list. 
      a. If that list has a length greater than 1, split it in half and pass each half to two new thinkers. 
      b. If not, sort the list. Return it to the thinker that gave you the list.
  2. Recieve two sorted lists. Merge the two lists by
      a. Comparing the first item in both lists and taking the smaller item.
      b. Placing the smaller item in a new list. Now repeat step a until one of the lists is empty. When that happens, add the rest of the items of the longer list into the new list.
      When you finish merging the two lists, pass it back to the first thinker that gave you a list. 

  ======================================*/

public class MergeSort {

   /******************************************************
     * int[] merge(int[],int[]) 
     * Merges two input arrays
     * Precond:  Input arrays are sorted in ascending order
     * Postcond: Input arrays unchanged, and 
     * output array sorted in ascending order.
     ******************************************************/
    private static int[] merge( int[] a, int[] b ) 
    { 
	int[] retArr = new int[a.length + b.length];
	int aCounter = 0;
	int bCounter = 0;
	int index = 0;
        while (aCounter < a.length  && bCounter < b.length){
	    if (a[aCounter] < b[bCounter]){
		retArr[index] = a[aCounter];
		index++;
		aCounter++;
	    }
	    else {
		retArr[index] = b[bCounter];
		index++;
		bCounter++;
	    }
	}
	if (aCounter < a.length){
	    for (int x = aCounter; x < a.length; x++){
		retArr[index] = a[x];
		index++;
	    }
	}
	else if (bCounter < b.length){
	    for (int x = bCounter; x < b.length; x++){
		retArr[index] = b[x];
		index++;
	    }
	}
	return retArr;
    }//end merge()


    /******************************************************
     * int[] sort(int[]) 
     * Sorts input array using mergesort algorithm
     * Returns sorted version of input array (ascending)
     ******************************************************/
    public static int[] sort( int[] arr ) 
    {
	if (arr.length == 1){
	    return arr;
	}
	else{
	    int[] leftHalf = new int[arr.length/2];
	    for (int x= 0; x < leftHalf.length; x++){
		leftHalf[x] = arr[x];
	    }
	    int[] rightHalf = new int[(arr.length)-leftHalf.length];
	    int counter = 0;
	    for (int y = leftHalf.length; y<arr.length; y++){
		rightHalf[counter] = arr[y];
		counter++;
	    }
	    return merge (sort (leftHalf), sort(rightHalf));
	}
    }//end sort()



    //-------------------HELPERS-------------------------
    //tester function for exploring how arrays are passed
    //usage: print array, mess(array), print array. Whaddayasee?
    public static void mess( int[] a ) {
	for( int i = 0 ; i<a.length; i++ )
	    a[i] = 0;
    }

    //helper method for displaying an array
    public static void printArray( int[] a ) {
	System.out.print("[");
	for( int i : a )
	    System.out.print( i + ",");
	System.out.println("]");
    }
    //---------------------------------------------------


    //main method for testing
    public static void main( String [] args ) {


	int[] arr0 = {0};
	int[] arr1 = {1};
	int[] arr2 = {1,2};
	int[] arr3 = {3,4};
	int[] arr4 = {1,2,3,4};
	int[] arr5 = {4,3,2,1};
	int[] arr6 = {9,42,17,63,0,512,23};
	int[] arr7 = {9,42,17,63,0,9,512,23,9};

	System.out.println("\nTesting mess-with-array method...");
	printArray( arr3 );
	mess(arr3);
	printArray( arr3 );

	System.out.println("\nMerging arr1 and arr0: ");
	printArray( merge(arr1,arr0) );

	System.out.println("\nMerging arr4 and arr6: ");
	printArray( merge(arr4,arr6) );

	System.out.println("\nSorting arr4-7...");
	printArray( sort( arr4 ) );
	printArray( sort( arr5 ) );
	printArray( sort( arr6 ) );
	printArray( sort( arr7 ) );

    }//end main()

}//end class MergeSort

