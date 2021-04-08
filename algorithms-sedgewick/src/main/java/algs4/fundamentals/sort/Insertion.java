package algs4.fundamentals.sort;

import algs4.fundamentals.bean.Student;

/**
 *  遍历数组，每次与前面已排序的元素比较，如果小于目标，交换两者位置
 *  理想条件下，数组已经有序，那只需要遍历一遍即可
 *
 *  缺点：
 *  每次交换也是耗时的，所以插入排序下列的排序实现，性能并没有提升太多
 *  时间复杂度O(N2)
 *  空间复杂度O(1)
 */
public class Insertion {

    /**
     * 每次选择的都是最小值，升序排列
     * @param arr
     */
    public static void sort(Comparable[] arr){

        int N = arr.length;

        for(int i  = 1; i < N; i++){

            for(int j = i; j > 0 && less(arr[j],arr[j-1]); j--){
                exch(arr,j,j-1);
            }

        }

    }

    private static boolean less(Comparable m,Comparable n){
        return m.compareTo(n) < 0;
    }

    private static void exch(Comparable[] arr, int i, int j){
        Comparable t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    private static void show(Comparable[] arr){

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();

    }
    // 确认排序后数组元素是否有序
    private static boolean isSorted(Comparable[] arr){
        for(int i = 1; i < arr.length; i++){
            if(less(arr[i],arr[i-1])){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws Exception{

        String[] strArr = SortTestHelper.readStringFromResource("words3.txt");

        SortTestHelper.testSort("algs4.fundamentals.sort.Insertion", strArr);

        System.out.println("升序排列结果");
        show(strArr);

        System.out.println("--------------------------------------------------------------------------------");

        Student[] objectArr = new Student[4];

        objectArr[0] = new Student("D",90);
        objectArr[1] = new Student("C",100);
        objectArr[2] = new Student("B",95);
        objectArr[3] = new Student("A",95);

        SortTestHelper.testSort("algs4.fundamentals.sort.Insertion", objectArr);
        System.out.println("升序排列结果");
        show(objectArr);

        System.out.println("--------------------------------------------------------------------------------");

        Integer[] numArr = SortTestHelper.generateRandomArray(20000,0,100000);
        SortTestHelper.testSort("algs4.fundamentals.sort.Insertion", numArr);
        System.out.println("升序排列结果");
        show(numArr);

    }

}
