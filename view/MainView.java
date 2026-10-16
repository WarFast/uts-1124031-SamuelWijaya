package view;

import controller.ProductController;
import exceptions.*;
import model.*;
import utils.InputUtil;
import java.util.List;
public class MainView {
    private ProductController productController;

    public MainView() {
        productController = new ProductController();
    }
    MenuItem menuitem = null;
    menuitem = new Roti(1,1,1,1);
    public void start(){
    boolean isRunning = true;
        while (isRunning) {
            System.out.println("");
        }
    }
}
