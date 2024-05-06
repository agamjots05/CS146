The idea that I was leaning towards was the use of Dynamic programming, so that I would use some extra space in order to lower the time complexity.
What I will do is first start by creating an array with the length of the array being the number of fibo numbers we want to create.
Then I will create an array starting with 2 values of 0 and 1. 
Iteratively I will go across the number of required fibo numbers and add the previou 2 elements already in the array and add that as the third number.
