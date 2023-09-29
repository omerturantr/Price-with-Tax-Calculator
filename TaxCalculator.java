import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        double price, priceWithTax, tax = 0.18;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Price of the product: ");     price = input.nextDouble();

        priceWithTax = price + (price*tax);

        System.out.println("The price with TAX is " + priceWithTax + ".");
    }
}