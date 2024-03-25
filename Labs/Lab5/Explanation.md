1. The idea is to use in-order traversal and store each node you look at into an array/arraylist.
2. Then you run through the arraylist checking if its sorted. 
3. If it isn't sorted then it isn't a BST, otherwise it is a BST.
4. This works because the idea of a in-order traversal is that it goes from the left node, to the root node,then the right node. 