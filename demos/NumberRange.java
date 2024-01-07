public class NumberRange {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("--- Integer Types");
        byte bMin = Byte.MIN_VALUE;
        byte bMax = Byte.MAX_VALUE;
        System.out.println("Byte values range from " + bMin + " to " + bMax);
        short sMin = Short.MIN_VALUE;
        short sMax = Short.MAX_VALUE;
        System.out.println("Short values range from " + sMin + " to " + sMax);
        int iMin = Integer.MIN_VALUE;
        int iMax = Integer.MAX_VALUE;
        System.out.println("Integers range from " + iMin + " to " + iMax);
        long lMin = Long.MIN_VALUE;
        long lMax = Long.MAX_VALUE;
        System.out.println("Long values range from " + lMin + " to " + lMax);
        System.out.println("--- Floating point Types");
        float fMin = Float.MIN_VALUE;
        float fMax = Float.MAX_VALUE;
        System.out.println("Floats range from " + fMin + " to " + fMax);
        double dMin = Double.MIN_VALUE;
        double dMax = Double.MAX_VALUE;
        System.out.println("Doubles range from " + dMin + " to " + dMax);
    }
}
