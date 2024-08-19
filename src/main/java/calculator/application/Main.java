package calculator.application;

import calculator.infrastructure.InputMethod;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    InputMethod inputMethod = InputMethodSelector.selectInputMethod(scanner);

    double[] inputs = inputMethod.getInput();

    if (inputMethod == null || inputs == null) {
      System.out.println("Opción no válida. Saliendo del programa.");
      System.exit(1);
    }

    CalculatorExecutor.performCalculations(inputs);
  }
}
