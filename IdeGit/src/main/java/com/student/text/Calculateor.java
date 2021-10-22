package com.student.text;
import java.util.Scanner;
/**
 * @author DongNing
 * @create 2021-10-22 21:09
 */
interface ICalculate{
    int calculate(int m,int n);
}
 class Calculate {
    public void doCalculate(ICalculate cal,int a,int b){

        cal.calculate(a,b);
    }

}
class Sub implements ICalculate{
    private int result;
    public int calculate(int m,int n){
        result=m-n;
        System.out.println(m+"-"+n+"="+result);
        return result;
    }
}
public class Calculateor {
    public static void main(String[] args) {
        int op1;
        int op2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input first Number:");
        op1=sc.nextInt();
        System.out.println("Please input second Number:");
        op2=sc.nextInt();
        System.out.print("Add Sub Mul Div Resultes:\n");
        Calculate cal=new Calculate();
        cal.doCalculate(new Sub(),op1,op2);

    }
}