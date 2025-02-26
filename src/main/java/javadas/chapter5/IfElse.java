package javadas.chapter5;

public class IfElse {
    public static void main(String[] args) {
        int mount = 4;
        String season;
        if (mount == 12 || mount == 1 || mount == 2)

            season  = "ձմեռ";
        else if (mount == 3 || mount == 4 || mount == 5)
            season = "գարուն";
        else if (mount == 6 || mount == 7 || mount == 8)
            season = "ամառ";
        else if (mount == 9 || mount== 10 || mount== 11)
            season = "աշուն";
        else
            season = "հորինած ամիս";
        System.out.println(season);
    }
}
