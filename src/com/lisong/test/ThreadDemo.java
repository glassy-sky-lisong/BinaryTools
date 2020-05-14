package com.lisong.test;

/**
 * @author lenovo
 * @package com.lisong
 * @date 2020/5/14 22:21
 * @Description
 */
public class ThreadDemo implements Runnable{
    private /*volatile*/ boolean flag = false;
    @Override
    public void run() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        flag = true;
        System.out.println("flag = "+flag);
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
