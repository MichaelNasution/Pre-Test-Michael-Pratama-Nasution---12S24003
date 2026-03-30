package inventory.model;

public class Item {

    private String id;
    private String nama;
    private String kategori;
    private int jumlah;
    private int prioritas;

    public Item(String id, String nama, String kategori, int jumlah, int prioritas) {
        this.id = id;
        this.nama = nama;
        this.kategori = kategori;
        this.jumlah = jumlah;
        this.prioritas = prioritas;
    }

    public String getId() { return id; }
    public String getKategori() { return kategori; }
    public int getJumlah() { return jumlah; }
    public int getPrioritas() { return prioritas; }

    public void setPrioritas(int prioritas) {
        this.prioritas = prioritas;
    }
}