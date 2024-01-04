package DZ_1;

public class Calculator {
    public double calculateDiscount(double purchaseAmount, double discountPercentage) {
        if (purchaseAmount < 0 || discountPercentage < 0 || discountPercentage > 100) {
            throw new ArithmeticException("Неверный ввод: PurchaseAmount и DiscountPercentage должны быть неотрицательными, а DiscountPercentage должен находиться в диапазоне от 0 до 100.");
        }

        double discountAmount = purchaseAmount * (discountPercentage / 100);
        return purchaseAmount - discountAmount;
    }
}
