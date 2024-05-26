#Leetcode 217: Contains Duplicate (Python)
#https://leetcode.com/problems/contains-duplicate/description/

class Solution(object):
    def containsDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        #Method 1: Brute Force Method -- check every number with every other number in the array
        for i in range(0,len(nums)):
            for j in range (i+1,len(nums)):
                if nums[i] == nums[j]: return True
        return False
        #time complexity: O(N^2) 
        #space complexity: O(1) since don't have to create new array, no extra memory

        #Method 2: Sort the array first, this way the same values would be next to each other
        nums = nums.sort()
        for i in nums:
            if nums[i] == nums[i+1]: return True
        return False
        #time complexity: O(NlogN) since built in sort uses timSort which is this time complexity
        #space complexity: O(logN) since will need to create arrays, and is like merge sort and insertion sort

        #Method 3: Using a set (basically a Hashset/Java's Hashmap)
        #sets cannot contain duplicate items while an array can, so the length will be different if there are duplicates
        return (len(set(nums)) != len(nums)) 

        #time complexity: O(N)
        #space complexity: O(N)


        
