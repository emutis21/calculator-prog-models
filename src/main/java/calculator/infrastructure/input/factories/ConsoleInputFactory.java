package calculator.infrastructure.input.factories;

import calculator.infrastructure.InputMethod;
import calculator.infrastructure.input.ConsoleInput;
import java.util.Scanner;

public class ConsoleInputFactory implements InputMethodFactory {

  private final Scanner scanner;

  public ConsoleInputFactory(Scanner scanner) {
    this.scanner = scanner;
  }

  @Override
  public InputMethod createInputMethod() {
    return new ConsoleInput(scanner);
  }
}
