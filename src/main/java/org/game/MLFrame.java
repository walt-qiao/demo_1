package org.game;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MLFrame extends JFrame implements KeyListener {
    MLFrame(){
        //设置窗口的大小
        this.setSize(800,600);
        //设置窗口剧中显示
        this.setLocationRelativeTo(null);
        //设置窗口的可见性
        this.setVisible(true);
        //设置点击窗口的关闭按钮，结束进程
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //设置窗口大小不可变
        this.setResizable(false);
        //向窗口对象添加键盘监听器
        this.addKeyListener(this);
        //设置窗口名称
        this.setTitle("张鑫磊");
        Object o = new Object();
        String s = new String();

    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        MLFrame mlFrame = new MLFrame();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
