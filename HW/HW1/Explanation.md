1. For this solution you're going to use the 2-pointer approach.
2. You will have your method compare the first and last elements.
3. If this comparison is true, you recursively call this function again with the current strings substring without its first and last element.
4. You continue till you reach the base case where your calling string is empty, or if theres only a length 1 string calling this function.