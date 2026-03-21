package org.example;

import java.util.Arrays;
import java.util.concurrent.Callable;

public class ThreadSum implements Runnable {

    //10 thread
    int arr[] = new int [10];
    int start;
    int end;
    int answer ;
    public  ThreadSum(int arr[],int start, int end, int answer){
        this.arr =arr;

        this.start = start;
        this.end =end;
        this.answer = answer;


    }
    public  int getAnswer(){

        return  answer;
    }


    @Override
    public void run()  {
        for(int i = start; i <end; i++){
            answer +=arr[i];
        }
    }
}
