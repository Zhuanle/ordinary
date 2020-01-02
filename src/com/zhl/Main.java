package com.zhl;

public class Main{
  public static void main(String[]args){
    int[] nums = {1,1,2};

    System.out.println(removeDuplicates(nums));
  }

  //去除重复数字
  public static int removeDuplicates(int[] nums) {
    // write your code here
    int size = nums.length;
    for(int  i = 0;i < size-1;i++){
      if(nums[i] == nums[i+1]) {
        for (int j = i; j < size - 1; j++) {
          nums[j] = nums[j + 1];
        }
        i--;
        size--;
      }
    }
    return size;
  }
}
