package calculator.infrastructure.input;

import calculator.infrastructure.InputMethod;
import java.util.Scanner;

public class ConsoleInput implements InputMethod {

  private final Scanner scanner;

  public ConsoleInput(Scanner scanner) {
    this.scanner = scanner;
  }

  @Override
  public double[] getInput() {
    System.out.println("Ingrese dos números separados por espacio:");
    double num1 = scanner.nextDouble();
    double num2 = scanner.nextDouble();
    return new double[] { num1, num2 };
  }

  @Override
  public void displayMessage(String message) {
    System.out.println(message);
  }
}
