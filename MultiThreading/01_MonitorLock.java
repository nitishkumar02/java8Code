package com.multithreading.monitorLock;

public class MonitorLockExample {
    public  synchronized void task1()  {
        System.out.println(Thread.currentThread()
                .getName());
        try {

            System.out.println("Inside Task1");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void task2()
    {
        System.out.println("ITask2,Before Synchronization");
        synchronized (this)
        {
            System.out.println("task 2, inside synchroonization");
        }
    }
    public void task3()
    {
        System.out.println("Inside task 3");
    }

    public static void main(String[] args)
    {

        MonitorLockExample obj = new MonitorLockExample();
        //MonitorLockExample obj2 = new MonitorLockExample();
        Thread t1 = new Thread( ()-> {  obj.task1(); }   );
        Thread t2 = new Thread( ()-> {  obj.task2(); }   );
        Thread t3 = new Thread( ()-> {  obj.task3(); }   );
        t1.start();
        t2.start();
        t3.start();
        //main thread
        System.out.println("main thread");
    }
}

