//Leetcode 746: Min Cost Climbing Stairs
//https://leetcode.com/problems/min-cost-climbing-stairs/
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int first = cost[0];
        int second = cost[1];
        if (cost.length <= 2) return Math.min(first,second);
        for (int i = 2;i<cost.length;i++){
            int curr = cost[i] + Math.min(first,second); //At each step i, calculate the minimum cost to reach the current step (cost[i]) plus the minimum cost of reaching the previous two steps (first and second).
            first = second; //the minimum cost of reaching the previous step
            second = curr; //the minimum cost of reaching the current step
        }
        return Math.min(first,second); //return the smaller of the ways to go up the stairs
    }
}

// Method: DP-ish thinking
// 1. initicialize the base case to be reaching the first and second step (so it's really fast if the input is just 1 or 2 steps)
// 2. At each step i, calculate the minimum cost to reach the current step (cost[i]) plus the minimum cost of reaching the previous two steps (first and second). Then update first and second accordingly

//time complexity: O(N)
//space complexity: O(1)