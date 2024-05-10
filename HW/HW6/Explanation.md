1. THe idea is to go through each of the elements in the array, lets say you choose the first one, and then find whether a two sum with the remaining elements
will add up to the negative of the number you're currently looking at.
2. Since we're using the two pointer approach for two sum, you will need to sort the list out. which will take O(nlogn)
3. So you first create your returning data type.
4. Then you want to start your for loop with i going only to arr.length - 2, since you cant create a triplet with only 2 elements.
5. Your condition to continue within the for loop will be when you don't have duplicate values, so you look at whether the arr[i-1] doesn't equal arr[i]
if that true, then you can continue.
6. Now you want to create your two sum 2 pointer approach, so you create your low and high variables and your target value to find a pair that adds to
0-arr[i]. So you can find a pair of numbers that adds to the negative of your current element inside the for loop.
7. Then you create a while loop where you continue while low < high, and check if low + high is equal to the sum, then you add this solution to solution set,
and then you want to change your low and high bounds so that you don't look at duplicates, So for each of low and high you create a while loop where you do low++
if arr[low+1] == arr[low] then you increment/decrement low and high.
8. Finally you check whether if your current sum is greater than you expected sum, then you increment your lower bound, otherwise increment your higher bound.
9. Return your array of arrays set.

