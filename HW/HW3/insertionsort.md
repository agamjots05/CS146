1. The time complexity for insertion sort for best case is O(n). This is because the algorithm makes it so that you start from the first element as the sorted list and you one by one add the other elements to the sorted list. If the list is sorted initially this will add all N elements and do only 1 comparison each, instead of multiple comparisons.
2. Time complexity for worst case for this algorithm will be O(N^2). This is because you will need to first add each elements N times. Then with each addition of an element, you will need to compare the current element will all of the previous elements within the sorted list so that you can put your current element in the correct position of the sorted list. If you do these N operations N times, you will get a total time complexity of O(n^2). This worst case happens when this list is sorted from greatest to least.
3. As for the average case, this is usually also O(n^2) as you will usually never get the desired sorted list as the initial inputted list. For this reason you can always assume the worst case which the time complexity of O(n^2).