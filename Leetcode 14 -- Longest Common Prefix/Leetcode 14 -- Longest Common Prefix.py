//Leetcode 14: Longest Common Prefix
// https://leetcode.com/problems/longest-common-prefix/
class Solution(object):
    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """

        #Method 2: going through every string the array of strings all at once (think vertical comparison)
        result = ""
        for i in range(len(strs[0])):
            for s in strs:
                if i == len(s) or s[i] != strs[0][i]: #if i is out of bounds or the current character in the string not equal to the one in the first string
                    return result
            result += strs[0][i] #add current character to the resulting string
        return result

        #Time Complexity: O(N)
        #Space Complexity: O(N)
        