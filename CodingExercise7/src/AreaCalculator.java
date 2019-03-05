public class AreaCalculator {

    public static double area(double radius){
        if(radius<0){
            return -1;
        }else{
            double S = 3.1415*radius*radius;
            return S;
        }
    }

    public static double area(double x, double y){
        if(x<0 || y<0){
            return -1;
        }else{
            double S = x*y;
            return S;
        }
    }
}
