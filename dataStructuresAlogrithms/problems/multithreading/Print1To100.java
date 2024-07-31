package com.problems.multithreading;

// Print 1 to 100 number with multiple threads
public class Print1To100 implements Runnable{
    int start = 0;
    int end = 0;
    public Print1To100(int start, int end){
        this.start = start;
        this.end = end;
    }

    @Override
    public void run(){
        for(int i=start; i<=end; i++){
            System.out.println(Thread.currentThread().getName() + ": "+ i);
        }
    }
    public static void main(String[] args) {
        int numberOfThreads = 2;
        int numberPerThreads = 4;

        for(int i=0; i<numberOfThreads; i++){
            int start = i*numberPerThreads + 1;
            int end = (i+1) * numberPerThreads;

            Thread thread = new Thread(new Print1To100(start, end));
            thread.start();
        }
    }


}
