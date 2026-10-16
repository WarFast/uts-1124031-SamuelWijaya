package model;

import java.util.List;

// Catatan: Jika diperbolehkan, ubah menjadi "extends MenuItem"
public class Roti extends Kopi implements Customizable {

    // Atribut tersendiri untuk menyimpan harga kustomisasi Roti
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
        // Menghitung harga dasar Roti ditambah biaya kustomisasinya
        return getHargabase() + this.tambahanHargaRoti;
    }

    @Override
    public void customize(int[] customizations) {
        // 1. Validasi panjang array untuk menghindari IndexOutOfBoundsException
        if (customizations == null || customizations.length < 7) {
            System.out.println("Format kustomisasi tidak valid (harus berisi 7 opsi).");
            return;
        }

        // 2. Aturan Roti: Hanya bisa Gula, Meses, Karamel
        // Artinya indeks 0 (Rum), 1 (Extra Shot), 2 (Es), dan 4 (Boba) WAJIB bernilai 0.
        if (customizations > 0 || customizations > 0 ||
                customizations > 0 || customizations > 0) {
            System.out.println("Roti tidak boleh menggunakan Rum, Extra Shot, Es, atau Boba!");
            return;
        }

        // 3. Validasi batas maksimal kuantitas [0 - maksimal]
        if (customizations < 0 || customizations > 5 || // Gula max 5
                customizations < 0 || customizations > 5 || // Meses max 5
                customizations < 0 || customizations > 5) { // Karamel max 5
            System.out.println("aJumlah kustomisasi Roti melanggar batas aturan!");
            return;
        }

        // 4. Hitung total tambahan harga berdasarkan matriks kustomisasi Roti
        int totalTambahan = 0;
        totalTambahan += customizations * 500;   // Meses (+500)
        totalTambahan += customizations * 3000;  // Karamel (+3000)
        // Catatan: Gula gratis (0 rupiah), tidak perlu dikalikan harga

        // Simpan hasil perhitungan ke atribut kelas
        this.tambahanHargaRoti = totalTambahan;
        System.out.println("Kustomisasi roti berhasil diterapkan!");
    }

    @Override
    public void customize(List<Integer> customizations) {
        if (customizations == null) {
            return;
        }

        // Konversi List<Integer> menjadi int[]
        int[] arr = customizations.stream().mapToInt(i -> i).toArray();
        customize(arr); // Memanggil method customize(int[]) di atas
    }
}
