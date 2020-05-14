package com.lisong.computed;

import java.util.*;

/**
 * @author lenovo
 * @package com.lisong.computed
 * @date 2020/5/15 1:41
 * @Description
 */
public class TenToBinaryParser {
    private Integer ScanContent;
    private String result;
    private int[] lists;

    public TenToBinaryParser() {

    }

    public TenToBinaryParser(String content) {
        this.ScanContent = Integer.parseInt(content);
        if (ScanContent == null) new NullPointerException();
        int d = ScanContent;
        int m = d >> 1;
        int i = 0;
        while ((d >> 1) != 1) {
            d = d >> 1;
            i++;
        }
        lists = new int[i+2];
    }

    private void parse() {
        for (int i=0;i<lists.length;i++) {
            int tmp = ScanContent%2;
             if (tmp == 1) {
                 lists[i] = 1;
             }else if (tmp == 0) {
                 lists[i] = 0;
             }
             ScanContent /= 2;
        }
    }
    
    private void resolveResult() {
        parse();
        result = TenToBinaryParser.toString(lists);
    }
    
    public String getFinalData() {
        resolveResult();
        return result;
    }

    public static String toString(int[] a){
        StringBuffer buffer = new StringBuffer("");
        for (int s: a) {
            buffer.append(s);
        }
        return buffer.toString();
    }

    public static void main(String[] args) {
        TenToBinaryParser tbp = new TenToBinaryParser("15");
        String finalData = tbp.getFinalData();
        System.out.println(finalData);
    }
}
