import view.MainView;
import controller.ProductController;
public class Main {
    public static void main(String[] args) {
        ProductController controller = new ProductController();
        MainView view = new MainView();
        view.start();

    }
}
