package com.problems.multithreading;
public class Utility {
    public static void main(String[] args) {

        SharedBuffer buffer = new SharedBuffer(3);
        Thread producer = new Thread(() -> {
            try{
                for(int i=1; i<=6; i++){
                    buffer.produce(i);
                }
            }catch (Exception ex){
                throw new RuntimeException(ex);
            }
        });

        Thread consumer = new Thread(() -> {
            for(int i=1; i<=6; i++){
                buffer.consume();
            }
        });
        producer.start();
        consumer.start();
    }

}
