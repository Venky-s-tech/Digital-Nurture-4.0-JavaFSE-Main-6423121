
package FinancialForecasting;
import java.util.*;
public class FinancialForecastRecursive {
    public static double Recursive(double Value, double growthRate, int years) {
        if (years == 0) {
            return Value;
        } else {
            return (1 + growthRate) * Recursive(Value, growthRate, years - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         double Value = sc.nextDouble();
        double growthRate = sc.nextDouble();
        int years = sc.nextInt();    
        

        double futureValue = Recursive(Value, growthRate, years);
        System.out.printf("Future Value after %d years: %.3f\n", years, futureValue);
    }
}
