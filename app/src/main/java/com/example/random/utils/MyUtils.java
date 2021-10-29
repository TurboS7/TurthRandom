package com.example.random.utils;

public class MyUtils {

  private int[] getArr(){
      int firstCount = 0;
//     int lastCount = 0;
      int[] firstArr = new int[5];
//     int[] lastArr = new int[2];
//     List<int[]> myArrList = new ArrayList<>();
      while (firstCount<5){
          int num_f = (int) (Math.random()*(35-1)+1);
          if (new Test().isNotExited(firstArr,num_f)){
              firstArr[firstCount] = num_f;
              firstCount++;
          }
      }
      for (int i = 0; i < firstArr.length; i++) {
          System.out.println(firstArr[i]);
      }
  }
    //    private
    private boolean isNotExited(int[] arr,int num){
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]){
                return false;
            }
        }
        return true;
    }
}
