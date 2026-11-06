import java.util.ArrayList;

public class MainAset {
    public static void main(String[] args) {
        // 1. Membuat ArrayList<AsetDigital> berisi minimal 1 objek dari masing-masing subclass
        ArrayList<AsetDigital> daftarAset = new ArrayList<>();
        
        daftarAset.add(new Gambar("G01", "Poster_Event.png", 4.5, "1920x1080"));
        daftarAset.add(new Video("V01", "Tutorial_Java.mp4", 150.0, 45));
        daftarAset.add(new Dokumen("D01", "Modul_Praktikum.pdf", 12.0, 25));
        daftarAset.add(new VideoPromosi("VP01", "Iklan_Produk.mp4", 50.0, 2, "Instagram Ads"));

        System.out.println("=========================================");
        System.out.println("  POLIMORFISME VIA ABSTRACT CLASS");
        System.out.println("=========================================");
        // 2. Iterasi dan panggil tampilkanPreview() & getInfo()
        for (AsetDigital aset : daftarAset) {
            aset.getInfo();
            aset.tampilkanPreview();
            System.out.println("-----------------------------------------");
        }

        System.out.println("\n=========================================");
        System.out.println("   PENGECEKAN INSTANCEOF (PROMOSI)");
        System.out.println("=========================================");
        // 3. Gunakan instanceof untuk mengecek objek yang mengimplementasikan DapatDipromosikan
        for (AsetDigital aset : daftarAset) {
            if (aset instanceof DapatDipromosikan) {
                // Downcasting ke interface DapatDipromosikan
                DapatDipromosikan promo = (DapatDipromosikan) aset;
                
                // Memanggil default method dari interface
                promo.infoPromosi();
                // Memanggil method promosikan()
                promo.promosikan();
                System.out.println("-----------------------------------------");
            }
        }

        System.out.println("\n=========================================");
        System.out.println("   POLIMORFISME VIA INTERFACE");
        System.out.println("=========================================");
        // 4. Buat ArrayList<DapatDipromosikan> terpisah dan tambahkan VideoPromosi ke dalamnya
        ArrayList<DapatDipromosikan> daftarPromosi = new ArrayList<>();
        
        // Menambahkan objek VideoPromosi ke dalam list interface
        VideoPromosi iklantiktok = new VideoPromosi("VP02", "Promo_Diskon.mp4", 30.0, 1, "TikTok");
        daftarPromosi.add(iklantiktok);

        for (DapatDipromosikan item : daftarPromosi) {
            item.infoPromosi();
            item.promosikan();
        }
    }
}