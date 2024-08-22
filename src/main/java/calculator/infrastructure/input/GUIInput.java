package calculator.infrastructure.input;

import calculator.infrastructure.InputMethod;
import calculator.view.ViewApplication;

public class GUIInput implements InputMethod {

  private final ViewApplication viewApplication;

  public GUIInput(ViewApplication viewApplication) {
    this.viewApplication = viewApplication;
  }

  @Override
  public double[] getInput() {
    return new double[] { 0, 0 };
  }

  @Override
  public void displayMessage(String message) {
    viewApplication.displayMessage(message);
  }
}
