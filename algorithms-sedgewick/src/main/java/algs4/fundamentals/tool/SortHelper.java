package algs4.fundamentals.tool;

import java.lang.reflect.Method;

/**
 * @Description:
 * @Date:Created in 20:03 2021/7/6
 * @Author：soso
 */
public class SortHelper {

    private SortHelper(){}

    // 生成有n个元素的随机数组,每个元素的随机范围为[rangeL, rangeR]
    public static int[] generateRandomArray(int n, int rangeL, int rangeR) {

        assert rangeL <= rangeR;

        int[] nums = new int[n];

        for (int i = 0; i < n; i++){
            nums[i] = (int)(Math.random() * (rangeR - rangeL + 1) + rangeL);
        }

        return nums;
    }

    public static int[] generateNearlyOrderedArray(int n, int swapTimes){

        int[] arr = new int[n];

        for( int i = 0 ; i < n ; i ++ ){
            arr[i] = i;
        }

        for( int i = 0 ; i < swapTimes ; i ++ ){
            int a = (int)(Math.random() * n);
            int b = (int)(Math.random() * n);
            int t = arr[a];
            arr[a] = arr[b];
            arr[b] = t;
        }

        return arr;
    }
    public static void printArray(int[] nums){

        for (int i = 0; i < nums.length; i++) {
            System.out.print( nums[i] );
            System.out.print( ' ' );
        }
        System.out.println();
        return;

    }

    // nums 数组是否有序
    public static boolean isSorted(int[] nums){
        for( int i = 0 ; i < nums.length - 1 ; i++ ){
            if( nums[i]>(nums[i+1])  ){
                return false;
            }
        }
        return true;
    }

}
