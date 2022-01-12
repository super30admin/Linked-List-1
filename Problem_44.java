//Problem - 44

// Time Complexity : O(N^2) where N is the number of rows

// Space Complexity :  O(N^2)

// Did this code successfully run on Leetcode :
//Yes

// Your code here along with comments explaining your approach 
//we need to add the first row as element 1 and the following rows will be generated with the following approach
//in this approach we want to update the current row element with the sum of the previous row element that are 
//diagonally above it in a honeycomb structure

//so we set the jth row element with the sum of those above it and then add that row
public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> allrows = new ArrayList<List<Integer>>();
        List<Integer> row = new ArrayList<Integer>();
        for (int i = 0; i < numRows; i++) {
            row.add(0, 1);
            for (int j = 1; j < row.size() - 1; j++)
                row.set(j, row.get(j) + row.get(j + 1));
            allrows.add(new ArrayList<Integer>(row));
        }
        return allrows;
    }
}