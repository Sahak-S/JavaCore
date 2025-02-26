package javadas.treatmentExclusion;

public class Train02 {

    public static void main(String[] args) {
        // создать екземпляр класса
        QuadraticEculation.QuadraticEquation qE = new QuadraticEculation.QuadraticEquation(1,1,1);
        qE.Solution();// вызвать метод, решающий уравнение
        System.out.println("-------------------------");

        // создать другой екземпляр класса
        QuadraticEculation.QuadraticEquation qE1 = new QuadraticEculation.QuadraticEquation(0, 3, 5);
        qE1.Solution();
        System.out.println("-------------------------");

        QuadraticEculation.QuadraticEquation qE2 = new QuadraticEculation.QuadraticEquation(2, 3, -5);
        qE2.Solution();
        qE2.toString();
        System.out.println((qE2.equals(qE)));

    }
}

