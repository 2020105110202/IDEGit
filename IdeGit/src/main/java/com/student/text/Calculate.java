package com.student.text;

/**
 * @author DongNing
 * @create 2021-10-22 21:09
 */
interface ICalculate{
    int calculate(int m,int n);
}
public class Calculate {
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