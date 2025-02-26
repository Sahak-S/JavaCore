package javadas.lesson3;
// որոշել  լույսի արագուտյունը
// օգտագործելով  long օպերատորը

public class ClassLight {
    public static void main(String[] args) {
        int lightspeed;
        long deys;
        long seconds;
        long distance;
        // մոտավոր լույսի արագուտյունը, կմ*վ

        lightspeed = 186000;

        // օրերի քանակը
        deys = 1000;
        //դարցնել վրկ․
        seconds = deys * 24 * 60 * 60;
        //հաշվել արագությունը
        distance = lightspeed * seconds;
        System.out.print(deys);
        System.out.print(" օր հետո լույսը կհասնի ");
        System.out.println(distance + " կմ ");

    }
}
