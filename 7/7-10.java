public class Main {
    public static void main(String[] args) {
        MyTv m = new MyTv();

        m.setChannel(10);
        System.out.println("ch : " + m.getChannel());
        m.setVolume(20);
        System.out.println("vol : " + m.getVolume());
    }
}

class MyTv {
    private boolean isPowerOn;
    private int channel;
    private int volume;

    final int maxVolume = 100;
    final int minVolume = 0;
    final int maxChannel = 100;
    final int minChannel = 1;

    public boolean getIsPowerOn() {
        return isPowerOn;
    }

    public void setIsPowerOn(boolean isPowerOn) {
        this.isPowerOn = isPowerOn;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        if (channel > maxChannel || channel < minChannel) {
            return;
        }
        this.channel = channel;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume > maxVolume || volume < maxVolume) {
            return;
        }
        this.volume = volume;
    }
}
