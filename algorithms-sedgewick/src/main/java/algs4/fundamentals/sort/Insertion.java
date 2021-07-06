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
           for(int j = i; j>0 && nums[j] < nums[j-1]; j--){
               swap(nums,j,j-1);
           }
        }

    }

    private static void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) throws Exception{
        int n = 10000;
        int[] nums = SortHelper.generateRandomArray(n,0,n);

        long startTime = System.currentTimeMillis();
        sort(nums);
        long endTime = System.currentTimeMillis();

        System.out.println( " 插入排序 is Sorted: "+SortHelper.isSorted(nums)+ " : " + (endTime-startTime) + "ms" );

    }

}
