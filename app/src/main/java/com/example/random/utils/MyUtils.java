package com.example.random.utils;

public class MyUtils {
    /**
     * 获取数组
     * @param length
     * @param maxNum
     * @return
     */
    public int[] getArr(int length,int maxNum){
        int firstCount = 0;
        int[] arr = new int[length];
        while (firstCount<length){
            int num_f = (int) (Math.random()*(maxNum-1)+1);
            if (isNotExited(arr,num_f)){
                arr[firstCount] = num_f;
                firstCount++;
            }
        }
        Arrays.sort(arr);
        return arr;
    }

    /**
     * 判断是否重复
     * @param arr
     * @param num
     * @return
     */
    public boolean isNotExited(int[] arr,int num){
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]){
                return false;
            }
        }
        return true;
    }

}
