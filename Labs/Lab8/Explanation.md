1. The way I wanted to solve this question is to use dynamic programming.
2. In this case I would create my own custom array so that I can save time complexity at the cost of space. 
3. So I will start by creating an array with min_coins which will rpresente values from 1 to the amount desired
4. Then I will iterate over each of the amounts through nested for loops.
5. Within those for loops I will then calculate the minimum number of coins required.
6. Then finally I will return the result, if the value isn't equal to amount + 1 then you can return 1- otherwise return the valid amount.