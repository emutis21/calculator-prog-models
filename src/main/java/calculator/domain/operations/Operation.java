package calculator.domain.operations;

public interface Operation {
  double execute(double a, double b);

  String getSymbol();
}
