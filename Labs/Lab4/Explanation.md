1. For this approach I used the recursive method where my base case would be that my node that I'm looking at
is null.
2. If not null, then I swap children and call this method again for each of the left and right child.
3. At the end I would print my current node.
4. Some of the edge cases that I covered include the if a node is missing a child, if a node is missing both childer,
and if the tree is skewed left/right.