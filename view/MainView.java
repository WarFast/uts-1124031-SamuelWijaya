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
    public void start(){
    boolean isRunning = true;
        while (isRunning) {
            System.out.println("\n=== DAFTAR SEMUA PRODUK ===");
            List<MenuItem> list = productController.getDaftarProduk();

            if (list.isEmpty()) {
                System.out.println("Belum ada produk.");
                return;
            }

            for (MenuItem menuItem : list) {
                System.out.println(menuItem.getOrderDetail());
            }
            String id = InputUtil.getString("id produk:");
            try {
                MenuItem produkTerpilih = productController.getProdukById(id);

                System.out.println("Anda memilih: " + produkTerpilih.getName());

            } catch (MenuTidakDitemukanException e) {
                System.out.println("Menu tidak ditemukan.");
            }
        try {

        }catch (StokTidakCukupException e){
            System.out.println("stok kurang");
        }


        }
    }
}
