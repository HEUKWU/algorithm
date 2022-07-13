public class Main {
    public static void main(String[] args) {
        SutdaCard c1 = new SutdaCard(3, false);
        SutdaCard c2 = new SutdaCard();

        System.out.println(c1.info());
        System.out.println(c2.info());
    }
}

class SutdaCard {
    private int num;
    private boolean isKwang;
    
    public SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }
    
    public SutdaCard() {
        this(1, true);
    }
    
    public String info() {
        return num + (isKwang ? "K" : "");
    }
}
