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

    public static void basicBenchSort(String className,int nums[]){
        try{
            Class sortClass = Class.forName("algs4.fundamentals.sort."+className);
            Method sortMethod = sortClass.getMethod("sort",Integer[].class);

            long startTime = System.currentTimeMillis();
            sortMethod.invoke(sortClass.newInstance(),(Object)nums);
            long endTime = System.currentTimeMillis();

            assert isSorted( nums );
            System.out.println( sortClass.getSimpleName()+ " : " + (endTime-startTime) + "ms" );
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
