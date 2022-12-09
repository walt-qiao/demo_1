package org.IO;

import java.io.*;

public class IoDemo {
    public static void main(String[] args) throws IOException {
        /*byte[]bytes = {'a','b','c'};
        System.out.println(bytes.length);
        String s = new String(bytes);
        System.out.println(s.length());*/
        //inputOutput();
        //buffer();
        //bufferInput();
        //input();
        //int a = 203;
        //System.out.println((char) a);
        //output();
       /* long l = 12;
        int i = (int) l;
        System.out.println(l);*/
        //inputOutputFuZhiShiPin1();
        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length+1; i++) {
            System.out.println(bytes[i]);
        }
    }

    //读数据
    public static void input() throws IOException {
        FileInputStream input = new FileInputStream("src/file/ioTest.txt");
        int be;
        byte[] b = new byte[1024];
        while((be=input.read(b)) != -1){
            System.out.print((char) be);
        }
        input.close();
    }

    //写数据
    public static void output() {
        //定义byte数组
        byte[] bytes = {97,98,99,100};
        FileOutputStream out = null;
        try {
           out= new FileOutputStream("src/file/ioTest.txt");
           //写数据
           out.write(bytes);
        } catch (IOException e) {
            //异常处理
            System.out.println("出错了");
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    System.out.println("");
                }
            }
        }
    }
    public static void inputOutput() throws IOException {
        FileInputStream input = new FileInputStream("src/file/ioTest.txt");
        OutputStream output = new FileOutputStream("src/file/ioTestFuZhi.txt");
        //读取原理，当数据没有读完时 be 返回字节数据，当数据读完时返回-1
        int be;
        while((be = input.read())!=-1){
            output.write((char)be);
        }
        input.close();
        output.close();
    }

    public static void bufferOut() throws IOException {
        BufferedOutputStream buffer = new BufferedOutputStream(new FileOutputStream("src/file/bufferedTest.txt"));
        byte[] be = {'a','b','c','d','e','f'};
        buffer.write(be);
        buffer.close();
    }
    public static void bufferInput() throws IOException {
        BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream("src/file/bufferedTest.txt"));
        int read;
        byte[] bytes = new byte[1024];
        while ((read = inputStream.read(bytes)) !=-1 ){
            System.out.print(new String(bytes,0,read));
        }
        inputStream.close();
    }

    public static void inputOutputFuZhiShiPin() throws IOException {
        BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream("C:\\java\\2022最新版Java学习路线图\\第1阶段—Java基础\\2、java零基础入门到精通24天+ 图形化编程\\java零基础入门24天\\零起点打开ja-va世界的大门视频\\第二阶段视频\\day1\\001_继承.mp4"));
        BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream("C:\\java\\001_继承.mp4"));
        long l = System.currentTimeMillis();
        int len;
        byte[] bytes = new byte[1024];
        while ((len=inputStream.read(bytes)) != -1){
            outputStream.write(bytes,0,len);
        }
        inputStream.close();
        outputStream.close();
        long l1 = System.currentTimeMillis();
        System.out.println(l1-l);
    }

    public static void inputOutputFuZhiShiPin1() throws IOException {
        FileInputStream inputStream = new FileInputStream("C:\\java\\2022最新版Java学习路线图\\第1阶段—Java基础\\2、java零基础入门到精通24天+ 图形化编程\\java零基础入门24天\\零起点打开ja-va世界的大门视频\\第二阶段视频\\day1\\001_继承.mp4");
        FileOutputStream outputStream = new FileOutputStream("C:\\java\\001_继承.mp4");
        long l = System.currentTimeMillis();

       int by;
        while ((by=inputStream.read()) != -1){
            outputStream.write(by);
        }
        inputStream.close();
        outputStream.close();
        long l1 = System.currentTimeMillis();
        System.out.println(l1-l);
    }
}
