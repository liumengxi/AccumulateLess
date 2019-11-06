package singleton;

/**
 * @Description 单例内部类实现方式
 * @date 2019-11-05 16:08
 * @Copyright 2019 Alibaba.com All right reserved.
 */
public class SingletonInstanceB {

    private static class SingletonInstanceBInner {
        private static final SingletonInstanceB singletonInstanceB = new SingletonInstanceB();
    }

    private SingletonInstanceB() {

    }

    public static SingletonInstanceB getInstance() {
        return SingletonInstanceBInner.singletonInstanceB;
    }

}
