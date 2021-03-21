package algs4.fundamentals;

import edu.princeton.cs.algs4.In;

public class Selection {

    public static void sort(Comparable[] arr){

        int arrLen = arr.length;

        for(int i  = 0; i < arrLen; i++){
            int maxIndex = i;
            for(int j = i+1; j < arrLen; j++){
                if(less(arr[j],arr[maxIndex])){
                    maxIndex = j;
                }
            }
            swap(arr,i,maxIndex);
        }

    }

    private static boolean less(Comparable m,Comparable n){
        return m.compareTo(n) < 0;
    }

    private static void swap(Comparable[] arr,int i,int j){
        Comparable t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    private static void show(Comparable[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    private static boolean isSorted(Comparable[] arr){
        for(int i = 1; i < arr.length; i++){
            if(less(arr[i],arr[i-1])){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] strArr = new In().readAllStrings();
        sort(strArr);
        assert isSorted(strArr);
        show(strArr);
    }
}
