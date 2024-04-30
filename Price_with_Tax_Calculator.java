import java.util.Scanner;

public class Price_with_Tax_Calculator {
    public static void main(String[] args) {
        double price, priceWithTax, tax = 0.18;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the PRICE of the product: ");     price = input.nextDouble();

        priceWithTax = price + (price*tax);

        System.out.println("The PRICE WITH TAX is " + priceWithTax + ".");
    }
}
