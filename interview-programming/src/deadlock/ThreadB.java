package deadlock;

/**
 * @Description 线程b
 * @author mengxi.zh
 * @date 2019-11-06 10:04
 * @Copyright 2019 Alibaba.com All right reserved.
 */
public class ThreadB extends Thread {
    private DeadLock deadLock;

    public ThreadB(DeadLock deadLock) {
        this.deadLock = deadLock;
    }

    @Override
    public void run() {
        deadLock.methodB();
    }
}
