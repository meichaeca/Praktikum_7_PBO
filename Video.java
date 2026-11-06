public class Video extends AsetDigital {
    private int durasiDetik;

    public Video(String id, String namaFile, double ukuranMB, int durasiDetik) {
    super(id, namaFile, ukuranMB);
    this.durasiDetik = durasiDetik;
}

    @Override 
    public void tampilkanPreview() {
        System.out.println("[PREVIEW VIDEO] " + getInfo() + ", Durasi: " + durasiDetik + " detik");
    }

    public int getDurasiDetik() {
        return durasiDetik;
    }
}