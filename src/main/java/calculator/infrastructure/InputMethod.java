package calculator.infrastructure;

public interface InputMethod {
  double[] getInput();
  void displayMessage(String message);
}
