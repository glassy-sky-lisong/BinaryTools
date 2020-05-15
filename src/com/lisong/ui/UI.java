package com.lisong.ui;

import com.sun.java.accessibility.util.EventID;
import javafx.scene.control.TabPane;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author lenovo
 * @package com.lisong.ui
 * @date 2020/5/15 4:57
 * @Description
 */
public class UI {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("hello,world");
        frame.setSize(600,400);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        JMenuBar jMenuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("文件");
        JMenu editMenu = new JMenu("编辑");
        JMenu aboutMenu = new JMenu("关于");

        jMenuBar.add(fileMenu);
        jMenuBar.add(editMenu);
        jMenuBar.add(aboutMenu);

        JMenuItem createMi = new JMenuItem("新建");
        JMenuItem openMi = new JMenuItem("打开");
        JMenuItem saveMi = new JMenuItem("保存");
        JMenuItem exitMi = new JMenuItem("退出");
        fileMenu.add(createMi);
        fileMenu.add(openMi);
        fileMenu.add(saveMi);
        fileMenu.addSeparator();
        fileMenu.add(exitMi);

        frame.setJMenuBar(jMenuBar);

        createMi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("新建文件成功");
            }
        });
    }
}
