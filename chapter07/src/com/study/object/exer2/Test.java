package com.study.object.exer2;

/**
 * ClassName: Test
 * Package: com.study.object.exer2
 * Description:
 *
 * @Author wkm
 * @Create 2023/4/19 15:41
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        MyDate m1 = new MyDate(14, 3, 1976);
        MyDate m2 = new MyDate(14, 3, 1976);
        if (m1 == m2) {
            System.out.println("m1==m2");
        } else {
            System.out.println("m1!=m2"); // m1 != m2
        }

        if (m1.equals(m2)) {
            System.out.println("m1 is equal to m2");// m1 is equal to m2
        } else {
            System.out.println("m1 is not equal to m2");
        }
    }
}
