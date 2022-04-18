DP template:
- When you are at a position and you don't know how many spaces to go further, whether to jump 1, 2 or 3 -> then we can guess that the problem uses dp
- For eg, in house robber, from a given index, where to go? Uses dp
​
5 approaches:
- Backtracking
- Top Down DP
- Bottom up DP (Better performance than top down)
- Greedy (Most optimized)
- Valley Peak Approach https://www.youtube.com/watch?v=muDPTDrpS28
​
​
Top-down to bottom-up conversion is done by eliminating recursion.
​
Backtracking: Involves all of the possible decisions (Time Comp: Slow) 2 power n
Recursive calls for every possible decision and we pick the optimal route among all the recursive calls.
​
Subproblems: From backwards, how can we reach the last cell? if we can reach, then how do we reach the second last cell because we have already seen that we can reach the last cell from the second last cell, so we don't need to check again and again (DP approach) - solving sub problems
​
Thinking Process:
- For finding the smaller subproblem, we need to know the certain answer and then build up to a larger subproblem.
- Here, we know the last index should be true. So we go from backwards and see how we can reach.
- We use two for loops : same logic how can we come from backwards