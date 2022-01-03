public class ThreadRunnable {
    public static void main(String[] args) {
        Thread kegiatan1 = new Thread(new Kegiatan("Kegiatan-1"));
        Thread kegiatan2 = new Thread(new Kegiatan("Kegiatan-2"));
        kegiatan1.start();
        kegiatan2.start();
    }
}

class Kegiatan implements Runnable {
    String nama;
    public Kegiatan(String id) {
        nama = id;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.currentThread().sleep(1000);
            } catch (InterruptedException ie) {
                System.out.println("Terinterupsi");
            }
            System.out.println("Thread " + nama + ":Posisi" + i);
        }
    }
}
