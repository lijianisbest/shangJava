package com.study.method.more.recursion.exer2;

/**
 * ClassName: RabbitExer
 * Package: com.study.method.more.recursion.exer2
 * Description:
 * 案例：不死神兔
 * 用递归实现不死神兔：故事得从西元1202年说起，话说有一位意大利青年，名叫斐波那契(Fibonacci)。
 * 在他的一部著作中提出了一个有趣的问题：假设一对刚出生的小兔一个月后就能长成大兔，
 * 再过一个月就能生下一对小兔，并且此后每个月都生一对小兔，没有发生死亡，
 * 问：现有一对刚出生的兔子2年后(24个月)会有多少对兔子?
 * <p>
 * 月份       1    2   3    4    5
 * 兔子对数    1    1   2    3    5
 * <p>
 * <p>
 * <p>
 * 拓展：走台阶问题
 * 假如有10阶楼梯，小朋友每次只能向上走1阶或者2阶，请问一共有多少种不同的走法呢？
 * <p>
 * 阶数  1   2   3   4   。。。
 * 走法  1   2   3   5   。。。
 * 从n为3开始：
 * f(n) = f(n - 1) + f(n - 2)
 * <p>
 * <p>
 * 【奇妙的属性】随着数列的增加，斐波那契数列前一个数与后一个数的比值越来越逼近黄金分割的数值0.618。
 *
 * @Author wkm
 * @Create 2023/4/11 17:40
 * @Version 1.0
 */
public class RabbitExer {
    public static void main(String[] args) {
        RabbitExer exer = new RabbitExer();
        int month = 24;
        System.out.println("兔子的对数为：" + exer.getRabbitNumber(month));

    }

    public int getRabbitNumber(int month) {
        if (month == 1) {
            return 1;
        } else if (month == 2) {
            return 1;
        } else {
            return getRabbitNumber(month - 1) + getRabbitNumber(month - 2);
        }
    }
}