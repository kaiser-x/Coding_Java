//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//You can return the answer in any order.
//Example 1:
//
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Output: Because nums[0] + nums[1] == 9, we return [0, 1].

import java.util.*;
class Sol {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>hm=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            int check=target-nums[i];
            if(hm.containsKey(check)){
                return new int[]{i,hm.get(check)};
            }
            hm.put(nums[i],i);
        }
    throw new IllegalArgumentException("right ");
    }
}


public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,7,11,15};
		Sol obj=new Sol();
		int res[]=obj.twoSum(arr, 9);
		for(int i=0;i<2;i++)
			System.out.println(res[i]);

	}

}
