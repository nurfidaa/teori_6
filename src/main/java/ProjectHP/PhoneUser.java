package ProjectHP;

class PhoneUser {
    private Phone phone;
    public PhoneUser(Phone phone) {
        this.phone = phone;
    }
    public void turnOnPhone() {
        phone.powerOn();
    }
    public void turnOffPhone() {
        phone.powerOff();
    }
    public void makePhoneLouder() {
        phone.volumeUp();
    }
    public void makePhoneSilent() {
        phone.volumeDown();
    }
}