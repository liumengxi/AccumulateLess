package deadlock;

/**
 * @Description 线程A
 * @Author mengxi.zh
 * @date 2019-11-06 10:03
 * @Copyright 2019 Alibaba.com All right reserved.
 */
public class ThreadA extends Thread {

    private DeadLock deadLock;

    public ThreadA(DeadLock deadLock) {
        this.deadLock = deadLock;
    }

    @Override
    public void run() {

        deadLock.methodA();

    }
}
