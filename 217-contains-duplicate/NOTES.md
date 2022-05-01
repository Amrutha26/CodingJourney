Brute Force: Naive Linear Search method: using two pointers
​
Two different ways to solve this problem :
- Sorting  : Arrays.sort(nums); // Usually merge or quick sort O(NlogN)  // O(1) space if consecutive elements are same, then it contains duplicate
- HashSet : Only have distinct elements in them: If the element that we are going to add into the set is already present in the set, then it contains duplicate
​
- If you don't have space : use sorting since hashset has O(N) space
- If you want to have good time complexity: use hashset which is O(N)