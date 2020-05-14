# 基础题
- 用最有效的的方法算出2称以8等于几
```
2<<3
```
- Math.round(11.5)和Math.round(-11.5)的值是多少？
```
Math.round(11.5)：12
Math.round(-11.5)：-11
```
- java中round()函数,floor()函数,ceil()函数的返回值
```
/**
         * 向下取整,返回的是一个double值
         */
        System.out.println(Math.floor(11.8));//11.0
        System.out.println(Math.floor(11.5));//11.0
        System.out.println(Math.floor(11.1));//11.0
        System.out.println(Math.floor(-11.8));//-12.0
        System.out.println(Math.floor(-11.5));//-12.0
        System.out.println(Math.floor(-11.1));//-12.0
 
        /**
         * 向上取整,返回的是一个double值
         */
        System.out.println(Math.ceil(11.8));//12.0
        System.out.println(Math.ceil(11.5));//12.0
        System.out.println(Math.ceil(11.1));//12.0
        System.out.println(Math.ceil(-11.8));//-11.0
        System.out.println(Math.ceil(-11.5));//-11.0
        System.out.println(Math.ceil(-11.1));//-11.0
```
