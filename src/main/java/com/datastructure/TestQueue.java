package com.datastructure;

import java.util.Random;

/**
 * 测试循环队列和数组队列的出栈时间的区别
 */
public class TestQueue {


    private static double testQueue(Queue<Integer> q, int opCount){
        long startTime = System.nanoTime();

        Random random = new Random();
        for (int i = 0; i < opCount; i++) {
            q.enqueue(random.nextInt(Integer.MAX_VALUE));
        }

        for (int i = 0; i < opCount; i++) {
            q.dequeue();
        }
        long endTime = System.nanoTime();

        return (endTime - startTime) / 1000000000.0;
    }


    public static void main(String[] args) {

        ArrayQueue<Integer> arrayQueue = new ArrayQueue<>();
        LoopQueue<Integer> loopQueue = new LoopQueue<>();
        System.out.println(testQueue(arrayQueue,100000));
        System.out.println(testQueue(loopQueue,100000));
    }
}
