//Converting From Adjacency List to Matrix 
Few Assumptions I'm Making:
1. Assuming this List is using a an ArrayList<ArrayList<Integer>> datatype. 
2. Another assumption is that the vertices will be starting from 0,1,2,3,... instead of 1,2,3,...
3. Final assumption is that inside the arraylist if a node has no vertices it will just be an empty arraylist within the arraylists of arraylists.


<!-- SOLVING THOUGHT PROCESS -->


<!-- Converting from List to Matrix -->

1. First you will be creating the size of the 2d array that represents the matrix.

2. To solve this you will be just finding the size of the arraylist with arr.size() method. This will represent the n*n 2d matrix size.
3. After initializing your 2d matrix with 0's you will then traverse through the adj list and adding the elements you see within the list to the correct position within the 2d array.
4. To do this you will need to traverse through the Adjacency List most likely using nested for loops and adding the current elements value to the matrix.

<!-- Comverting from Matrix To List. -->
1. For this implementation You will first instantiate your List using Nested Arraylists.
2. Then you will traverse through the 2d array using nested for loops.
3. Then for each element that has a value of 1, you will add the index value to the array list. And just ignore the values that have 0's
4. You will continue this process till you reach the end of the 2d array which means that you're done.

<!-- Reversing Direction -->
1. THe thought process I was thinking about was to hav 2 adjacency lists the old one and the new one. 
2. In this case I would most likely use a nested for loops where the outer loop will be from i to the length of the adj list. And the inner would also be the same. 
3. However the key idea is that you want to add the .get(j).add(i), this way you would swap the order of the adjacency, in turn reversing the direction.   
