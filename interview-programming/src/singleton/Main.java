package singleton;

/**
 * @Description 启动类
 * @date 2019-11-05 16:11
 * @Copyright 2019 Alibaba.com All right reserved.
 */
public class Main {

    public static void main(String[] args) {

        SingletonInstanceA singletonInstanceA = SingletonInstanceA.getSingletonInstanceA();
        System.out.println(singletonInstanceA.hashCode());
        SingletonInstanceA singletonInstanceAA = SingletonInstanceA.getSingletonInstanceA();
        System.out.println(singletonInstanceAA.hashCode());


    }
}
