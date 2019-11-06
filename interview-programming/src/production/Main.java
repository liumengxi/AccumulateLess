package production;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * @Description 运行方法
 * @date 2019-11-05 17:46
 * @Copyright 2019 Alibaba.com All right reserved.
 */
public class Main {

    public static void main(String[] args) {
        Object lock = new Object();
        LinkedBlockingQueue<Momo> queue = new LinkedBlockingQueue();
        Producer producer = new Producer(queue, lock);
        Consumer consumer = new Consumer(queue, lock);

        Thread t1 = new Thread(producer);
        t1.start();
        Thread t2 = new Thread(consumer);
        t2.start();

    }

}
