package model;

import java.util.List;

public class Kopi extends MenuItem implements Customizable {
    private int tambahanHarga = 0;
    public Kopi(String id, String name, int hargabase, int stokbase) {
        super(id, name, hargabase, stokbase);
    }

    @Override
    public String getOrderDetail() {
        return getId() + ": " + getName() + " (stok: " + getStokbase() + ")";
    }

    @Override
    public double hitungHargaTotal() {
        return getHargabase() + this.tambahanHarga;
    }

    @Override
    public void customize(int[] customizations) {
        if (customizations == null || customizations.length < 7) {
            System.out.println("Format kustomisasi tidak valid (harus berisi 7 opsi).");
            return;
        }
        if (customizations[1] > 0 || customizations[4] > 0 || customizations[5] > 0) {
            System.out.println("Kopi tidak boleh menggunakan Extra Shot, Boba, atau Meses!");
            return;
        }
        if (customizations[0] < 0 || customizations[0] > 1 ||
                customizations[2] < 0 || customizations[2] > 5 ||
                customizations[3] < 0 || customizations[3] > 5 ||
                customizations[6] < 0 || customizations[6] > 5) {
            System.out.println("Jumlah kustomisasi melanggar batas aturan!");
            return;
        }
        int totalTambahan = 0;
        totalTambahan += customizations[0] * 3000;
        totalTambahan += customizations[6] * 3000;

        this.tambahanHarga = totalTambahan;
        System.out.println("Kustomisasi kopi berhasil diterapkan!");
    }

    @Override
    public void customize(List<Integer> customizations) {
        if (customizations == null) {
            return;
        }
        int[] arr = customizations.stream().mapToInt(i -> i).toArray();
    }
    @Override
    public String getOrderDetails() {
        return getId() + ": " + getName() + " (harga " +tambahanHarga+getHargabase()+ ")";
    }
}
