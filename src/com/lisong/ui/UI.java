package com.lisong.ui;

import com.lisong.computed.BinaryToTenParser;
import com.lisong.computed.TenToBinaryParser;
import com.sun.java.accessibility.util.EventID;
import javafx.scene.control.TabPane;
import org.omg.PortableInterceptor.INACTIVE;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * @author lenovo
 * @package com.lisong.ui
 * @date 2020/5/15 4:57
 * @Description
 */
public class UI {
    private static final int UI_WIDTH = 400;
    private static final int UI_HEIGHT = 150;

    public UI() {
        init();
    }

    private void init() {
        JFrame frame = new JFrame();
        frame.setTitle("十进制与二进制互转");
        frame.setSize(UI_WIDTH,UI_HEIGHT);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        JTabbedPane jTabPanel = new JTabbedPane();

        JPanel tab1 = new JPanel(new GridLayout(3,2));

        JPanel TwoPanel = new JPanel();
        JTextField j1 = new JTextField(10);
        TwoPanel.add(new JLabel("二进制：  "));
        TwoPanel.add(j1);

        JPanel Text1Panel = new JPanel();
        JLabel data1 = new JLabel("请输入数据");
        Text1Panel.add(data1);

        JPanel Btn1Panel = new JPanel();
        JButton verse = new JButton("转换");
        verse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = j1.getText();
                BinaryToTenParser btp = new BinaryToTenParser(text);
                String finalData = btp.getFinalData();
                data1.setText("结果为： "+finalData);
            }
        });
        Btn1Panel.add(verse);

        tab1.add(TwoPanel);
        tab1.add(Text1Panel);
        tab1.add(Btn1Panel);

        JPanel tab2 = new JPanel(new GridLayout(3,2));

        JPanel TenPanel = new JPanel();
        JTextField j2 = new JTextField(10);
        TenPanel.add(new JLabel("十进制：  "));
        TenPanel.add(j2);

        JPanel Text2Panel = new JPanel();
        JLabel data2 = new JLabel("请输入数据");
        Text2Panel.add(data2);

        JPanel Btn2Panel = new JPanel();
        JButton verse2 = new JButton("转换");
        Btn2Panel.add(verse2);
        verse2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = j2.getText();
                TenToBinaryParser tbp = new TenToBinaryParser(text);
                String finalData = tbp.getFinalData();
                data2.setText("结果为： "+finalData);
            }
        });

        tab2.add(TenPanel);
        tab2.add(Text2Panel);
        tab2.add(Btn2Panel);

        jTabPanel.addTab("转十进制",tab1);
        jTabPanel.addTab("转二进制",tab2);

        frame.setContentPane(jTabPanel);
    }
}
