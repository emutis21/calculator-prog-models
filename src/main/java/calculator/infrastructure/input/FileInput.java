package calculator.infrastructure.input;

import calculator.infrastructure.InputMethod;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileInput implements InputMethod {

  private String filePath;

  public FileInput(String filePath) {
    this.filePath = filePath;
  }

  @Override
  public double[] getInput() {
    double[] inputs = new double[2];
    try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
      inputs[0] = Double.parseDouble(br.readLine());
      inputs[1] = Double.parseDouble(br.readLine());
    } catch (IOException e) {
      e.printStackTrace();
    }
    return inputs;
  }
}
