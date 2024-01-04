package DZ_1;

public class Calculator {
    public double calculateDiscount(double purchaseAmount, double discountPercentage) {
        if (purchaseAmount < 0 || discountPercentage < 0 || discountPercentage > 100) {
            throw new ArithmeticException("Invalid input: purchaseAmount and discountPercentage must be non-negative, and discountPercentage must be between 0 and 100");
        }

        double discountAmount = purchaseAmount * (discountPercentage / 100);
        return purchaseAmount - discountAmount;
    }
}
