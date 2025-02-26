package javadas.treatmentExclusion;

public class QuadraticEculation {
    // генерирование исключения оператором throw
// решение квадратного уравнения
    static class QuadraticEquation {
        double a,b,c,x1,x2;

        // конструктор
        QuadraticEquation(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        // метод, который решает квадратное уравнение
        void Solution() {
            double d; // дискриминант

            try {
                d = b*b - 4*a*c;

                // учесть деление на 0
                if (a==0)
                    throw new ArithmeticException("Деление на 0."); // создать исключение

                // учесть корень из отрицательного числа
                if (d<0)
                    throw new ArithmeticException("Уравнение не имеет корней."); // создать исключение

                x1 = (-b - Math.sqrt(d))/(2*a);
                x2 = (-b + Math.sqrt(d))/(2*a);

                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
            catch (ArithmeticException e) {
                System.out.println(e); // вывести исключение, созданное в блоке try
            }
        }


    }

}

