public class Main {
    public static void main(String[] args) {
        SutdaDeck d =new SutdaDeck();

        System.out.println(d.pick(0));
        System.out.println(d.pick());
        d.shuffle();

        for (int i = 0; i < d.c.length; i++) {
            System.out.print(d.c[i] + ", ");
        }

        System.out.println();
        System.out.println(d.pick(0));
    }
}

class SutdaDeck {
    final int cardNum = 20;
    SutdaCard[] c = new SutdaCard[cardNum];

    SutdaDeck() {
        for (int i = 0; i < c.length; i++) {
            int num = i % 10 + 1;
            boolean isKwang = (i < 10) && (num == 1 || num == 3 || num == 8);

            c[i] = new SutdaCard(num, isKwang);
        }
    }

    public void shuffle() {
        for (int i = 0; i < c.length; i++) {
            int j = (int) (Math.random() * c.length);

            SutdaCard tmp = c[i];
            c[i] = c[j];
            c[j] = tmp;
        }
    }

    public SutdaCard pick(int index) {
        if (index < 0 || index >= cardNum) {
            return null;
        }
        return c[index];
    }

    public SutdaCard pick() {
        int index = (int) (Math.random() * c.length);
        return pick(index);
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
