package Grup.arreyUtil;

public class ArreyUtilTest {

    public static void main(String[] args) {

        ArreyUtil arreyUtil = new ArreyUtil();

        int[] array = {34, 3, 7, 19, 25, 1, 77, 111, 155, 200,};
        System.out.println("masiv");
        arreyUtil.print(array);

        int maxOfarrey = arreyUtil.max(array);
        System.out.println("max = " + maxOfarrey);

        int minOfarrey = arreyUtil.min(array);
        System.out.println("min =" + minOfarrey);

        double kOfarrey = arreyUtil.k(array);
        System.out.println("k = " + kOfarrey);

        int sumOfarray = arreyUtil.sum(array);
        System.out.println("թվերի գումարն հավասար է " + sumOfarray);

        int numOfarray = arreyUtil.num(array);
        System.out.println("Կենտերի թիվը հավասար է " + numOfarray);

        int num1Ofarray = arreyUtil.num1(array);
        System.out.println("Զույգերի թիվը հավասար է " + num1Ofarray);


    }
}
