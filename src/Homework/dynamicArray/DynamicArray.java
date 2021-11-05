package Homework.dynamicArray;

public class DynamicArray {
    // Սա մեր հիմնական մասիվն է որտեղ պահելու ենք ավելորդ էլեմենտնեռը:
    private int[] array = new int[100];
    //Սա մեր մասիվի մեջ ավելացված էլեմենտների քանակն է:
    private int size = 0;

    //Ստուգել, եթե մասիվի մեջ տեղ չկա -> ,կանչել extend()  և ավելացնել:
    public void add(int value) {
        if (size == array.length) {
            extend();
            array[size++] = value;
        } else {
            array[size++] = value;
        }
    }

    //1.Ստեղծել հին մասիվից 10 էլեմենտ ավելի մեծ մասիվ:
    //2. Պետք է քցել հին մասիվի էլեմենտները նորի մեջ:
    //3. Հին  մասիվի հղումը կապենք նոր մասիվի հղման հետ:
    private void extend() {
        int [] array1 = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            array1[i] = array [i];
        }
        array = array1;
    }

    //Եթե տրված ինդեքսը մեր ունեցած մասիվի ինդեքսի սահմաններում է
    // վերադարձնել մասիվի index-երրորդ էլեմենտները,հակառակ դեպքում վերադարձնել -1:
    public int getByIndex(int index) {
        if (index < 0 || index == array.length){
            return -1;
        }
        return array[index];

    }
    //Տպել մասիվի ավելացված էլեմենտները
    public void print(){
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }
}