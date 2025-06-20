package FinancialForecasting;
import java.util.*;
public class Iterativemethod {  
    public static double futureValueIterative(double Value, double growthRate, int years) {
        double result = Value;
        for (int i = 0; i < years; i++) {
            result *= (1 + growthRate);
        }
        return result;
    }

    public static void main(String[] args) {   
             
        Scanner sc = new Scanner(System.in);
        double Value = sc.nextDouble();
        double growthRate = sc.nextDouble();
        int years =sc.nextInt();               

        double futureValue = futureValueIterative(Value, growthRate, years);
        System.out.printf("Future Value after %d years: %.2f%n", years, futureValue);
    }
}
