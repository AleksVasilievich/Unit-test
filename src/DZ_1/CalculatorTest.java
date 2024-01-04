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
                .hasMessage("Invalid input: purchaseAmount and discountPercentage must be non-negative, and discountPercentage must be between 0 and 100");
    }
}
