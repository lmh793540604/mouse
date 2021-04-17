package com.mouse;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.util.Random;
import java.util.Scanner;

public class Mouse implements Runnable {
    private Robot robot;
    private boolean isStop = false;
    private Integer x1;
    private Integer x2;
    private Integer y1;
    private Integer y2;
    private Integer sleepTimes;
    private Integer x3;
    private Integer x4;
    private Integer y3;
    private Integer y4;



    public Mouse(Integer x1,Integer x2,Integer y1,Integer y2,Integer x3,Integer x4,Integer y3,Integer y4,Integer sleepTimes) throws AWTException {
        ControllerFrame frame = new ControllerFrame("Prevent Locking");
        frame.setVisible(true);
        robot = new Robot();
        this.x1=x1;
        this.x2=x2;
        this.y1=y1;
        this.y2=y2;
        this.x3=x3;
        this.x4=x4;
        this.y3=y3;
        this.y4=y4;
        this.sleepTimes=sleepTimes;
    }

    @Override
    public void run() {
        Integer x;
        Integer y;
        Random random = new Random();
        //每5秒移动一次
        robot.delay(5000);
        while (!isStop) {
            robot.delay(26000);
            //随机生成坐标。
            x = random.nextInt(x2-x1)+x1;
            y = random.nextInt(y2-y1)+y1;
            robot.delay(300);
            //开始移动
            moveMouse(robot,x,y);
            moveMouse(robot,x,y);
            System.out.println("移动");
            robot.mousePress(InputEvent.BUTTON1_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);
            robot.mousePress(InputEvent.BUTTON1_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);
            robot.mousePress(InputEvent.BUTTON1_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);
            robot.mousePress(InputEvent.BUTTON1_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);
            robot.delay(1500);
            System.out.println("睡眠0.3s");
            robot.mousePress(InputEvent.BUTTON1_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);
            robot.mousePress(InputEvent.BUTTON1_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);
            robot.mousePress(InputEvent.BUTTON1_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);
            robot.mousePress(InputEvent.BUTTON1_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);
            //随机生成坐标。
            x = random.nextInt(x4-x3)+x3;
            y = random.nextInt(y4-y3)+y3;
            moveMouse(robot,x,y);
            System.out.println("移动");
            robot.mousePress(InputEvent.BUTTON1_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);
            robot.mousePress(InputEvent.BUTTON1_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);
            System.out.println("睡眠0.3s");
            robot.mousePress(InputEvent.BUTTON1_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);
            robot.mousePress(InputEvent.BUTTON1_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);
            System.out.println("睡眠1.5s");

            robot.delay(500);
            System.out.println("睡眠0.5s");
            robot.mousePress(InputEvent.BUTTON1_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);
            robot.mousePress(InputEvent.BUTTON1_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);
            robot.mousePress(InputEvent.BUTTON1_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);
            robot.mousePress(InputEvent.BUTTON1_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);
            robot.mousePress(InputEvent.BUTTON1_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);
            robot.mousePress(InputEvent.BUTTON1_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);
            robot.mousePress(InputEvent.BUTTON1_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);
//            System.out.println("睡眠0.5s");
            robot.delay(1000);
            robot.mousePress(InputEvent.BUTTON1_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);
            robot.mousePress(InputEvent.BUTTON1_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);
            robot.mousePress(InputEvent.BUTTON1_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);
            robot.mousePress(InputEvent.BUTTON1_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);
            robot.mousePress(InputEvent.BUTTON1_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);
            robot.mousePress(InputEvent.BUTTON1_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);
            robot.delay(800);
            robot.mousePress(InputEvent.BUTTON1_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);
            robot.mousePress(InputEvent.BUTTON1_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);
            robot.mousePress(InputEvent.BUTTON1_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);
            robot.mousePress(InputEvent.BUTTON1_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);
            robot.mousePress(InputEvent.BUTTON1_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);
            robot.mousePress(InputEvent.BUTTON1_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);
            robot.delay(800);
            robot.mousePress(InputEvent.BUTTON1_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);
            robot.mousePress(InputEvent.BUTTON1_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);
            x = random.nextInt(x2-x1)+x1;
            y = random.nextInt(y2-y1)+y1;
            //开始移动
            moveMouse(robot,x,y);
            System.out.println("移动");
            robot.mousePress(InputEvent.BUTTON1_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);
            robot.mousePress(InputEvent.BUTTON1_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);
            robot.mousePress(InputEvent.BUTTON1_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);
            robot.delay(2500);
            System.out.println("睡眠2s");
            robot.mousePress(InputEvent.BUTTON1_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);
            robot.mousePress(InputEvent.BUTTON1_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);
        }
    }

    private class ControllerFrame extends JFrame {
        private static final long serialVersionUID = 1L;

        private JButton close = new JButton("close");

        public ControllerFrame(String title) {
            this();
            setTitle(title);
        }

        public ControllerFrame() {
            setLayout(new FlowLayout(FlowLayout.LEADING));
            setSize(316, 338);
            setResizable(false);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);

            Dimension preferredSize = new Dimension(300, 300);
            Font font = new Font("", 1, 80);

            //设置button 大小，文字等属性
            close.setPreferredSize(preferredSize);
            close.setFont(font);
            close.setBorderPainted(true);
            close.setFocusable(false);

            add(close);

            //点击button后，程序终止。
            close.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("结束");
                    isStop = true;
                    dispose();
                }
            });

        }
    }

    public static void main(String[] args) throws Exception {
//        Integer x1=Integer.valueOf(scanner("请输入x1："));
//        System.out.println(x1);
//        Integer x2=Integer.valueOf(scanner("请输入x2："));
//        System.out.println(x2);
//        Integer y1=Integer.valueOf(scanner("请输入y1："));
//        System.out.println(y1);
//        Integer y2=Integer.valueOf(scanner("请输入y2："));
//        System.out.println(y2);
//        Integer x3=Integer.valueOf(scanner("请输入x3："));
//        System.out.println(x3);
//        Integer x4=Integer.valueOf(scanner("请输入x4："));
//        System.out.println(x4);
//        Integer y3=Integer.valueOf(scanner("请输入y3："));
//        System.out.println(y3);
//        Integer y4=Integer.valueOf(scanner("请输入y4："));
//        System.out.println(y4);
//        Integer sleepTimes=Integer.valueOf(scanner("请输入睡眠时间：");
        Mouse m = new Mouse(876 ,913 ,632 ,659 ,1806 ,1842 ,633 ,666 ,0);
        m.run();
    }

    public static String scanner(String tip) throws Exception {
        Scanner scanner = new Scanner(System.in);
        StringBuilder help = new StringBuilder();
        help.append("请输入" + tip + "：");
        System.out.println(help.toString());
        if (scanner.hasNext()) {
            String ipt = scanner.next();
            if (null!=ipt&&!"".equals(ipt)) {
                return ipt;
            }
        }
        throw new Exception("请输入正确的" + tip + "！");
    }

    public static void moveMouse(Robot robot,int x,int y){
        for(int i=0;i<3;i++){
            robot.mouseMove(x,y);
        }
    }
}
