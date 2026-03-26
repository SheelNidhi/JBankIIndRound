package org.example.threadsync;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

public class Manager2 {
    public static void main(String[] args) {
        Shared1 s1= new Shared1();
        Shared1 s2= new Shared1();
        Al a1 = new Al(s1,s2);
        a1.start();
        Bl b1 = new Bl(s1,s2);
        b1.start();
        Util.sleep(2000);
        ThreadMXBean tx = ManagementFactory.getThreadMXBean();
        long id[] = tx.findDeadlockedThreads();
        if(id.length >0){
            System.out.println("dead lock theard are");
            ThreadInfo t1[]=  tx.getThreadInfo(id);
            ThreadInfo threadInfo =null;
            for(int i = 0 ; i < t1.length; i++){
                threadInfo =t1[i];
                System.out.println(threadInfo.getThreadName());
            }
        } else {
            System.out.println("no dead locks are found");
        }

    }


}
