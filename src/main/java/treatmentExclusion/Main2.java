package treatmentExclusion;

public class Main2 {

    static int method() {
        for (int i = 0; i < 5; i++) {
            System.out.println("i =" + i);

            try {
                if (i == 1) {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Exchepshion!");
                return i;
            } finally {
                System.out.println("Finali Block");
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println("method() rethured " + method());
    }
}
