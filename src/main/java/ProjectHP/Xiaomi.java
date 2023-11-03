package ProjectHP;

class Xiaomi implements Phone {
    private int volume = 0;
    public void powerOn() {
        System.out.println("Xiaomi menyala");
    }
    public void powerOff() {
        System.out.println("Xiaomi dimatikan");
    }
    public void volumeUp() {
        volume++;
        System.out.println("Volume Xiaomi dinaikkan menjadi " + volume);
    }
    public void volumeDown() {
        volume--;
        System.out.println("Volume Xiaomi diturunkan menjadi " + volume);
    }
    public int getVolume() {
        return volume;
    }
}