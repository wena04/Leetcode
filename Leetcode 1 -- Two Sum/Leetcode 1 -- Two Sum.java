//Leetcode 1: Two Sum
// https://leetcode.com/problems/two-sum/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        // HashMap solution
        int[] arr = new int[2]; //create array to store answer (index of 2 numbers that add up to target)
        HashMap<Integer, Integer> seen = new HashMap<>(); //Hashmap to store + search for the number and its index
        //remember HashMap is like Python Dictionary {key:value} or in this case {num : number's index}
        for (int i = 0;i<nums.length;i++){ //iterate through entire array (worse case)
            int diff = target - nums[i]; //set number we are trying to find -- "y"
            if (seen.containsKey(nums[i])){ //see if we already seen this number before (would have stored it if we did)
                arr[0] = seen.get(nums[i]); //put the index of diff (the value) into the answer array
                arr[1] = i; //put index of the "x" the number we have already
                return arr;
            }
            else{
                seen.put(diff,i); //put in diff (a possible target-x or "y") and the index to find it
            }
        }
        return arr; //returns empty array if nothing found
    }
}

//Time Complexity: O(N)
//Space Complexity: O(N)

//Key Idea: 
//set a number in the index to "x" and try to find the number "y" that would make it add up to the target number
//iterate through the array, setting the current value we are on, nums[i] to be "x" and searching through a HashMap that stores the key:value as nums:indexOf Nums, to see if we had seen the "y" we are trying to find before
//if we seen it before, get put the value and the current index "x" is stored in into a new array 
//else we put the "y" and its current index

//Example: {2,4,9,6,5}  target = 10
//          0 1 2 3 4 
//Iteration 1: x = nums[0] = 2, y = 10-2= 8,i = 0, seen = {8:0,}
//Iteration 2: x = nums[1] = 4, y = 10-4= 6,i = 1, seen = {8:0, 6:1}
//Iteration 3: x = nums[2] = 9, y = 10-9=1, i = 2, seen = {8:0, 6:1, 1:2}
//Iteration 4: x = nums[3] = 6, y = 10-6=4, i = 3, returns arr = {1,3} since seen 6 before


