# Anthony's Leetcode Practice
Using Python or Java to answer leet code problems to prep for tech interviews

##### [Easy Problems]()
| # | Title | Solution | Time/Space Complexity | Methods/Notes | Date Completed | 
|---| -------- | ------------------ | --------------------------- | ------------- | -------------- |
|1| [Two Sum](https://leetcode.com/problems/two-sum/) | [Java](https://github.com/wena04/Leetcode/blob/85690f34068e4a91391a4766db8b6690bee7c1bc/Leetcode%201%20--%20Two%20Sum/Leetcode%201%20--%20Two%20Sum.java)| O(N)/O(N) | Hashmap to see if seen the target num subtracted by current number -> return value if have |May 25, 2024| 
|14| [Longest Common Prefix](https://leetcode.com/problems/longest-common-prefix/) | [Java](https://github.com/wena04/Leetcode/blob/d7d27ac71b70f7d9566ab615afac84129685606f/Leetcode%2014%20--%20Longest%20Common%20Prefix/Leetcode%2014%20--%20Longest%20Common%20Prefix.java) [Python](https://github.com/wena04/Leetcode/blob/d7d27ac71b70f7d9566ab615afac84129685606f/Leetcode%2014%20--%20Longest%20Common%20Prefix/Leetcode%2014%20--%20Longest%20Common%20Prefix.py)| O(N)/O(M) for both | set empty string, iterate through all the strings at once (need 2 for loops), return when i == len(s) or s[i] != strs[0][i] |Apirl 04, 2024| 
|118| [Pascal's Triangle](https://leetcode.com/problems/pascals-triangle/) | [Java](https://github.com/wena04/Leetcode/blob/0f886acbbdd7f63a668f7f362e996e2a221e7a60/Leetcode%20118%20--%20Pascal's%20Triangle/Leetcode%20118%20--%20Pascal's%20Triangle.java) [Python](https://github.com/wena04/Leetcode/blob/0f886acbbdd7f63a668f7f362e996e2a221e7a60/Leetcode%20118%20--%20Pascal's%20Triangle/Leetcode%20118%20--%20Pascal's%20Triangle.py)| O(N^2)/O(N^2) | Dynamic Programming -> every row is a list/array itself -> recursive calling itself to use previous row to calculate current row |May 25, 2024| 
|217| [Contains Duplicate](https://leetcode.com/problems/contains-duplicate/) | [Python](https://github.com/wena04/Leetcode/blob/21fb0a11987884bcb72061829a3f64b7200e2867/Leetcode%20217%20--%20Contains%20Duplicate/Leetcode%20217%20--Contains%20Duplicate.py) | M1: O(N^2)/O(1)</br>M2: O(NlogN)/O(logN) </br>M3: O(N)/O(N) | M1: Brute Force</br>M2: sort array first, compare adjacent elements</br>M3: put elements into HashMap -> containsKey then return true, else false |May 25, 2024| 
|671| [Second Minimum Node in a Binary Tree](https://leetcode.com/problems/second-minimum-node-in-a-binary-tree/) | [Java](https://github.com/wena04/Leetcode/blob/eb8b1b9897cdf58470cc669e66d36f331f3263c4/Leetcode%20671%20--%20Second%20Minimum%20Node%20In%20a%20Binary%20Tree/Leetcode%20671%20--%20671.%20Second%20Minimum%20Node%20In%20a%20Binary%20Tree.java) | O(N)/O(N) | DFS -- preorder traversal but custom towards this special kind of tree -> think case by case |Apirl 23, 2024| 
|746| [Min Cost Climbing Stairs](https://leetcode.com/problems/min-cost-climbing-stairs/) | [Java](https://github.com/wena04/Leetcode/blob/5cd08b86d8bfcaf7967f6ac85c8b778138783c5e/Leetcode%20746%20--%20Min%20Cost%20Climbing%20Stairs/Leetcode%20746%20--%20Min%20Cost%20Climbing%20Stairs.java) | O(N)/O(1) | DP -> base case first two steps -> loop curr = cost[i] + min(first,second), first = second, second = curr |Apirl 20, 2024| 

#### [Medium Problems]()
| # | Title | Solution | Time/Space Complexity | Methods/Notes | Date Completed | 
|---| -------- | ------------------ | --------------------------- | ------------- | -------------- |
|743| [Network Delay Time](https://leetcode.com/problems/network-delay-time/) | [Python](https://github.com/wena04/Leetcode/blob/41792a606a30dc40266732dbac2d95478525519c/Leetcode%20743%20--%20Network%20Delay%20Times/Leetcode%20%20743%20--%20Network%20Delay%20Time.py)| O(NLogN)/O(N) </br>O(E*logV) in terms of edges & vertex)| Dikjstra's Algorithm using MinHeap + stack to visit all nodes and see shortest path/weight |May 20, 2024|
|912| [Sort an Array](https://leetcode.com/problems/sort-an-array/) | [Java](https://github.com/wena04/Leetcode/blob/6149cfdb9388544b11d4f73c83fc9b003b580925/Leetcode%20912%20--%20Sort%20an%20Array/Leetcode%20912%20--%20Sort%20an%20Array.java)| O(NLogN)/O(logN) | merge sort |May 20, 2024|


#### [Hard Problems]()
| # | Title | Solution | Time/Space Complexity | Methods/Notes | Date Completed | 
|---| ----- | -------- | --------------------- | ------------- | -------------- |
