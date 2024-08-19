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
    double[] inputs = new double[2];

    System.out.print("Ingrese el primer número: ");
    inputs[0] = scanner.nextDouble();

    System.out.print("Ingrese el segundo númeeeeero: ");
    inputs[1] = scanner.nextDouble();

    return inputs;
  }
}
