import java.math.BigDecimal;
public class TaxCalculator {
    public static void main(String[] args) {
        //Lab2, Task5
        double netValue=9.99;
        double VAT=0.23;
        double grossValue=netValue*(1+VAT);
        int productsQuantity=10_000;
        double totalValueExcludingVAT=netValue*productsQuantity;
        System.out.println("Net value of products: "+netValue);
        System.out.println("Gross value (including VAT): "+grossValue);
        System.out.println("Products Quantity: "+productsQuantity);
        System.out.println("Total value excluding VAT is: "+totalValueExcludingVAT);
        //Using BigDecimal class
        System.out.println("");
        System.out.println("After using Big decimal: ");

        BigDecimal netPrice=new BigDecimal(9.99);
        BigDecimal vatRate=new BigDecimal(0.23);
        BigDecimal pdQuantity=new BigDecimal(10000);
        BigDecimal gValue=netPrice.multiply(BigDecimal.ONE.add(vatRate));
        BigDecimal valueExcludingVAT=netPrice.multiply(pdQuantity);

//Display results
        System.out.println("Net value of products: "+netPrice);
        System.out.println("Gross value of products: "+gValue);
        System.out.println("Products Quantity: "+pdQuantity);
        System.out.println("Total value excluding VAT is: "+valueExcludingVAT);

    }
}
