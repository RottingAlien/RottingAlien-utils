package rottingalien.utils.Maths;

public class FindMidValues {

    public static double findMidValue(double min, double max, double percentage){
        return min + ((max-min)*(percentage/100));
    }

}
