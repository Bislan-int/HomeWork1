public class Computer {
    private int cores;
    private int ram;
    private int hdd;
    private String operatingSystem;

    public Computer(int cores, int ram, int hdd, String operatingSystem) {
        this.cores = cores;
        this.ram = ram;
        this.hdd = hdd;
        this.operatingSystem = operatingSystem;
    }

    public void on() {
        System.out.println("Компьютер включился.");
    }

    public void off() {
        System.out.println("Компьютер выключился.");
    }

    public void loading() {
        System.out.println("Компьютер загружается.");
    }

}
