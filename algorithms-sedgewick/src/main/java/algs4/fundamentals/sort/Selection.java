package algs4.fundamentals.sort;

/**
 * 选择排序： 不断的选择剩余元素中的最小值
 * 1. 每次遍历数组中最小的那个元素
 * 2. 将它和数组中无序状态的第一个元素交换
 *
 * 总的交换次数为 N 是固定的
 *
 * 缺点：
 * 1. 每一次的遍历并不会为下一次的遍历提供任何信息
 * 2. 同一份元素，有序数组和无序数组的效率是完全一样的
 */
public class Selection {


    /**
     * 每次选择的都是最小值，升序排列
     * @param nums
     */
    public static void sort(int[] nums){

        int len = nums.length;

        for(int i = 0; i < len; i++){
            int minIndex = i;
            for(int j = i+1; j < len; j++){
                if(nums[j] < nums[minIndex]){
                    minIndex = j;
                }
            }
            swap(nums,i,minIndex);
        }

    }

    private static void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) throws Exception{
        int[] nums = {10,9,8,7,6,5,4,3,2,1,0};
        sort(nums);
        for(Integer num:nums){
            System.out.print(num + " ");
        }
    }

}
