public class Remote {
    private TV tv;
    public Remote(TV tv) {
        this.tv = tv;
    }
    public void changeChannelUp() {
        tv.changeChannelUp();
    }
    public void changeChannelDown() {
        tv.changeChannelDown();
    }
    public void changeVolumeUp() {
        tv.changeVolumeUp();
    }
    public void changeVolumeDown() {
        tv.changeVolumeDown();
    }
    public void turnOn() {
        tv.turnOn();
    }
    public void turnOff() {
        tv.turnOff();
    }
}