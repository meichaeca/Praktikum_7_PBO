public class VideoPromosi extends Video implements DapatDipromosikan {
    private String platform; // Atribut tambahan khusus promosi

    public VideoPromosi(String id, String namaFile, double ukuranMB, int durasiMenit, String platform) {
        super(id, namaFile, ukuranMB, durasiMenit);
        this.platform = platform;
    }

    @Override
    public void promosikan() {
        System.out.println("Mempromosikan video " + getNamaFile() + " di platform: " + platform);
    }
}