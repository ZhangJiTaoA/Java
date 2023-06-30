package org.study;

/*
    面向对象三大特征：
            封装、继承、多态
        封装：
            1. 高内聚，低耦合
            2. 访问控制符：private、default（包内可见）、protected、public
            3. 类的属性一般private，类的方法一般public

        继承：  extends（扩展）
            1. java中类只有单继承，没有像c++一样的多继承
            2. java中接口可以多继承
            3. 如果没有调用extends，则其父类为：java.lang.Object（所有类的根基）
            4. instanceof 是二元运算符，右边是类，左边是对象
            当对象为右边类的子类或所创建的对象时，返回true，否则返回false
        多态；
            编译时多态：重写，重载
            运行时多态：父类指针指向子类对象（条件：继承，重写），
                    可以使用父类的所有成员和子类的重写成员，但不能调用子类的特有成员


    抽象类：包含了抽象方法的类
    抽象方法：只有声明的方法
        同c#，c++，格式略差

    接口：比抽象类更抽象的类，一个类可以实现多个接口（支持多继承），implements
        interface 接口就是规范，本质是契约
        写具体代码的时候前面加 I 吧


    内部类  innerClasses
        1. 可以直接访问外部类的私有属性，但是外部类不能访问内部类私有属性。
        2. 只能让外部类访问，不允许其他类直接访问

        成员内部类
            1. 非静态内部类：必须寄存在一个外部类对象中，里面不能有静态的变量方法。
            2. 静态内部类：不寄存在一个外部类对象中，被看作一个静态成员，不能访问外部类中的非静态成员，但可以访问外部类静态成员
            3. 匿名内部类：比如键盘监听器
            4. 局部内部类：定义在方法内的类
 */
public class f_objectOriented {
}
abstract class Animal{
    public abstract void run();
}
class Dog extends Animal {

    @Override
    public void run() {
        System.out.println("dog run");
    }
}

