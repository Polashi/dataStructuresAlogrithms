package com.problems.concurrency;

public class FooBar {
    private int n ;
    private boolean flag = true;

    public FooBar(int n){
        this.n = n;
    }

    public synchronized void printFoo(Runnable runner) throws InterruptedException{
        for(int i=0; i<n; i++){
            while(!flag){
                wait();
            }
            runner.run();
            flag = !flag;
            notify();
        }
    }

    public synchronized void printBar(Runnable runner) throws InterruptedException{
        for(int i=0; i<n; i++){
            while(flag){
                wait();
            }
            runner.run();
            flag = !flag;
            notify();
        }
    }
}
