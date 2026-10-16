package model;

import java.util.List;

public class Teh extends MenuItem implements Customizable {
    public Teh(String id,String name,int hargabase,int stokbase) {
        super(id,name,hargabase,stokbase);
    }
    @Override
    public String getOrderDetail() {
        return getId()+": "+getName()+"(stok: "+getStokbase()+")";
    }

    @Override
    public double hitungHargaTotal() {
        return 0;
    }


    @Override
    public void customize(List<Integer> customizations) {

    }

    @Override
    public void customize(int[] customizations) {

    }
}
