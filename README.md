# mergeSort

We used two methods to collect data: print statements and System.currentTimeMillis(). Most of the
arrays we used to test it were generated using random numbers( Math.random() ).

1. Print Statements
	We used this to look at some of the smaller arrays. We edited the methods in MergeSort.java so
	that whenever an array was split, it printed the two parts, and whenever two arrays were merged,
	it printed the merged array. We then used this data to make a chart for each of the arrays. We 
	then looked at the charts to see how many times it ran through the array.
	
2. System.currentTimeMillis()
	We used this to test arrays of various sizes, and focused on larger ones that couldn't be tested
	using print statements. 
	
	
Our data from the tests can be found here: https://docs.google.com/document/d/1hX4gjmZuN02E8FFHmvnUpkgZ59ff1-vrnMRIiKP7i-4/pub

Run time: O(nlogn)

When the arrays are split, the arrays are split about log<sub>2</sub>n times. Since it takes the same
amount of merges, this part of the algorithm would be 2log<sub>2</sub>n, and the two is dropped to make
it logn. When merging, it has to go through the arrays to sort them. It goes through the arrays n times
the number of times it is split/merged, or nlogn.
