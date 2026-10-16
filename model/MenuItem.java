package model;

public abstract class MenuItem {
    private String id;
    private String name;
    private int hargabase;
    private int stokbase;
    public MenuItem(String id, String name, int hargabase, int stokbase) {
        this.id = id;
        this.name = name;
        this.hargabase = hargabase;
        this.stokbase = stokbase;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getHargabase() {
        return hargabase;
    }
    public int getStokbase() {
        return stokbase;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setHargbase(int hargabase) {
        this.hargabase = hargabase;
    }
    public void setStokbase(int stokbase) {
        this.stokbase = stokbase;
    }
    public abstract String getOrderDetail();
    public abstract String getOrderDetails();
    public abstract double hitungHargaTotal();
}
