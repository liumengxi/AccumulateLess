package production;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * @Description TODO(这里用一句话描述这个类)
 * @Author wb-yzh498839@alibaba-inc.com
 * @date 2019-11-05 17:18
 * @Copyright 2019 Alibaba.com All right reserved.
 */
public class Producer implements Runnable {

    private LinkedBlockingQueue<Momo> linkedBlockingQueue;
    private Object lock;
    public static final int MAX = 30;

    public Producer(LinkedBlockingQueue linkedBlockingQueue, Object lock) {
        this.linkedBlockingQueue = linkedBlockingQueue;
        this.lock = lock;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                if (linkedBlockingQueue.size() >= MAX) {
                    try {
                        //如果馍馍也满，则不进行生产
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    //如果馍馍未满，则进行生产
                    linkedBlockingQueue.add(new Momo("9999"));
                    System.out.println("生产者开始生产馍馍，目前有 " + linkedBlockingQueue.size() + " 个馍馍");
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
