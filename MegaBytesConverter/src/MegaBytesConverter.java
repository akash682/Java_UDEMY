public class MegaBytesConverter {
    public static void main(String args[]) {

        printMegaBytesAndKiloBytes(2050);

    }


    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int mega = kiloBytes / 1024;
        int kilo = kiloBytes % 1024;
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes + " KB = " + mega + " MB and " + kilo + " KB");
        }
    }
}
