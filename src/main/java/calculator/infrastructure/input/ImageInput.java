package calculator.infrastructure.input;

import calculator.infrastructure.InputMethod;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImageInput implements InputMethod {

  private String filePath;

  public ImageInput(String filePath) {
    this.filePath = filePath;
  }

  @Override
  public double[] getInput() {
    double[] inputs = new double[2];
    try {
      BufferedImage image = ImageIO.read(new File(filePath));

      inputs[0] = 1.0;
      inputs[1] = 2.0;
    } catch (IOException e) {
      e.printStackTrace();
    }
    return inputs;
  }
}
