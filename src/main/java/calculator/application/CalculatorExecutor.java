package calculator.application;

import calculator.domain.Calculator;
import calculator.domain.operations.Addition;
import calculator.domain.operations.Division;
import calculator.domain.operations.Multiplication;
import calculator.domain.operations.Operation;
import calculator.domain.operations.Subtraction;

public class CalculatorExecutor {

  public static void performCalculations(double[] inputs) {
    Calculator calculator = new Calculator();
    Operation[] operations = {
      new Addition(),
      new Subtraction(),
      new Multiplication(),
      new Division(),
    };

    for (Operation operation : operations) {
      calculator.setOperation(operation);
      System.out.println(
        inputs[0] +
        " " +
        operation.getSymbol() +
        " " +
        inputs[1] +
        " = " +
        calculator.calculate(inputs[0], inputs[1])
      );
    }
  }
}
