package production;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * @Description 消费者
 * @date 2019-11-05 17:35
 * @Copyright 2019 Alibaba.com All right reserved.
 */
public class Consumer implements Runnable {
    private LinkedBlockingQueue<Momo> linkedBlockingQueue;
    private Object lock;

    public Consumer(LinkedBlockingQueue<Momo> linkedBlockingQueue, Object lock) {
        this.linkedBlockingQueue = linkedBlockingQueue;
        this.lock = lock;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                if (linkedBlockingQueue.size() == 0) {
                    //如果馍馍没有了，需要等待
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    //进行消费
                    linkedBlockingQueue.poll();
                    System.out.println("消费者开始吃馍馍，目前还剩余 " + linkedBlockingQueue.size() + " 个馍馍！");
                    lock.notifyAll();
                }
            }
            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
