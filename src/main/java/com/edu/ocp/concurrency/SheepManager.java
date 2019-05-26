package com.edu.ocp.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class SheepManager {

    private AtomicInteger sheepCount = new AtomicInteger(0);

    public synchronized void incrementAndReport() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print(sheepCount.incrementAndGet() + " ");
    }

    public static void main(String[] args) {
        ExecutorService executorService = null;

        try {
            executorService = Executors.newFixedThreadPool(20);
            SheepManager manager = new SheepManager();
            for (int i = 0; i < 10; i++) {
                executorService.submit(() -> manager.incrementAndReport());
            }
        } finally {
            if (executorService != null) {
                executorService.shutdown();
            }
        }
    }
}
