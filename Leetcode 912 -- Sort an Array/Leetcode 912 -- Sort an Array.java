//Leetcode 912: Sort an Array
// https://leetcode.com/problems/sort-an-array/
class Solution {
    public int[] sortArray(int[] nums) {
        /* bubble sort = too slow for large N
        for (int i = 0;i<nums.length;i++){
            for (int j = i+1;j<nums.length;j++){
                if(nums[i] > nums[j]){
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        return nums;
        */

        /*trying to write a selection sort found out same as bubble sort
        int current = 0;
        for (int i = 0;i<nums.length;i++){
            int min = nums[i];
            for (int j = i+1;j<nums.length;j++){
                if (min>nums[j]){
                    int temp = min;
                    min = nums[j];
                    nums[j] = temp;
                }
            }
            nums[i] = min;
        }
        return nums;*/

        //Trying to write merge sort
        mergeSort(nums,0,nums.length-1);
        return nums;
    }

    private void mergeSort(int[] nums, int start, int end){
        if (start<end){ // recursively calling the mergeSort until the array is only 1 value in it
            int mid = start + (end-start)/2;
            mergeSort(nums,start,mid);
            mergeSort(nums,mid+1,end);
            mergeSortHelper(nums,start,end,mid); //merges together the left and right side of the arrays after sorting passed in
        }
    }

    private void mergeSortHelper(int[] nums,int start, int end, int mid){
        int i = start;
        int j = mid+1;
        int[] temp = new int[end-start+1];
        int index = 0;
        while(i <= mid && j <= end){
            if (nums[i] < nums[j]){
                temp[index++] = nums[i++];
            } else {
                temp[index++] = nums[j++];
            }
        }//first subarray (the left half)
        while (i<=mid){
            temp[index++] = nums[i++];
        }

        while (j<=end){
            temp[index++] = nums[j++];
        }
        for (int y = start;y <= end;y++){
            nums[y] = temp[y-start];
        }
    }
}

//time complexity: O(NlogN)
//space complexity: O(logN) -- O(N) if arrays created in the process and not deleted