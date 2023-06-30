package org.study;
/*
    字符串
    其自带的函数不再赘述
    主要是String，StringBuilder和StringBuffer三者区别
    String:
        1. 其内部使用final关键字修饰，因此是不可变序列
        2. 通过字面量的方式（区别于new）给一个字符串赋值，此时字符串值生命在常量池中。
        3. 字符串常量池中不存储相同内容的字符串。
        4. 对字符串重新赋值时，改变的是字符串指向内存地址，而不是原有字符串

    StringBuffer:
        1. 可变字符序列
        2. 线程安全
        3. 效率低
        4. 多线程操作字符串，
    StringBuilder:
        1. 可变字符序列
        2. 速度更快
        3. 线程不安全
        4. 单线程操作字符串
 */
public class h_String {
    public static void main(String[] args) {

    }
}
