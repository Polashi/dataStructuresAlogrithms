package com.problems.multithreading;

import java.util.LinkedList;
import java.util.Queue;

public class SharedBuffer {
    private final Queue<Integer> sharedQueue ;
    private final int bufferSize;

    public SharedBuffer(int size){
        sharedQueue = new LinkedList<>();
        this.bufferSize = size;
    }

    public synchronized void produce(int item){
        try{
            while (sharedQueue.size() == bufferSize){
                System.out.println("Buffer queue size is already full, waiting for item to be consumed first");
                wait();
            }
            sharedQueue.add(item);
            System.out.println("Item is produced");
            notify();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public synchronized int consume(){
        try{
            while(sharedQueue.isEmpty()){
                System.out.println("Buffer queue is empty. Waiting for new item to be produced first");
                wait();
            }
            int item = sharedQueue.poll();
            System.out.println("Item is consumed");
            notify();
            return item;
        }catch (Exception ex){
            throw new RuntimeException(ex);
        }
    }
}
