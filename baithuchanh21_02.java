public class demo {
    int tinhtonpackage;

    public static class Tinhtongsonguyen {
        int tinhtong(int n) {
            int sum = 0;
            while (n > 0) {
                System.out.println("n%2 = " + n % 10);
                sum = sum + n % 10;
                n = n / 10;
                System.out.println("n/2 = " + n);
            }
            return sum;
        }

        public static void main(String args[]) {
            System.out.println("Viet chuong trinh tinh tong so nguyen");
            int n = 26021991;
            Tinhtongsonguyen ttsn = new Tinhtongsonguyen();
            System.out.println("Tong so nguyen n = " + n + " la = " + ttsn.tinhtong(n));
        }
    }

    int demo(int n) {
        int sum = 0;
        while (n > 0) {
            System.out.println("n%2 = " + n % 10);
            sum = sum + n % 10;
            n = n / 10;
            System.out.println("n/2 = " + n);
        }
        return sum;
    }

    /**
     * @param args
     */
    public static void main(String args[]) {
        System.out.println("Viet chuong trinh tinh tong so nguyen");
        int n = 26021991;
        demo ttsn = new demo();
        System.out.println("Tong so nguyen n = " + n + " la = " + ((demo.Tinhtongsonguyen) ttsn).tinhtong(n));
    }
}