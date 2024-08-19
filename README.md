# Proyecto Calculadora

## Estructura del Proyecto

El proyecto está organizado de la siguiente manera:
```plaintext
src/
    main/
        java/
            calculator/
                application/
                    CalculatorExecutor.java
                    InputMethodSelector.java
                    Main.java
                domain/
                    Calculator.java
                    operations/
                        Addition.java
                        Subtraction.java
                        Multiplication.java
                        Division.java
                infrastructure/
                    input/
                        ConsoleInput.java
                        FileInput.java
                        ImageInput.java

```

## Descripción del Proyecto

Este proyecto es una calculadora que utiliza un patrón de diseño avanzado para separar las responsabilidades de la aplicación. La estructura del proyecto está dividida en tres capas principales:

1. **Application**: Contiene la lógica de la aplicación y la coordinación entre las diferentes partes del sistema.
2. **Domain**: Contiene la lógica de negocio y las operaciones matemáticas.
3. **Infrastructure**: Contiene las implementaciones de los métodos de entrada.

src/main/java/calculator/view/??