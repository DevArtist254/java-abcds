public class Main {
    public static void main(String[] args) {
        //Expression
        int myFirstName = (10 + 5);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);

        byte myFirstByte = 100;
        short myFirstShort = 10000;
        int myFirstInt = 100000;

        Long myFirstLong = (long) 50000 * (myFirstByte + myFirstShort + myFirstInt);

        System.out.println(myFirstLong);

        System.out.println(PoundToKGConverter.convertToKgFromPd(200.0));
    }
}