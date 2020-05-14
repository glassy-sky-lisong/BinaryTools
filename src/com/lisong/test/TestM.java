package com.lisong.test;

/**
 * @author lenovo
 * @package com.lisong
 * @date 2020/5/14 23:13
 * @Description
 */
public class TestM extends Thread{
    /*  static保证该变量是静态的，也就是没有副本，
  volatile是保证多个线程同时修改后，始终能反映最新修改结果的，2个概念不一样
 */
    private static boolean flag;

    TestM(Runnable runnable) {
        super(runnable);
    }

    public static void main(String[] args) {
        new TestM(()->{
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            flag = true;
            System.out.println("flag = "+flag);
        }).start();

        while (!flag) {
            System.out.println("-   -  ");
        }
    }
}
