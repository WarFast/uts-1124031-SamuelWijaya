package controller;
import model.*;
import java.util.ArrayList;
import java.util.List;
public class ProductController {
    private final List<MenuItem> daftarProduk = new ArrayList<>();
    public ProductController() {
        daftarProduk.add(new Kopi("M-01","Kopi Susu",10000,10));
        daftarProduk.add(new Roti("M-02","roti coklat",15000,15));
        daftarProduk.add(new Teh("M-03","Teh tarik",20000,20));
    }
public void addKopi(String id,String nama,int hargabase,int stokbase){
    daftarProduk.add(new Kopi(id,nama,hargabase,stokbase));
}
public void addRoti(String id,String nama,int hargabase,int stokbase){
        daftarProduk.add(new Roti(id,nama,hargabase,stokbase));
    }
    public void addTeh(String id,String nama,int hargabase,int stokbase){
        daftarProduk.add(new Teh(id,nama,hargabase,stokbase));
    }
public  List<MenuItem> getDaftarProduk() {
    return daftarProduk;
}


}
