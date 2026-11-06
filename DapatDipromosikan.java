public interface DapatDipromosikan {
    void promosikan();

    default void infoPromosi() {
        System.out.println("Aset ini siap untuk dipromosikan ke publik.");
    }
}