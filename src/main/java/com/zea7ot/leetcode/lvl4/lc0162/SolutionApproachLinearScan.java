/**
 * https://leetcode.com/problems/find-peak-element/
 */
package com.zea7ot.leetcode.lvl4.lc0162;

public class SolutionApproachLinearScan {
    public int findPeakElement(int[] nums) {
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] > nums[i + 1]){
                return i;
            }
        }
        
        return nums.length - 1;
    }
}