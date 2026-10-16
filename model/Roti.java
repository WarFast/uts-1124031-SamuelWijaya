package model;

import java.util.List;

public class Roti extends Kopi implements Customizable {
    private int tambahanHargaRoti = 0;

    public Roti(String id, String name, int hargabase, int stokbase) {
        super(id, name, hargabase, stokbase);
    }

    @Override
    public String getOrderDetail() {
        return getId() + ": " + getName() + " (stok: " + getStokbase() + ")";
    }

    @Override
    public double hitungHargaTotal() {
        return getHargabase() + this.tambahanHargaRoti;
    }

    @Override
    public void customize(int[] customizations) {
        if (customizations == null || customizations.length < 7) {
            System.out.println("Format kustomisasi tidak valid (harus berisi 7 opsi).");
            return;
        }
        if (customizations[0] > 0 || customizations[1] > 0 ||
                customizations[2] > 0 || customizations[4] > 0) {
            System.out.println("Roti tidak boleh menggunakan Rum, Extra Shot, Es, atau Boba!");
            return;
        }
        if (customizations[3] < 0 || customizations[3] > 5 ||
                customizations[5] < 0 || customizations[5] > 5 || //
                customizations[6] < 0 || customizations[6] > 5) {
            System.out.println("Jumlah kustomisasi Roti melanggar batas aturan!");
            return;
        }

        int totalTambahan = 0;
        totalTambahan += customizations[5] * 500;
        totalTambahan += customizations[6] * 3000;
        this.tambahanHargaRoti = totalTambahan;
        System.out.println("Kustomisasi roti berhasil diterapkan!");
    }

    @Override
    public void customize(List<Integer> customizations) {
        if (customizations == null) {
            return;
        }
        int[] arr = customizations.stream().mapToInt(i -> i).toArray();
        customize(arr);
    }
    @Override
    public String getOrderDetails() {
        return getId() + ": " + getName() + " (harga " +tambahanHargaRoti+getHargabase()+ ")";
    }
}
