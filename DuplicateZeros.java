/*
Duplicate Zeros
Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining elements to the right.

Note that elements beyond the length of the original array are not written.

Do the above modifications to the input array in place, do not return anything from your function.

 

Example 1:

Input: [1,0,2,3,0,4,5,0]
Output: null
Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
Example 2:

Input: [1,2,3]
Output: null
Explanation: After calling your function, the input array is modified to: [1,2,3]
 

Note:

1 <= arr.length <= 10000
0 <= arr[i] <= 
*/
class DuplicateZeros {
    public void duplicateZeros(int[] arr) {
        int dup = 0;
        int len = arr.length - 1;
        for(int i = 0; i < arr.length - dup ; i++){
            if(arr[i] == 0){
                if(i + dup == len){
                    arr[len] = 0;
                    len--;
                    break;
                }
                dup++;
            }
            
        }
        int last = len - dup;
        for(int i = last; i >= 0; i--){
            if(arr[i] == 0){
                arr[i + dup] = 0;
                dup--;
                arr[i + dup] = 0;
            }
            else{
                arr[i + dup] = arr[i];
            }
        }
        
    }
}
