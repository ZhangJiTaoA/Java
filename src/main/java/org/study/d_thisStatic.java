package org.study;
/*
    this本质上是创建好的对象的地址
    可调用构造器：this(),但是只能在构造方法中使用且位于第一句
    对象创建过程
        1. jvm类加载检查
        2. 内存分配
        3. 初始化默认值
        4. 设置对象头
        5. 执行初始化方法
    静态方法中不能使用this，因为静态方法全局只用一个，无法实例化，在方法区，属于类。
    static{

        }  // 静态初始化块。
    构造执行时先静态初始化块，后对象构造方法。

    参数值传递机制
    java中所有均是“值传递”！
    引用类型指的是“对象的地址”，因此，副本与原参数都指向同一“地址”，
    改变副本参数只想地址的值也就改变了原地址指向空间的值。

 */
public class d_thisStatic {
    static int a;
    static {
        a=7;
        System.out.println(a);
    }
    public d_thisStatic() {
        a=10;
        System.out.println(a);
    }
    public static void main(String[] args) {
        System.out.println(d_thisStatic.a);
        d_thisStatic dThisStatic = new d_thisStatic();
        System.out.println(d_thisStatic.a);
        d_thisStatic dThisStatic1 = new d_thisStatic();
        System.out.println(d_thisStatic.a);

    }
}
