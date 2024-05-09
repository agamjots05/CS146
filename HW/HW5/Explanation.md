**Part 1 Using Masters Method To Solve Recurrence Relations**
1. O(2^n) masters theorem for decreasing functions
2. O((3^n)(n)) masters theorem for decreasing functions
3. This is case 1 of masters theorem, so this is O(n^(log_2(9)))
4. For this question you can't use masters theorem, so I believe that the time complexity would be O(n^log_2(n)) since this time complexity will override all of the other values within the recurrence relation.
5. This is masters theorem case 2 part 2. Which is O(n^2 * log^2(n))
6. This is masters theorem case 1. So it's O(n^(log(base 2) (5))).

**Part 2 Solving Code**
1. Recurrence Relation: T(N) = 2T(N/2) + n
2. So time complexity using masters theorem case 2 part 1 is O(nlogn).
