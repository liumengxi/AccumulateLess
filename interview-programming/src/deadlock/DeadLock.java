package deadlock;

/**
 * @Description 死锁案例
 * @author mengxi.zh
 * @date 2019-11-05 18:51
 */
public class DeadLock {

    private Object o1 = new Object();
    private Object o2 = new Object();

    public void methodA() {

        try {
            synchronized (o1) {

                System.out.println(Thread.currentThread().getName() + " 线程开始执行o1代码块。");
                Thread.sleep(3000);

                synchronized (o2) {
                    System.out.println(Thread.currentThread().getName() + " 线程开始执行o2代码块。");
                }

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void methodB() {
        try {
            synchronized (o2) {

                System.out.println(Thread.currentThread().getName() + " 线程开始执行o2代码块。");
                Thread.sleep(3000);

                synchronized (o1) {
                    System.out.println(Thread.currentThread().getName() + " 线程开始执行o1代码块。");
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
