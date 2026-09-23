package org.example.exutorService;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class CallbleLambdaeXmple5 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        long time = System.currentTimeMillis();
          int a =2;
         int  b =3;
        List<Callable<Long>> tasks = new ArrayList<>();
        for(int i = 0; i <1000 ; i++) {
            tasks.add(
             () -> {
                int sum = 0;
                sum = a + b;
                return (long) sum;
            });
        }

        ExecutorService executorService = Executors.newFixedThreadPool(1000);
       List <Future<Long>> futures =executorService.invokeAll(tasks);
        int result = 0;
        for(Future<Long> future: executorService.invokeAll(tasks)){
            result += future.get();

        }
        long ot= System.currentTimeMillis();
        long as= ot -time;
        System.out.println("ans" + as);
    }
}
