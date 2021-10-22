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
