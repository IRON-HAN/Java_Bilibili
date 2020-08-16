package Utils;
// 第一步: 导包

import java.util.Scanner;

public class ScannerTest
{
    public static void main(String[] args)
    {
        // 第二步: 定义
        Scanner scanner = new Scanner(System.in);

        // 第三步: 使用
        int num = scanner.nextInt();
        System.out.println("num = " + num);

        String string = scanner.next();
        System.out.println("string = " + string);
    }
}
