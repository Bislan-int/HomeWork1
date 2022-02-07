public class Main {
    public static void main(String[] args) {
        Notebook notebook = new Notebook("Asus", 2.4, 15.5, 6,16, 1024, "Windows");
        notebook.on();
        notebook.loading();
        notebook.off();
        notebook.charge();

    }
}
