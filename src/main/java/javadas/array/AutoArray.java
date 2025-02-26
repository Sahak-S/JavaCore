package javadas.array;

public class AutoArray {
    public static void main(String[] args) {

        int maut_deys[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        //System.out.println("Օգոստոս ամիսը " + maut_deys[7] + " օր է։");

        for (int i = 0; i < maut_deys.length; i++) {
            System.out.print(maut_deys[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < maut_deys.length; i++) {
            for (int j = 1; j < maut_deys.length; j++) {
                if (maut_deys[j] < maut_deys[j - 1]) {
                    int temp = maut_deys[j];
                    maut_deys[j] = maut_deys[j - 1];
                    maut_deys[j - 1] = temp;
                }
            }
        }
        for (int j = 0; j < maut_deys.length; j++) {
            System.out.print(maut_deys[j] + " ");
        }
    }
}
