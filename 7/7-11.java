public class Main {
    public static void main(String[] args) {
        MyTv t = new MyTv();

        t.setChannel(10);
        System.out.println("CH:"+t.getChannel());
        t.setChannel(20);
        System.out.println("CH:"+t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:"+t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:"+t.getChannel());
    }
}

class MyTv {
    private boolean isPowerOn;
    private int channel;
    private int volume;
    private int prevChannel;
    final int maxVolume = 100;
    final int minVolume = 0;
    final int maxChannel = 100;
    final int minChannel = 1;

    public void setVolume(int Volume) {
        if (volume > maxVolume || volume < minVolume) {
            return;
        }
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setChannel(int channel) {
        if (channel > maxChannel || channel < minChannel) {
            return;
        }
        prevChannel = this.channel;
        this.channel = channel;
    }

    public int getChannel() {
        return channel;
    }

    public void gotoPrevChannel() {
        setChannel(prevChannel);
    }
}
