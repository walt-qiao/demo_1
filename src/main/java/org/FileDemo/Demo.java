package org.FileDemo;

import java.io.File;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException{
        show();
    }

    /**
     * File 测试
     * @throws IOException
     */
    public static void show() throws IOException {
        File file = new File("C:/Users/XM/Desktop/demo");
        //createTempFile 根据提供的前缀后缀向给定的路径添加一个文件
        File tempFile = File.createTempFile("demo1", "txt", file);
    }
}
