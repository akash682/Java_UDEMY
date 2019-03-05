public class Challenge {
    public static void main(String[] args) {
        double result = calcFeetAndInchesToCentimeters(157);
        System.out.println(result);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if(feet>=0 && (inches >=0 && inches<=50) ){
            double centimeters = (feet*12)*2.54;
            centimeters += inches*2.54;
            System.out.println(feet + " feet," + inches + " inches = "+ centimeters + " cm" );
            return centimeters;
        }else{
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches >=0){
            double feet = (int) inches /12;
            double remain = (int)inches%12;
            System.out.println(inches + " inches = "+ feet + " feet and "+ remain + "inches." );
            return calcFeetAndInchesToCentimeters(feet, remain);
        }else{
            return -1;
        }
    }
}
