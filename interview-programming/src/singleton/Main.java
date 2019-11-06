package singleton;

/**
 * @Description TODO(这里用一句话描述这个类)
 * @Author wb-yzh498839@alibaba-inc.com
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
