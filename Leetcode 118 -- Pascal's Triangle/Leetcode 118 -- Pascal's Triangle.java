//Leetcode 118: Pascal's Triangle
// https://leetcode.com/problems/pascals-triangle/
class Solution {
    public List<List<Integer>> generate(int numRows) {
        //initialize triangle: creating the first row of the pascal's triangle
        List<List<Integer>> result = new ArrayList<>(); //create the resultant list that stores the entire pascal's triangle
        List<Integer> begin = new ArrayList<>();
        begin.add(1);
        result.add(begin);
        // returning the base case
        if (numRows == 1){
            return result;
        }
        // recursively call ourselves to generate the rows of the previous triangle
        List<List<Integer>> reference = generate(numRows - 1);
        // create our current row now
        List<Integer> newRow = new ArrayList<>();
        for (int i = 0;i<numRows;i++){
            newRow.add(1);
        } // initialize it to be 1 in the beginning
        for (int i = 1;i<numRows-1;i++){
            newRow.set(i,reference.get(numRows - 2).get(i-1)+reference.get(numRows-2).get(i));
        } // add the left and right value of the previous row to get the value for our new row which is at numRows-1
        reference.add(newRow); // add our row to to the final pascal's triangle
        return reference; // returns our current triangle
    }
}

//Method 1: Dynamic Programming (DP) same as python version

// even though likely will not go to worse case, it is faster than most algorithms
// Time Complexity: O(N^2)
// Space Complexity: O(N^2)

// 1. each row is a different array containing different numbers
// 2. assume the most right and most left of each row has numbers 0
// 3. like the animation in the problem, use 2 different pointers to add the left and right of the previous row to get the value for this row

// Example 1: input numRows = 5
/* Iteration 1: we pass in 5 as numRows so base case won't run. get our previous row's array by calling itself. This recursive call will actually call 4 times in this case. Think going backwards. */
/*think about how we are going to create our current row: 1) have all thing in array be 1 first (use for loop) so current row be [1,1,1,1,1] in row 5. 2) have the middle numbers be previous previous row left + row right, making the current row be {1, previous row left + row right, 1} */


