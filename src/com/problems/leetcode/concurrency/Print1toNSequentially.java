package com.problems.leetcode.concurrency;
import java.util.concurrent.atomic.AtomicInteger;

public class Print1toNSequentially {
    public static void main(String[] args) throws InterruptedException{
        print(50);
    }
    public static void print(int N) throws InterruptedException{
        AtomicInteger count = new AtomicInteger(1);
        Thread thread1 = new Thread(() ->{
            for(int i=1; i<N/2; i++){
                System.out.println(Thread.currentThread().getName() + " using " + count.get());
                count.incrementAndGet();
            }
        });
        Thread thread2 = new Thread(() ->{
            for(int i=N/2; i<=N; i++){
                System.out.println(Thread.currentThread().getName() + " using " + count.get());
                count.incrementAndGet();
            }
        });
        thread1.start();
        thread1.join();
        thread2.start();
    }
}
