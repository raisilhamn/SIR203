public class App {

    public static String getTime(Kalender kal) {
        String tmp;
        tmp = kal.getTanggal() + "-" + kal.getBulan() + "-" + kal.getTahun();
        return tmp;
    }

    public static void main(String[] args) throws Exception {
        Kalender kal = new Kalender(8);
        System.out.println("Waktu Awal : " + getTime(kal));
        kal.setTanggal(9);
        System.out.println("Satu hari setelah waktu awal : " + getTime(kal));
        kal = new Kalender(6, 2003);
        System.out.println("Waktu berubah : " + getTime(kal));
        kal.setBulan(7);
        System.out.println("Satu bulan setelah itu : " + getTime(kal));
        kal = new Kalender(20, 10, 2004);
        System.out.println("Waktu berubah : " + getTime(kal));
        kal.setTahun(2005);
        System.out.println("satu tahun setelah itu : " + getTime(kal));

    }
}
