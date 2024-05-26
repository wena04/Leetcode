//Leetcode 14: Longest Common Prefix
// https://leetcode.com/problems/longest-common-prefix/
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0]; //start out with entire first string
        for (int i = 1; i < strs.length; i++) { //loop through the rest of strs one by one until we can find the prefix
            while (strs[i].indexOf(prefix) != 0) { //loooping through string on index i
                //check if the current string we are on has the prefix in  the beginning of it
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix; //return everything
    }
}

//Method 1: Brute Force method
// 1. Take first letter of first string, compare with the rest
// 2. If there is a match for all, add another letter
// 3. Repeat until no more letters left
// Time Complexity: n^2 (nested for loops)

//Method 2: comparing current string with every other string, same logic as python version
//where M is the length of the prefix, if we assume string i
//time complexity: O(N*M) or O(N)
//space complexity: O(M)

//GIVEN: ["flower","flow","flight"]
//Originally: prefix = "flower
//First Iteration of for loop: prefix = "flow"
//Second Iteration of for loop: prefix = "fl"

//references: https://www.youtube.com/watch?v=bl8ue-dTxgs
