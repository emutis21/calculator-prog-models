package calculator.application;

import calculator.infrastructure.InputMethod;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    InputMethod inputMethod = InputMethodSelector.selectInputMethod(scanner);

    if (inputMethod == null) {
      System.out.println("Opción no válida. Saliendo del programa.");
      System.exit(1);
    }

    double[] inputs = inputMethod.getInput();
    inputMethod.displayMessage("Calculando...");
    CalculatorExecutor.performCalculations(inputs);
  }
}
