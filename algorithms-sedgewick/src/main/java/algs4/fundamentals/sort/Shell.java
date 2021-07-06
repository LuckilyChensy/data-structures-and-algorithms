package algs4.fundamentals.sort;

import algs4.fundamentals.tool.SortHelper;

/**
    希尔排序算法
 */
public class Shell {
    /**

     * @param nums
     */
    public static void sort(int[] nums){

        int n = nums.length;

        // 起始间隔
        int h = 1;
        while(h < n/3){ h = 3*h + 1;}

        while(h >= 1){

            // 计数当前间隔方式最多循环次数
            for(int i = h; i < n; i++){
                int j = i;
                int cur = nums[i];
                for(;j >= h && nums[j-h] > cur;j-=h){
                    nums[j] = nums[j-h];
                }
                nums[j] = cur;
            }
            h /= 3;
        }

    }

    public static void main(String[] args) throws Exception{

        int n = 1000;
        int[] nums = SortHelper.generateRandomArray(n,0,n);

        long startTime = System.currentTimeMillis();
        sort(nums);
        long endTime = System.currentTimeMillis();

        System.out.println( "【希尔排序 is Sorted】: "+SortHelper.isSorted(nums)+ " : 【" + (endTime-startTime) + "ms】" );
    }

}
