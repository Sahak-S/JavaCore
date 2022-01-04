package generics;

public class GenA <T extends Number>{

    T ob;
    T vals [];
    GenA(T o, T [] nums){
        ob = o;
        vals = nums;
    }
}
