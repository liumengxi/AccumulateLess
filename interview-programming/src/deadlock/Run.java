package deadlock;

/**
 * @Description 启动类
 * @Author mengxi.zh
 * @date 2019-11-06 10:06
 */
public class Run {

    public static void main(String[] args) {
        DeadLock deadLock = new DeadLock();

        ThreadA threadA = new ThreadA(deadLock);
        ThreadB threadB = new ThreadB(deadLock);
        threadA.start();
        threadB.start();
    }

}
