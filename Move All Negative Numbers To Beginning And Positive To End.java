/*You are given an array 'ARR' consisting of 'N' integers. 
You need to rearrange the array elements such that all negative
 numbers appear before all positive numbers.*/
 
 import java.util.*;
public class Solution {
    public static ArrayList<Integer> separateNegativeAndPositive(ArrayList<Integer> nums) {

        for(int i=0;i<nums.size();i++)
        {
            for(int j=i+1;j<nums.size();j++)
            {
                if(nums.get(i)>nums.get(j))
                {
                    int temp=nums.get(i);
                   //ums.set(temp,i);
                    nums.set(i,nums.get(j));
                    nums.set(j,temp);
                }
            }
        }
        return nums;
    }
}