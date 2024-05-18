1. My thought process to solve this question is to use the 2 pointer approach.
2. What I will do is create 2 arrays, one with information about the starting times, and the other array holding all of the ending times. I will also sort these 2 arrays.
3. I will also create a counter storing the information regarding the number of servers.
3. Then I will use two pointers each starting at the beginning of each array.
4. Then I will compare each of the pointers and whichever is lower will move up one space.
5. If the pointer on the start time is smaller, then you incremenent the counter by 1 representing that this worker needs to start working. If the end time is smaller than the start time, that means that a worker can stop working thus decrementing the worker counter