package Peter.OCAPreviousExam.Question1;

class Product {
    double price;
}

public class Question1 {
    public void updatePrice(Product product, double price) {
        price = price * 2;
        product.price = product.price + price;
    }

    public static void main(String[] args) {
        Product prt = new Product();
        prt.price = 200;
        double newPrice = 100;

        Question1 question1 = new Question1();
        question1.updatePrice(prt, newPrice);
        System.out.println(prt.price + ":" + newPrice);

    }
}
