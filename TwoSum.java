/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
*/

import java.util.*;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
    HashMap<Integer,Integer> a=new HashMap<>();
        int[] result=new int[]{0};
        for(int i=0;i<nums.length;i++){
            if(a.containsKey(nums[i])==false){
            a.put(target-nums[i],i);
            }
            else{
               result=new int[]{i,a.get(nums[i])} ;
            }
        }
       return result; 
    }
}
