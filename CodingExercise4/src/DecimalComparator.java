public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
        double a1 = 1000*a;
        double b1 = 1000*b;

        return (int)a1 == (int)b1;
    }
}
