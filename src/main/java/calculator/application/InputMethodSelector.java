package calculator.application;

import calculator.infrastructure.InputMethod;
import calculator.infrastructure.input.ConsoleInput;
import calculator.infrastructure.input.FileInput;
import calculator.infrastructure.input.ImageInput;
import java.util.Scanner;

public class InputMethodSelector {

  public static InputMethod selectInputMethod(Scanner scanner) {
    System.out.println("Seleccione el método de entrada:");
    System.out.println("1. Consola");
    System.out.println("2. Archivo de texto");
    System.out.println("3. Imagen");

    int choice = scanner.nextInt();
    scanner.nextLine();

    return getInputMethod(choice, scanner);
  }

  private static InputMethod getInputMethod(int choice, Scanner scanner) {
    if (choice < 1 || choice > 3) return null;

    if (choice == 1) return new ConsoleInput(scanner);

    if (choice == 2) {
      System.out.println("Ingrese la ruta del archivo de texto:");
      String filePath = scanner.nextLine();
      return new FileInput(filePath);
    }

    if (choice == 3) {
      System.out.println("Ingrese la ruta de la imagen:");
      String imagePath = scanner.nextLine();
      return new ImageInput(imagePath);
    }

    return null;
  }
}
