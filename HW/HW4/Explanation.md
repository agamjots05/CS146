Insertion Sort Time Complexities
1. Best Case: O(n) since if the list is already sorted then you would be going through the list 1 by 1 and checking whether the next selected value is less than, but because it's sorted that will never be the case, so the code will only run through the length of the array.
2. Worst Case: O(n^2) If it's sorted from greatest to least then you would have to make at worst cases n comparisons for every n elements.
3. Average Case: O(n^2) On average you won't have a sorted list therfore you will majority of the time have to do n comparisons for all n elements.

Matrix Multiplication 
1. Best Case: O(n^3) There isn't a specific best case for time complexity in matrix multiplication. In all cases, the nested loops takover majority of the execution time, resulting in O(n^3) complexity.
2. Worst Case: O(n^3) Similar to the best and average cases, the worst case demonstrates O(n^3) complexity. No matter how the elements in the matrices are arranged, the nested loops still execute n^3 times.
3. Average Case: O(n^3) The average case also is O(n^3) complexity. The nested loops contribute the most significant factor to the overall execution time, regardless of the specific values in the matrices.
