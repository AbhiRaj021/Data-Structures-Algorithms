/*
 * Example Input
Input 1:

 A = [5, -2, 3 , 1, 2]
 B = 3
Input 2:

 A = [1, 2]
 B = 1


Example Output
Output 1:

 8
Output 2:

 2
 */

/* Problem Description
Given an integer array A of size N.

You have to pick exactly B elements from either left or right end of the array A to get the maximum sum.

Find and return this maximum possible sum.

NOTE: Suppose B = 4 and array A contains 10 elements then

You can pick the first four elements or can pick the last four elements or can pick 1 from the front and 3 from the back etc. you need to return the maximum possible sum of elements you can pick. */



/*  public class Solution {
  public int solve(ArrayList<Integer> A, int B) {
      
      int n = A.size();
      
      int sum1 = 0;
      int sum2 = 0;
      
      for(int i=0; i<B; i++){
          sum1 += A.get(i);
      }
      sum2 = sum1;
      
      for(int i=B-1, j=n-1; i>=0; i--, j--){
          sum1 -= A.get(i);
          sum1 += A.get(j);
          
          sum2 = Math.max(sum2, sum1);
      }
      return sum2;
  }
} */
