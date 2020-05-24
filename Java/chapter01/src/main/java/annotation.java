package Java.chapter01.src.main.java;//单行注释
//注释的作用 ：1.提高了代码的阅读性  2.调试程序的重要手段
//注意：当我们进行编译的时候，注释是不会写入到字节码文件中的。

/*
	多行注释

	注意 ：多行注释不能嵌套使用
*/


//下面的这个类是一个Demo

/**
 @author jude
 @version 1.0

 javadoc -d  开发工具的名字
 mydoc  生成文档所在的目录的名字
 -author -version  文档上的注解
 Demo.java  源文件
 */

public class annotation {
    //这是程序的入口
    public static void main(String[] args) {
        //这是输出语句
        System.out.println("hello i love you");
    }
}
