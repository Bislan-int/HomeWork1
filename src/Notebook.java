public class Notebook extends Computer {
    private String brand;
    private double weight;
    private double diagonal;

    public Notebook(String brand, double weight, double diagonal, int cores, int ram, int hdd, String operatingSystem) {
        super(cores, ram, hdd, operatingSystem);
        this.brand = brand;
        this.weight = weight;
        this.diagonal = diagonal;
    }

    public void charge() {
        System.out.println("Ноутбук заряжается.");
    }

    @Override
    public void on() {
        System.out.println("Ноутбук включился.");
    }

    @Override
    public void off() {
        System.out.println("Ноутбук выключился.");
    }

    @Override
    public void loading() {
        System.out.println("Ноутбук загружается.");
    }

}
