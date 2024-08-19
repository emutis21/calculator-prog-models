package calculator.domain.operations;

public class Multiplication implements Operation {

  @Override
  public double execute(double a, double b) {
    return a * b;
  }

  @Override
  public String getSymbol() {
    return "*";
  }
}
