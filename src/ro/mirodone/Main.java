package ro.mirodone;

public class Main {

    public static void main(String[] args) {

        NextBiggestNumber nextBiggestNumber = new NextBiggestNumber();
        System.out.println(nextBiggestNumber.nextBiggerNumber(9));
        System.out.println(nextBiggestNumber.nextBiggerNumber(123));
        System.out.println(nextBiggestNumber.nextBiggerNumber(144));
        System.out.println(nextBiggestNumber.nextBiggerNumber(513));
        System.out.println(nextBiggestNumber.nextBiggerNumber(473304915));

        Kata nbn= new Kata();
        System.out.println(nbn.nextBiggerNumber(9));
        System.out.println(nbn.nextBiggerNumber(12));
        System.out.println(nbn.nextBiggerNumber(513));





    }
}
