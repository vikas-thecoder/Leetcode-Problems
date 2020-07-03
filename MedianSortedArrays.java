/*
Median of Two Sorted Arrays
There are two sorted arrays nums1 and nums2 of size m and n respectively.
Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
You may assume nums1 and nums2 cannot be both empty.

Example 1:
nums1 = [1, 3]
nums2 = [2]

The median is 2.0

Example 2:
nums1 = [1, 2]
nums2 = [3, 4]

The median is (2 + 3)/2 = 2.5
*/
class MedianSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int lenx=nums1.length;
        int leny=nums2.length;
        
      if(lenx>leny){
          return findMedianSortedArrays(nums2,nums1);
      }  
    
        int x=0,y=lenx;
        while(x<=y){
            int partx=(x+y)/2;
            int party=((lenx+leny+1)/2)-partx;
            
            if(partx>0 && (nums1[partx-1]>nums2[party])){
                y=partx-1;
            }
            else if(partx<lenx  && nums1[partx]<nums2[party-1])
                    x=partx+1;
            
            else {
             double medianleft=(partx==0)?nums2[party-1]:(party==0)?nums1[partx-1]:Math.max(nums1[partx-1],nums2[party-1]);   
                if((lenx+leny)%2!=0){
                    return medianleft;
                }
                double medianright=(partx==lenx)?nums2[party]:(party==leny)?nums1[partx]:Math.min(nums1[partx],nums2[party]);
                
                return (double)(medianleft+medianright)/2;
            }
        }
        
        return -1;
    }
}
