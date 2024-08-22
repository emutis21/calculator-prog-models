package calculator.infrastructure.input;

import calculator.infrastructure.InputMethod;
import calculator.infrastructure.InputMethodFactory;
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
