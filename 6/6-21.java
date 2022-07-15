public class Main {
    public static void main(String[] args) {
        MyTv t = new MyTv();

        t.channel = 100;
        t.volume = 0;
        System.out.println("ch : " + t.channel + ", vol : " + t.volume);

        t.channelDown();
        t.volumeDown();
        System.out.println("ch : " + t.channel + ", vol : " + t.volume);

        t.volume = 100;
        t.channelUp();
        t.volumeUp();
        System.out.println("ch : " + t.channel + ", vol : " + t.volume);
    }
}

class MyTv {
    boolean isPowerOn;
    int channel;
    int volume;

    final int maxVolume = 100;
    final int minVolume = 0;
    final int maxChannel = 100;
    final int minChannel = 1;

    void turnOnOff() {
//        if (isPowerOn = true) {
//            isPowerOn = false;
//        } else {
//            isPowerOn = true;
//        }
        isPowerOn =! isPowerOn;
    }

    void volumeUp() {
        if (volume < maxVolume) {
            volume++;
        }
    }

    void volumeDown() {
        if (volume > maxVolume) {
            volume--;
        }
    }

    void channelUp() {
        if (channel == maxChannel) {
            channel = minChannel;
        } else {
            channel++;
        }
    }

    void channelDown() {
        if (channel == minChannel) {
            channel = maxChannel;
        } else {
            channel--;
        }
    }
