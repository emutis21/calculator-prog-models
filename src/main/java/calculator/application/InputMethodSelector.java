package calculator.application;

import calculator.infrastructure.InputMethod;
import calculator.infrastructure.input.factories.ConsoleInputFactory;
import calculator.infrastructure.input.factories.GUIInputFactory;
import calculator.infrastructure.input.factories.InputMethodFactory;
import java.util.Scanner;

public class InputMethodSelector {

  public static InputMethod selectInputMethod(Scanner scanner) {
    System.out.println("Seleccione el método de entrada:");
    System.out.println("1. Consola");
    System.out.println("2. GUI");
    System.out.println("¿Qué método desea utilizar?: ");

    int choice = scanner.nextInt();
    scanner.nextLine();

    InputMethodFactory factory = getInputMethodFactory(choice, scanner);
    return factory != null ? factory.createInputMethod() : null;
  }

  private static InputMethodFactory getInputMethodFactory(
    int choice,
    Scanner scanner
  ) {
    if (choice == 1) {
      return new ConsoleInputFactory(scanner);
    } else if (choice == 2) {
      return new GUIInputFactory();
    } else {
      return null;
    }
  }
}
