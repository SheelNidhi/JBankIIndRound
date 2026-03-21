package org.example;

public class ThtreadA extends  Thread{
    ThreadSum threadSum;
    int answer ;
    public int getSumOfArray(int arr[], int index){
        int sum =0;
        for(int i =0 ; i < index ; i++){
            sum += arr[i];

        }
        return sum;
    }
    public  void run(){

        int arr[] = new int[10];

        int index =5;
         answer = getSumOfArray(arr,5);
        System.out.println("ans"+answer);
    }
}
