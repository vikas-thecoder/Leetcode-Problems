/*Squares of a Sorted Array


Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number, also in sorted non-decreasing order.
Example 1:

Input: [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Example 2:

Input: [-7,-3,2,3,11]
Output: [4,9,9,49,121]
 

Note:

1 <= A.length <= 10000
-10000 <= A[i] <= 10000
A is sorted in non-decreasing order.
*/
class SortedSquare {
    public int[] sortedSquares(int[] A) {
        int i = 0 ,j = A.length - 1 ;
        int[] R = new int[A.length];
        for(int k = A.length -1; k >= 0; k--){
            int a = A[i] * A[i];
            int b = A[j] * A[j]; 
            if(a <= b){
                R[k] = b;
                j--;
            }
            else{
                R[k] = a;
                i++;
            }
        }
        
        return R;
    }
}
