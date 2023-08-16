package decorator.factory.calculator.dec;

import decorator.factory.calculator.Calculable;
import decorator.factory.calculator.Calculator;
import decorator.factory.calculator.ICalculableFactory;

public class CalculableVisLoggerFactory implements ICalculableFactory {
    @Override
    public Calculable create(int primaryArg) {
        return new CalculatorLogger(new Calculator(primaryArg));
    }
}
