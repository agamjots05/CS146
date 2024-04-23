1. In this solution I'm going to be using union find and MST's to solve this
2. The idea is that you want to create an array with a 0 node which indicates if you create a connections by building a well within the house
3. After doing this you want to sort the pipes array so by subrstracing the costs between each house as the basis to sort the array. (I searched this part up how to sort an arary with special characteristics.)
4. Then you can use Kruskals algorithm to find the MST using the costs you have provided.


