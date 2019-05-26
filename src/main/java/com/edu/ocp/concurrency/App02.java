package com.edu.ocp.concurrency;

import java.util.concurrent.*;

public class App02 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Future<Integer> submit1 = executorService.submit(() -> {
            System.out.println("barada_1");
            Thread.sleep(5000);
            return 1;
        });

        System.out.println(submit1.isDone());
        System.out.println(submit1.get());


        Future<?> submit2 = executorService.submit(() -> System.out.println("barada_2"));

        System.out.println(submit2.get());
        System.out.println(submit2.isDone());


        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();

        ScheduledFuture<?> scheduledFuture = scheduledExecutorService.schedule(() -> System.out.println("scheduled task is running..."), 3, TimeUnit.SECONDS);
        System.out.println(scheduledFuture.get());

        ScheduledFuture<?> fixedRate = scheduledExecutorService.scheduleAtFixedRate(() -> {
            System.out.println("scheduled task is running at fixed rate...");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, 2, 10, TimeUnit.SECONDS);


        ScheduledFuture<?> fixedDelay = scheduledExecutorService.scheduleWithFixedDelay(() -> {
            System.out.println("scheduled tsk is running with fixed delay...");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, 2, 10, TimeUnit.SECONDS);

        System.out.println("getDelay "+fixedDelay.getDelay(TimeUnit.SECONDS));
    }

}
