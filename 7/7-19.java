public class Main {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        b.buy(new Tv());
        b.buy(new Computer());
        b.buy(new Tv());
        b.buy(new Audio());
        b.buy(new Computer());
        b.buy(new Computer());
        b.buy(new Computer());

        b.summary();
    }
}

class Buyer {
    int money = 1000;
    int sum = 0;
    Product[] cart = new Product[3];
    int i = 0;

    void buy(Product product) {
        if (money < product.price) {
            return;
        } else {
            money -= product.price;
            sum += product.price;
            add(product);
        }
    }

    void add(Product product) {
        if (i >= cart.length) {
            Product[] cart2 = new Product[cart.length * 2];
            System.arraycopy(cart, 0, cart2, 0, cart.length);
            cart = cart2;
        }
        cart[i++] = product;
    }

    void summary() {
        String itemList = "";

        for (int i = 0; i < cart.length; i++) {
            if (cart[i] == null) {
                break;
            }
            itemList += cart[i] + ", ";
        }

        System.out.println("목록 : " + itemList);
        System.out.println("합계 : " + sum);
        System.out.println("잔액 : " + money);
    }
}

class Product {
    int price;

    public Product(int price) {
        this.price = price;
    }
}

class Tv extends Product {
    Tv() {
        super(100);
    }

    public String toString() {
        return "TV";
    }
}

class Computer extends Product {
    Computer() {
        super(100);
    }

    public String toString() {
        return "Computer";
    }
}

class Audio extends Product {
    Audio() {
        super(100);
    }

    public String toString() {
        return "Audio";
    }
}
