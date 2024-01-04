package DZ_1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

// Класс для тестирования метода calculateDiscount
public class CalculatorTest {
    @Test
    public void testValidDiscountCalculation() {
        Calculator calculator = new Calculator();
        double actualDiscountedAmount = calculator.calculateDiscount(100, 20);
        Assertions.assertThat(actualDiscountedAmount).isEqualTo(80);
    }

    @Test
    public void testInvalidInputThrowsException() {
        Calculator calculator = new Calculator();
        Assertions.assertThatThrownBy(() -> calculator.calculateDiscount(-100, 20))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Неверный ввод: PurchaseAmount и DiscountPercentage должны быть неотрицательными, а DiscountPercentage должен находиться в диапазоне от 0 до 100.");
    }
}
