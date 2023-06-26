package org.study;

import java.awt.*;

/*
    java是一种强类型语言，主要基本数据类型如下：
    1. 数值型
        整数类型：byte,short,int,long
        浮点类型：float,double
    2. 字符型:char
    3. 布尔型:boolean
    引用类型如下：
    1. 类：class
    2. 接口：interface
    3. 数组
 */
public class a_Types {
    // 数值型
    byte b;  // 8bit
    short s;  // 16bit
    int i;   // 32bit
    long l;  // 64bit
    float f;  // 32bit
    double d;  // 64bit
    char c;  // 16bit
    boolean bool;  // 1bit
    int[] arr={1,2,3,4};
    void testTypes(){
        System.out.println("byte: "+this.b);
        System.out.println("short: "+this.s);
        System.out.println("int: "+this.i);
        System.out.println("long: "+this.l);
        System.out.println("float: "+this.f);
        System.out.println("double: "+this.d);
        System.out.println("char: "+this.c);
        System.out.println("boolean: "+this.bool);
        System.out.println("int[]: "+this.arr);
    }
    public static void main(String[] args){
        a_Types aTypes = new a_Types();
        aTypes.testTypes();

    }
}
