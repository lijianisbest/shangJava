package com.study.method.more.valuetransfer;

/**
 * ClassName: ValueTransferTest
 * Package: com.study.method.more.valuetransfer
 * Description:
 *
 * @Author wkm
 * @Create 2023/4/11 11:49
 * @Version 1.0
 */
public class ValueTransferTest {
    public static void main(String[] args) {
        //1. 基本数据类型的局部变量
        int m = 10;
        int n = m;  //传递的是数据值

        System.out.println("m = " + m + ", n = " + n);

        m++;

        System.out.println("m = " + m + ", n = " + n);

        //2. 引用数据类型的局部变量
        //2.1 数组类型
        int[] arr1 = new int[]{1, 2, 3, 4, 5};
        int[] arr2 = arr1;//传递的是地址值

        arr2[0] = 10;

        System.out.println(arr1[0]);//10

        //2.2 对象类型
        Order order1 = new Order();
        order1.orderId = 1001;

        Order order2 = order1; //传递的是地址值
        order2.orderId = 1002;

        System.out.println(order1.orderId);//1002
        System.out.println(order1 == order2);


    }
}

class Order {
    int orderId;
}

