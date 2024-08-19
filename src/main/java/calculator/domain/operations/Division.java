package calculator.domain.operations;

public class Division implements Operation {

  @Override
  public double execute(double a, double b) {
    if (b == 0) throw new ArithmeticException("No se puede dividir por cero");

    return a / b;
  }

  @Override
  public String getSymbol() {
    return "/";
  }
}
