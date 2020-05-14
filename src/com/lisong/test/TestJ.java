package com.lisong.test;

/**
 * @author lenovo
 * @package com.lisong
 * @date 2020/5/14 23:55
 * @Description
 */
public class TestJ {

    public static void main(String[] args) {
        new Thread("service"){
            private boolean flag = true;

            public void run() {
                /**
                 * something
                 */
                System.out.println("start. ..");
            }
        }.start();

        //TODO
    }
}
