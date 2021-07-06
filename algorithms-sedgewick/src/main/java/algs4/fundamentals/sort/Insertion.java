package algs4.fundamentals.sort;

import algs4.fundamentals.tool.SortHelper;

/**

 */
public class Insertion {
    /**

     * @param nums
     */
    public static void sort(int[] nums){

        int len = nums.length;

        for(int i = 1; i < len; i++){

            int cur = nums[i];
            int j;
            for(j = i; j>0 && nums[j-1] > cur; j--){
               nums[j] = nums[j-1];
           }
           nums[j] = cur;
        }

    }

    public static void main(String[] args) throws Exception{

        int n = 10000;
        int[] nums = SortHelper.generateNearlyOrderedArray(n,10);

        long startTime = System.currentTimeMillis();
        sort(nums);
        long endTime = System.currentTimeMillis();

        System.out.println( "【插入排序 is Sorted】: "+SortHelper.isSorted(nums)+ " : 【" + (endTime-startTime) + "ms】" );

    }

}
