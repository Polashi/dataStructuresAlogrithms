package com.problems.concurrency;
import java.util.concurrent.Semaphore;
public class PrintInOrder {
    public static void main(String[] args) {

    }

    Semaphore semaphore1;
    Semaphore semaphore2;
    Semaphore semaphore3;

    public PrintInOrder(){
        semaphore1 = new Semaphore(1); // max no of threads that can use the resource
        semaphore2 = new Semaphore(0);
        semaphore3 = new Semaphore(0);
    }

    public void first(Runnable runnable) throws InterruptedException {
        semaphore1.acquire();
        runnable.run();
        semaphore2.release();
    }

    public void second(Runnable runnable) throws InterruptedException{
        semaphore2.acquire();
        runnable.run();
        semaphore3.release();
    }

    public void third(Runnable runnable) throws InterruptedException{
        semaphore3.acquire();
        runnable.run();
        semaphore1.release();
    }
}
