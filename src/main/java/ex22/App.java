package ex22;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Veronica Martucci
 */
import java.util.Scanner;
import static java.lang.System.exit;

public class App {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        App app = new App();
        double num1 =  app.inputNum1();
        double num2 =  app.inputNum2();
        double num3 =  app.inputNum3();
        app.isNumSame(num1, num2, num3);
        double largestNum = app.findLargestNum(num1, num2, num3);
        System.out.println("The largest num is " +largestNum);
    }

    public double inputNum1(){
        System.out.print("Enter the first number: ");
        String str = input.nextLine();
        return Double.parseDouble(str);
    }

    public double inputNum2(){
        System.out.print("Enter the second number: ");
        String str = input.nextLine();
        return Double.parseDouble(str);
    }

    public double inputNum3(){
        System.out.print("Enter the third number: ");
        String str = input.nextLine();
        return Double.parseDouble(str);
    }

    public void isNumSame(double num1, double num2, double num3){
        if(num1 == num2 || num1 == num3 || num2 == num3){
            exit(-1);
        }
    }

    public double findLargestNum(double num1, double num2, double num3){
        double largestVal = 0.0;
        if(num1 > num2 && num1 > num3){
            largestVal = num1;
        }
        else if(num2 > num1 && num2 > num3){
            largestVal = num2;
        }
        else if(num3 > num1 && num3 > num2){
            largestVal = num3;
        }
        return largestVal;
    }
}
