/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Michael Miller
 */
public class Calculator {
    
    public static final Logger logger = Logger.getLogger(Calculator.class.getName());
    
    //to only display level that is severe
    public Calculator() {
        logger.setLevel(Level.SEVERE);
    }

    /**
     * This method performs divide on two doubles
     * @param x First double value
     * @param y Second double value
     * @return division answer as double
     */
    public double divide(double x, double y) {
        if (y == 0) {
            logger.log(Level.SEVERE, "tried to divide by zero");
            throw new ArithmeticException("Cannot divide by zero");
        }
        double answer = x / y;
       
        return answer;
    }

    /**
     *
     * @param values
     * @return answer
     */
    public double multiply(double[] values) {
        double answer = 0;

        for (double value : values) {
            if (answer == 0) {
                answer = value;
            } else {
                answer *= value;
            }
        }

        return answer;
    }

    /**
     *
     * @param values
     * @return answer
     */
    public double add(double[] values) {
        double answer = 0;
        for (double value : values) {
            answer += value;
        }

        return answer;
    }

    /**
     *
     * @param x
     * @param y
     * @return answer
     */
    public double subtract(double x, double y) {
        double answer = x - y;

        return answer;
    }

    /**
     *
     * @param x
     * @return answer
     */
    public double squareRoot(double x) {
        return Math.sqrt(x);
    }
}

public class CalculatorMain{
    
}
