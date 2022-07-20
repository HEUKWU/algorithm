public class Main {
    public static void main(String[] args) {
        SutdaDeck d = new SutdaDeck();

        for (int i = 0; i < d.c.length; i++) {
            System.out.print(d.c[i] + ", ");
        }
    }
}

class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard() {
        this(1, true);
    }

    public SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}

class SutdaDeck {
    final int CardNum = 20;
    SutdaCard[] c = new SutdaCard[CardNum];

    SutdaDeck() {
        for (int i = 0; i < c.length; i++) {
            int num = i % 10 + 1;
            boolean isKwang = (i < 10) && (num == 1 || num == 3 || num == 8);
            c[i] = new SutdaCard(num, isKwang);
        }
    }
}
