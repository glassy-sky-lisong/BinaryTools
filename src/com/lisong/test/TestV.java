package com.lisong.test;

/**
 * @author lenovo
 * @package com.lisong
 * @date 2020/5/14 22:21
 * @Description
 */
public class TestV {
/*  static保证该变量是静态的，也就是没有副本，
  volatile是保证多个线程同时修改后，始终能反映最新修改结果的，2个概念不一样
 */
    public static void main(String[] args) {
        ThreadDemo td = new ThreadDemo();
        Thread threadA = new Thread(td);
        threadA.start();
        while (true) {
            if (td.isFlag()) {
                System.out.println("-----------------");
                break;
            }
        }
    }
}
