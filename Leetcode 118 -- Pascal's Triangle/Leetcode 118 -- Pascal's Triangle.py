//Leetcode 118: Pascal's Triangle
// https://leetcode.com/problems/pascals-triangle/
class Solution(object):
    def generate(self, numRows):
        """
        :type numRows: int
        :rtype: List[List[int]]
        """
        #initilize our triangle
        result = [[1]] #a List containing a List
        for i in range(numRows-1): #iterating through size of previous row, bascially from index 0 to numRows-2
            temp = [0] + result[-1] + [0] # initializing our previous row's array so that the most left and most right is 0
            row = [] #initializing the list for our current row
            #result[-1] will give us the last element in the list, which is another list containing our previous row
            for j in range(len(result[-1])+1): #iterating through enough times to create our current row now
                row.append(temp[j]+temp[j+1]) #add previous row left and right values to make our current row's array
            result.append(row) #add our row to our results triangle
        return result; #return it

        #Time complexity: O(n^2) where n is the number of rows 
        #Space complexity: O(n^2) where n is the number of rows