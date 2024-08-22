package calculator.infrastructure.input.factories;

import calculator.infrastructure.InputMethod;
import calculator.infrastructure.input.GUIInput;
import calculator.view.ViewApplication;

public class GUIInputFactory implements InputMethodFactory {

  @Override
  public InputMethod createInputMethod() {
    ViewApplication viewApplication = new ViewApplication();
    java.awt.EventQueue.invokeLater(() -> {
      viewApplication.setVisible(true);
    });
    return new GUIInput(viewApplication);
  }
}
