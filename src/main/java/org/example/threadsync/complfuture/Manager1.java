package org.example.threadsync.complfuture;

import java.util.Arrays;
import java.util.List;

public class Manager1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
      Integer ans=  list.stream().reduce(MyUtil::sum).get();
        System.out.println("ans"+ans);
    }
}
