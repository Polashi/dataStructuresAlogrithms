package com.problems.multithreading;

public class SharedResource {
    boolean isItemAvailable = false;

    public synchronized void produceItem(){
        isItemAvailable = true;
        System.out.println("Producer thread produced items and notify all");
        notifyAll();
    }

    public synchronized void consumeItem(){
        System.out.println("Consumer thread starting to consume");
        while(!isItemAvailable){
            try{
                System.out.println("Consumer thread waiting for items to be created by producer");
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        isItemAvailable = false;
    }
}
