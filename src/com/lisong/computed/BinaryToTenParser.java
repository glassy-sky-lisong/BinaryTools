package com.lisong.computed;

import java.awt.image.RescaleOp;
import java.util.logging.Level;

/**
 * @author lenovo
 * @package com.lisong.computed
 * @date 2020/5/15 0:11
 * @Description
 */
public class BinaryToTenParser {
    private String scanContent;
    private int result;

    public BinaryToTenParser() {

    }

    public BinaryToTenParser(String content) {
        this.scanContent = content;
    }

    public String getScanContent() {
        return scanContent;
    }

    public void setScanContent(String scanContent) {
        this.scanContent = scanContent;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    private int[] prase() {
        String[] split = scanContent.split("", scanContent.length());
        int[] ints = new int[split.length];
        if (split.length > 0) {
            for (int i=0;i<split.length;i++) {
                ints[i] = Integer.parseInt(split[i]);
            }
        }
        return ints;
    }

    public void resoleResult() {
        int[] ints = prase();
        for (int i = 0; i < ints.length-1;i++) {
            if (ints[i] == 1) {
                result  += Math.pow(2,ints.length-1-i);
            }
        }
        result += ints[ints.length-1];
    }

    public int getFinalData() {
        resoleResult();
        return result;
    }

    public static void main(String[] args) {
        BinaryToTenParser btp = new BinaryToTenParser("1111");
        int result = btp.getFinalData();
        System.out.println("result = "+ result);
    }
}
