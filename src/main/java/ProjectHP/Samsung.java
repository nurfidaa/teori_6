package ProjectHP;

class Samsung implements Phone {
    private int volume = 0;
    public void powerOn() {
        System.out.println("Samsung menyala");
    }
    public void powerOff() {
        System.out.println("Samsung dimatikan");
    }
    public void volumeUp() {
        volume++;
        System.out.println("Volume Samsung dinaikkan menjadi " + volume);
    }
    public void volumeDown() {
        volume--;
        System.out.println("Volume Samsung diturunkan menjadi " + volume);
    }
    public int getVolume() {
        return volume;
    }
}
