package calculator.infrastructure.input;

import calculator.infrastructure.InputMethod;
import calculator.infrastructure.InputMethodFactory;
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
