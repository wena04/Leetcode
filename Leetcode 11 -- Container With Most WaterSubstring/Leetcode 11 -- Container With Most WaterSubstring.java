//Leetcode 11: Container With Most Water
//https://leetcode.com/problems/container-with-most-water/
class Solution {
    public int maxArea(int[] height) {
        //height: height in index 1 * height in index 2
        //width: index 2 - index 1

        //Method 1: two pointers, starting at opposite ends, move smaller pointer after testing area
        int area = 0;
        int left = 0;
        int right = height.length-1;
        while (left < right){
            int width = right - left;
            area = Math.max(width*Math.min(height[right],height[left]),area);
            if (height[left] < height[right]) left++;
            else right--;
        }
        return area;
    }
}

//time complexity: O(N)
//space complexity: O(1)