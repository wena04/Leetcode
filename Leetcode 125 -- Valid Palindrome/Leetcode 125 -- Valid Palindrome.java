//Leetcode 125: Valid Palindrome
//https://leetcode.com/problems/valid-palindrome/
class Solution {
    public boolean isPalindrome(String s) {
        //Method 1: Using 2 pointers, one at start, one at end, then compare

        //time complexity: O(N)
        //space complexity: O(1)
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
                continue;
            }
            if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
                continue;
            }

            if (Character.toUpperCase(s.charAt(left)) != Character.toUpperCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }
        return true;
    }
}