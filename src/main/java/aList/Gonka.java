package aList;

public class Gonka {
    public static void main(String[] args) {
        String instructions = "AARAA";
        int position = 0;
        int speed = 1;

        for (char instruction : instructions.toCharArray()) {
            if (instruction == 'A') {
                speed++;
            } else if (instruction == 'R') {
                speed = -speed;
            }

            position += speed;
        }

        System.out.println("Финальная позиция машины: " + position);
    }
}
