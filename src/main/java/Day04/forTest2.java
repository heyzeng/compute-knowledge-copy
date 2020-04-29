package Day04;


/*

不断输入整数，统计正数的个数，直到输入0为止
*/
import java.util.Scanner;
public class forTest2{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int positiveNumber = 0;
        boolean boo =true;

        for (;boo;){

            System.out.println("请输入一个数");
            int i = scanner.nextInt();

            //开始判断
            if (i == 0) {
                boo = false;
                System.out.println("停止输入");
            }else if (i >= 0){
                positiveNumber++;
            }
        }

        System.out.println("正数个数" + positiveNumber);
    }
}