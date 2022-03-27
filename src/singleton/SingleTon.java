package singleton;

/**
 * 单列模式的实现
 * 1 私有的构造方法
 * 2 私有的静态的当前类对象作为属性
 * 3 公有的静态方法返回当前的类对象
 **/
public class SingleTon {
    // 构造方法
    private SingleTon() {
    }

    // 属性
    private static SingleTon singleTon;

    // 方法
    public static SingleTon getSingleTon() {
        if (singleTon == null) {
            singleTon = new SingleTon();
        }
        return singleTon;
    }
}
