public class Dokumen extends AsetDigital {
    private int jumlahHalaman;

    public Dokumen(String id, String namaFile, double ukuranMB, int jumlahHalaman) {
        super(id, namaFile, ukuranMB);
        this.jumlahHalaman = jumlahHalaman;
    }

    @Override
    public void tampilkanPreview() {
        System.out.println("[PREVIEW DOKUMEN] " + getInfo() + ", Jumlah Halaman: " + jumlahHalaman);
    }

    public int getJumlahHalaman() {
        return jumlahHalaman;
    }
}