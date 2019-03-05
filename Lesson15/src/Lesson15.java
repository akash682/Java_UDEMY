public class Lesson15 {
    public static void main(String[] args){
       /*
        int myminValue = -2_147_483_648;
        int mymaxValue = 2_147_483_647;
        int myTotal = (myminValue/2);


        byte myByteValue = -128;
        byte myNewByteValue = (byte)(myByteValue/2);
        System.out.println("myNewByteValue = " + myNewByteValue);
        // byte myNewByteValue = (myByteValue/2);<--autimatically changes to int

        short myShortValue = 32767;

        long myLongValue = 9_223_372_036_854_775_807L;
         byte i = 8
            short i = 16
            int i = 32 (half and half)
            long i = 64
         */

        byte mybi = 124;
        short mysh = 3333;
        int myint = 11111111;
        long mylo = 50000L + 10L*(mybi+mysh+myint);
        System.out.println(mylo);
    }
}
