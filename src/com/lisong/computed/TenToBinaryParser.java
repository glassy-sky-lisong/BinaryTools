package com.lisong.computed;

import java.util.*;

/**
 * @author lenovo
 * @package com.lisong.computed
 * @date 2020/5/15 1:41
 * @Description
 */
public class TenToBinaryParser {
    private int ScanContent;
    private String result;
    private int[] lists;

    public TenToBinaryParser() {

    }

    public TenToBinaryParser(String content) {
        this.ScanContent = Integer.parseInt(content);
        int d = ScanContent;
        int i = 0;
        if (d != 0) {
            while (d != 0) {
                d = d >> 1;
                i++;
            }
            lists = new int[i];
        }else {
            lists = new int[1];
        }
    }

    private void parse() {
        int tmp;
        int length = lists.length;
        for (int i=0;i<length;i++) {
            tmp = ScanContent%2;
             if (tmp == 1) {
                 lists[length-1-i] = 1;
             }else if (tmp == 0) {
                 lists[length-1-i] = 0;
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

    public static String toString(int[] datas){
        StringBuffer buffer = new StringBuffer("");
        for (int s=0;s<datas.length;s++){
            if (s == 0 && datas[s] == 0) {
                if (datas[s+1] == 0){
                    s = s+2;
                }
            }else {
                buffer.append(datas[s]);
            }
        }
        return buffer.toString();
    }

    public static void main(String[] args) {
        TenToBinaryParser tbp = new TenToBinaryParser("7");
        String data = tbp.getFinalData();
        System.out.println(data);

    }
}
