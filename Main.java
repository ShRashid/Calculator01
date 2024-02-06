import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
/**
 * 3)	Написать класс калькулятор, принимающий List
 * целочисленных значений, возвращающий сумму элементов коллекции (метод sum)
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> array1 = new ArrayList<>(Arrays.asList(1,56,899,65));
        List<Double> array2 = new ArrayList<>(Arrays.asList(1.0,2.0,56.0));
        Calculator calculator = new Calculator();
        
        System.out.println("Сложение:");
        System.out.println("arrays1 = " + calculator.sum(array1));        
        System.out.println("arrays2 = " + calculator.sum(array2));
        System.out.println("Умножение:");        
        System.out.println("arrays1 = " + calculator.multiply(array1));       
        System.out.println("arrays2 = " + calculator.multiply(array2));
        System.out.println("Деление:");
        System.out.println("arrays1 = " + calculator.division(array1));       
        System.out.println("arrays2 = " + calculator.division(array2));

        System.out.println("Введите целочисленное чило :");
        Scanner scanerInt = new Scanner(System.in);
        int intNumber = scanerInt.nextInt();
        System.out.println("Число в двоичном формате "+calculator.convertToBinaryInt(intNumber));

        System.out.println("Введите чило в виде строки :");
        Scanner scanerStr = new Scanner(System.in);
        String strNumber = scanerStr.nextLine();
        System.out.println("Число в двоичном формате "+calculator.convertToBinaryStr(strNumber));

        System.out.println("Введите чило в виде Double :");
        Scanner scanerDouble = new Scanner(System.in);
        strNumber = scanerStr.nextLine();
        Double doubleNumber = Double.parseDouble(strNumber);
        System.out.println("Число в двоичном формате "+calculator.DoubleToBinary(doubleNumber));

        System.out.println("Введите чило в виде Float :");
        strNumber = scanerStr.nextLine();        
        Float floatNumber = Float.parseFloat(strNumber);
        System.out.println("Число в двоичном формате "+calculator.FloatToBinary(floatNumber));

    }
}