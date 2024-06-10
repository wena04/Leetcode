//Leetcode 33: Search in Rotated Sorted Array
//https://leetcode.com/problems/search-in-rotated-sorted-array/
class Solution {
    public int search(int[] nums, int target) {
        //Method 1: Binary Search
        int left = 0;
        int right = nums.length-1;
        while (left <= right){
            int mid = (left + right) / 2;
            if (nums[mid] == target) return mid;

            //search the left portion
            if (nums[left] <= nums[mid]){
                if (target > nums[mid] || target < nums[left]){
                    left = mid + 1;
                }
                else {
                    right = mid - 1;
                }
            }

            //search the right portion
            else {
                if (target < nums[mid] || target > nums[right]){
                    right = mid - 1;
                }
                else {
                    left = mid+1;
                }
            }
        }
        return -1;
    }
}

//time complexity: O(N)
//space complexity: O(1)