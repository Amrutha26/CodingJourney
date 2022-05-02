So when it comes to DP, the first thing for us to figure out is the format of the sub problem(or the state of each sub problem).
- Brute Force solution: O(N cube) -> O(N squared) eliminating the other loop. two pointers and two for loops get the max sum and return
- This gives exponential time complexity
​
- We can decrease the time complexity by adding extra space
- Here, the extra space is the dp array
​
#### Kadane's Algorithm very very important
We carry the sum as long as it gives the resulting sum as positive
​
​