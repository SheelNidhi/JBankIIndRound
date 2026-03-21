package org.example;

public class ThraedB extends  Thread{
    int ans;
    public int getSumOfArray(int arr[], int index){
        int sum =0;
        for(int i =0 ; i < index ; i++){
            sum += arr[i];

        }
        return sum;
    }
    public  void run(){
        int arr[] = new int[10];
        int index =10;
         ans = getSumOfArray(arr,5);
        System.out.println("ans"+ans);
    }

}
