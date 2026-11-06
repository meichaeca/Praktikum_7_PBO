public abstract class AsetDigital {
    protected String id;
    protected String namaFile;
    protected double ukuranMB;

    public AsetDigital(String id, String namaFile, double ukuranMB) {
        this.id = id;
        this.namaFile = namaFile;
        this.ukuranMB = ukuranMB;
    }

    public abstract void tampilkanPreview();

    public String getInfo() {
        return "ID: " + id + ", Nama File: " + namaFile + ", Ukuran: " + ukuranMB + " MB";
    }

    public String getId() {
        return id;
    }

    public String getNamaFile() {
        return namaFile;
    }

    public double getUkuranMB() {
        return ukuranMB;
    }
}