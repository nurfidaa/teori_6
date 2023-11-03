package ProjectHP;

class Iphone implements Phone {
    private int volume = 0;
    public void powerOn() {
        System.out.println("iPhone menyala");
    }
    public void powerOff() {
        System.out.println("iPhone dimatikan");
    }
    public void volumeUp() {
        volume++;
        System.out.println("Volume iPhone dinaikkan menjadi " + volume);
    }
    public void volumeDown() {
        volume--;
        System.out.println("Volume iPhone diturunkan menjadi " + volume);
    }
    public int getVolume() {
        return volume;
    }
}