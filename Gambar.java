public class Gambar extends AsetDigital{
    private String  resolusi;

    public Gambar(String id, String namaFile, double ukuranMB, String resolusi) {
        super(id, namaFile, ukuranMB);
        this.resolusi = resolusi;
    }

    @Override 
    public void tampilkanPreview() {
        System.out.println("[PREVIEW GAMBAR] " + getInfo() + ", Resolusi: " + resolusi);
    }

    public String getResolusi() {
        return resolusi;
    }
}