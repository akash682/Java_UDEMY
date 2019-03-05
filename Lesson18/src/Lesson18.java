public class Lesson18 {
    public static void main(String args[]){
        // int = 32 (4bytes)
        int myIntvalue = 5/3;
        // float = 32 (4 bytes)
        float myFloatValue = 5f / 3f;
        // double = 64 (8 bytes)
        double myDoubleValue = 5d / 3d;
        System.out.println("myIntvalue = " + myIntvalue);
        System.out.println("myfloatvalue = " + myFloatValue);
        System.out.println("mydoublevalue = " + myDoubleValue);

        double pounds = 54;
        double kilogram = pounds*0.45359237;
        System.out.println(kilogram);

        double pi = 2.141_592_27d;
    }
}
