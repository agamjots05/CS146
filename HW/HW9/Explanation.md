What are some cases you need to look at?
Both p and q are on the left side.
    You need to continue on this side till you reach either the p or q node. Or till you find the node where p and q are on different sides
Both p and q are on the right side.
    You need to continue on this side till you reach either the p or q node. Or till you find the node where p and q are on different sides
Base Case: If p and q are on different side.
    You have reached the designated lowest common ancestor.

1. These are the main cases so the 2 base cases will be whether the node that you are currently looking at is either the p or q node. The second base case is that p and q are on opposite sides. In this case you would want to return the node that you're currently looking at.
2. THe recursive calls now consist of whether both your p/q nodes are either on the left or right side of the tree.
3. One of the hidden test cases I checked out were whether the root itself was the LCA.