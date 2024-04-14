1. For this solution I wanted to use DFS, this is because I want to do all of the exploration before all of the traversal.
2. The idea is that you want to find a loop being made within this graph, if no loop is being made, then you're able to take the courses.
3. So the idea is to make a hashmap where you store each vertice and its respective prereqs.
4. Then you want to iterate through these courses and call your dfs helper method. 
5. Inside this DFS method you want to first check the base cases which include whether your current node is already being contained within the visted set. If thats the case that means you have made a loop, therfore you return false.
6. The other base case to check is whether using your current nodes key value returns an empty set. That means that you have an eligible path for your courses.
7. Then you want to recursively call DFS with all of its adjeceny nodes. 
8. After doing this you want to remove your current node that you're looking at from the set and put the arratList as empty for this node since you know that there is an eligible path for courses.