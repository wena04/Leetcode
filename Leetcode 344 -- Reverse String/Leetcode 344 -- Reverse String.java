//Leetcode 344: Reverse String
//https://leetcode.com/problems/reverse-string/
class Solution {
    public void reverseString(char[] s) {
        //Method: two pointers, one at each end of the array, and then just swap characters
        //time complexity: O(N)
        //space complexity: O(1)
        int left = 0;
        int right = s.length-1;
        while (left < right){
            char temp = s[right];
            s[right] = s[left];
            s[left] = temp;
            left++;
            right--;
        }
    }
}