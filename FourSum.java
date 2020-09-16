/*
18. 4Sum
Given an array nums of n integers and an integer target, are there elements a, b, c, and d in nums such that a + b + c + d = target? Find all unique quadruplets in the array which gives the sum of target.

Note:

The solution set must not contain duplicate quadruplets.

Example:

Given array nums = [1, 0, -1, 0, -2, 2], and target = 0.

A solution set is:
[
  [-1,  0, 0, 1],
  [-2, -1, 1, 2],
  [-2,  0, 0, 2]
]
*/
class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        return ksum(nums, target, 0, 4);
    }
    public List<List<Integer>> ksum(int[] nums, int target, int start, int k){
        List<List<Integer>> res = new ArrayList<>(); 
        if(start == nums.length || nums[start] * k > target || nums[nums.length - 1] * k < target )
            return res;
        
        if(k == 2)
            return twosum(nums, target, start);
        for( int i = start; i < nums.length; i++){
            if( i == start || nums[i] != nums[i-1]){
                for(var set: ksum(nums, target - nums[i], i + 1, k - 1)){
                    res.add(new ArrayList<>(Arrays.asList(nums[i])));
                    res.get(res.size() - 1).addAll(set);
                }
            }
        }
        return res;
    }
    
    public List<List<Integer>> twosum(int[] nums, int target, int start){
        List<List<Integer>> res = new ArrayList<>();
        int i = start, j = nums.length - 1;
        while( i < j){
            int sum = nums[i] + nums[j];
            if(sum < target || i > start && nums[i] == nums[i-1])
                i++;
            else if( sum > target || j < nums.length - 1 && nums[j] == nums[j+1])
                j--;
            else
                res.add(new ArrayList<>(Arrays.asList(nums[i++], nums[j--])));
        }
        return res;
    }
}
