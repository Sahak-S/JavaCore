package javadas.inputOutputOperator;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

// вычислить гипотенузу прямоугольного треугольника
public class Hypot1 {
      public static void main(String[] args) {

          double side1, side2;
          double hypot;

          side1 = 3.0;
          side2 = 4.0;

          // Здесь методы sqrt() и pow() можно вызывать
          //непосредственно, опуская имя их класса

          hypot = sqrt(pow(side1,2)) + pow(side2,1);
          System.out.println("Пpи заданной длине сторон " +  side1 + " и " + side2 + " гипотенуза равна " + hypot);
      }

}
