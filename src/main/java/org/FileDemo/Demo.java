package org.FileDemo;

import java.io.File;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException{
        int i = 8+8*(8-(8/8));
        System.out.println(i);

        /*File file = new File("src");
        getFile(file);*/
        //show2();
        //show3();
    }

    /**
     * File 测试
     * @throws IOException
     */
    public static void show() throws IOException {
        File file = new File("C:/Users/XM/Desktop/demo");
        //createTempFile 根据提供的前缀后缀向给定的路径添加一个文件
        File tempFile = File.createTempFile("demo1", "txt", file);
        boolean newFile = tempFile.createNewFile();
        System.out.println(newFile);
        System.out.println(tempFile);
    }

    public static void show2(){
        File file = new File("C:/Users/XM/Desktop/demo");
        boolean exists = file.exists();
        System.out.println(exists);
        //是否为文件
        boolean directory = file.isDirectory();
        //是否为文件
        boolean file1 = file.isFile();
        System.out.println(directory+","+file1);
    }
    public static void show3() throws IOException {
        File file = new File("src/file/demo/test2.txt");
        boolean newFile = file.createNewFile();
        System.out.println(newFile);
        File file1 = new File("src/file/test1.txt");
        boolean newFile1 = file1.createNewFile();
        System.out.println(newFile1);
        File file2 = new File("src/file/demo/test2.txt");
        //boolean mkdirs = file2.mkdirs();
        //System.out.println(mkdirs);
        boolean newFile2 = file2.createNewFile();
        System.out.println(newFile1);
        File file3 = new File("src/file/demo/demo/testDemo");
        boolean mkdirs = file3.mkdirs();
        System.out.println(mkdirs);
        File file4 = new File("src/file/demo/demo/testDemo/test.txt");
        boolean newFile6 = file4.createNewFile();
        System.out.println(newFile6);
        File file5 = new File("src/file/demo/demo/testDemo/test2.txt");
        boolean newFile5 = file5.createNewFile();
        System.out.println(newFile5);
        File file6 = new File("src/file/demo/demo/testDemo/test3.txt");
        boolean newFile4 = file6.createNewFile();
        System.out.println(newFile4);
        File file7 = new File("src/file/demo/demo/testDemo/OOK");
        boolean mkdir = file7.mkdir();
        System.out.println(mkdir);
        File file8 = new File("src/file/demo/demo/testDemo/OOK/test3.txt");
        boolean newFile3 = file8.createNewFile();
        System.out.println(newFile3);
    }
    public static void getFile(File getFile){

        File[] files = getFile.listFiles();
        if (files != null){
            for (File file:files){
                if (file.isDirectory()){
                    getFile(file);
                }else {
                    String name = file.getName();
                    System.out.println(name);
                }
            }
        }

    }
}
