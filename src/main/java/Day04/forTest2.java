package Day04;


/*

不断输入整数，统计正数的个数，直到输入0为止
*/
import java.util.Scanner;
public class forTest2{

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        boolean boo = true;
        int positiveNumber = 0; //统计正数的个数

        for(;boo;){

            System.out.println("请输入一个数(输入0停止)");

            int number = s.nextInt();

            //获取输入的数做以下事情 ：1.判断是否退出  2.统计正数
            if(number == 0){
                boo = false;
            }else if(number > 0){ //判断该数是否是正数
                positiveNumber++;
            }


        }

        System.out.println("正数的个数=" + positiveNumber);

    }
}