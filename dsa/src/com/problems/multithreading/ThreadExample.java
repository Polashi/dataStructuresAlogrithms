package com.problems.multithreading;

public class ThreadExample {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        thread1.start();
        System.out.println(thread1.getName());

        Runnable thread2 = new MyRunnable();


        Thread thread3 = new Thread(thread2);
        System.out.println(thread3.getName());
        thread3.start();
    }

}

class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("Thread class here");
    }
}

class MyRunnable implements Runnable{
    @Override
    public void run(){
        System.out.println("Runnable class here");
    }
}
