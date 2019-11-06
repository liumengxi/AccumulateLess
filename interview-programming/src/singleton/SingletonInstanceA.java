package singleton;

/**
 * @Description 单列实现A
 * @date 2019-11-05 16:01
 * @Copyright 2019 Alibaba.com All right reserved.
 */
public class SingletonInstanceA {

    private volatile static SingletonInstanceA singletonInstanceA;

    private SingletonInstanceA() {

    }

    /**
     * 提供外部创建方法
     * DCL 双检查机制
     * @return
     */
    public static SingletonInstanceA getSingletonInstanceA() {
        if (singletonInstanceA == null) {
            synchronized (SingletonInstanceA.class) {
                if (singletonInstanceA == null) {
                    singletonInstanceA = new SingletonInstanceA();
                }
            }
        }
        return singletonInstanceA;
    }

}
