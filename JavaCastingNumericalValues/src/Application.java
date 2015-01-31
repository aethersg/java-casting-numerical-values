
public class Application
    {
    public static void main(String[] args)
        {
        byte byteValue = 20;
        short shortValue = 55;
        int intValue = 888;
        long longValue = 23355;

        float floatValue = 8834.3f;
        float floatValue2 = (float) 99.3;
        double doubleValue = 32.4;

        System.out.println(Byte.MAX_VALUE);
        //better way of doing casting
        intValue = (int) longValue;

        System.out.println(intValue);

        //bad way to do it but java will try to cast it
        doubleValue = intValue;
        System.out.println(doubleValue);

        //this casting will chop off the last value of it
        intValue = (int) floatValue;
        System.out.println(intValue);
        //as the value of 128 is too big it will try to wrap around the value and you will get -128
        byteValue = (byte) 128;
        System.out.println(byteValue);

        }
    }
