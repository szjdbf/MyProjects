package com.zlf.suanfa;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Demo {
    public static void main(String[] args) {
        JFrame j = new JFrame("计算器");
        j.setSize(1000, 1000);
        JButton b = new JButton("登录");
        b.setBackground(Color.PINK);
        b.addActionListener(e -> {
            System.out.println("你被电击了");
            JOptionPane.showMessageDialog(j, "你好");
        });
        b.setSize(20, 20);
        j.add(b);
        j.add(b);
        j.show();
    }
}