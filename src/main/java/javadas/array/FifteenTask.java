package javadas.array;

public class FifteenTask {

    public static void main(String[] args) {

        String st = new String("Hello");
       // int[]array = {12,1,4,1,5,9,8,1,5};

        int counter = 0;
        char[] charsArray = st.toCharArray();
        System.out.println("Повторяющиеся символы тут:");

        for (int i=0; i<st.length();i++) {
            for(int j=i+1; j<st.length();j++) {
                if (charsArray [i] == charsArray [j]) {
                    System.out.print(charsArray [j] + " ");
                    counter ++;
                    break;
                }
            }
        }
        System.out.println(counter + " ");

//        for (int i = 0; i < array.length; i++) {
//            for (int j = i+1; j < array.length; j++) {
//                if (array[i]== array[j]){
//                    System.out.print(array[j]+ " ");
//                    counter++;
//                    break;
//                }
//            }
//        }
//        System.out.println(counter + " ");
    }
}
