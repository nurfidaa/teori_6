package ProjectHP;

class Oppo implements Phone {
    private int volume = 0;
    public void powerOn() {
        System.out.println("Oppo menyala");
    }
    public void powerOff() {
        System.out.println("Oppo dimatikan");
    }
    public void volumeUp() {
        volume++;
        System.out.println("Volume Oppo dinaikkan menjadi " + volume);
    }
    public void volumeDown() {
        volume--;
        System.out.println("Volume Oppo diturunkan menjadi " + volume);
    }
    public int getVolume() {
        return volume;
    }
}