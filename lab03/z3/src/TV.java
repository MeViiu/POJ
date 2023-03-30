public class TV {
    private int channel;
    private int volume;
    private boolean on;
    public TV() {
        this.channel = 1;
        this.volume = 5;
        this.on = false;
    }
    public void turnOn() {
        this.on = true;
        System.out.println("Telewizor jest włączony!");
    }
    public void turnOff() {
        this.on = false;
        System.out.println("Telewizor jest wyłączony!");
    }
    public void changeChannelUp() {
        if (this.on) {
            if (this.channel < 20) {
                this.channel++;
                System.out.println("Aktualny kanał: " + this.channel);
            } else {
                System.out.println("Nie ma więcej kanałów, aktualny kanał: 20");
            }
        } else {
            System.out.println("Telewizor jest wyłączony");
        }
    }

    public void changeChannelDown() {
        if (this.on) {
            if (this.channel > 1) {
                this.channel--;
                System.out.println("Aktualny kanał: " + this.channel);
            } else {
                System.out.println("Nie ma więcej kanałów, aktualny kanał: 1");
            }
        } else {
            System.out.println("Telewizor jest wyłączony");
        }
    }

    public void changeVolumeUp() {
        if (this.on) {
            if (this.volume < 10) {
                this.volume++;
                System.out.println("Głośność zmieniona na: " + this.volume);
            } else {
                System.out.println("Nie można zwiększyć głośności, aktualna głośność to: 10");
            }
        } else {
            System.out.println("Telewizor jest wyłączony");
        }
    }

    public void changeVolumeDown() {
        if (this.on) {
            if (this.volume > 1) {
                this.volume--;
                System.out.println("Głośność zmieniona na: " + this.volume);
            } else {
                System.out.println("Nie można zmniejszyć głośności, aktualna głośność to: 0");
            }
        } else {
            System.out.println("Telewizor jest wyłączony");
        }
    }
}