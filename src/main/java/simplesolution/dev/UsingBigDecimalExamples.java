/**
 * https://simplesolution.dev/
 */
package simplesolution.dev;

import java.math.BigDecimal;
import java.math.MathContext;

public class UsingBigDecimalExamples {

    public static void main(String... args) {
        initializeBigDecimalObjects();
        addition();
        subtraction();
        multiplication();
        division();
        conversion();
        comparision();
        rounding();
        otherMethodsUsage();
    }

    private static void initializeBigDecimalObjects() {
        BigDecimal bigDecimal1 = new BigDecimal(123456.123);
        BigDecimal bigDecimal2 = new BigDecimal(1234567890L);
        BigDecimal bigDecimal3 = new BigDecimal("123456.123");
        BigDecimal bigDecimal4 = new BigDecimal("123456.123");
        BigDecimal bigDecimal5 = BigDecimal.valueOf(1234567890L);
        BigDecimal bigDecimal6 = BigDecimal.valueOf(123456.123);
        BigDecimal bigDecimal7 = BigDecimal.valueOf(1000, 3);

        System.out.println(bigDecimal1);
        System.out.println(bigDecimal2);
        System.out.println(bigDecimal3);
        System.out.println(bigDecimal4);
        System.out.println(bigDecimal5);
        System.out.println(bigDecimal6);
        System.out.println(bigDecimal7);
    }

    private static void addition() {
        BigDecimal bigDecimal1 = new BigDecimal("10.001");
        BigDecimal bigDecimal2 = new BigDecimal(10.002);

        BigDecimal result = bigDecimal1.add(bigDecimal2);

        System.out.println(bigDecimal1);
        System.out.println(bigDecimal2);
        System.out.println(result);
    }

    private static void subtraction() {
        BigDecimal bigDecimal1 = new BigDecimal("20.02");
        BigDecimal bigDecimal2 = new BigDecimal(10.01);

        BigDecimal result = bigDecimal1.subtract(bigDecimal2);

        System.out.println(bigDecimal1);
        System.out.println(bigDecimal2);
        System.out.println(result);
    }

    private static void multiplication() {
        BigDecimal bigDecimal1 = new BigDecimal("30.01");
        BigDecimal bigDecimal2 = new BigDecimal(2);

        BigDecimal result = bigDecimal1.multiply(bigDecimal2);

        System.out.println(bigDecimal1);
        System.out.println(bigDecimal2);
        System.out.println(result);
    }

    private static void division() {
        BigDecimal bigDecimal1 = new BigDecimal("40.02");
        BigDecimal bigDecimal2 = new BigDecimal(2);

        BigDecimal result = bigDecimal1.divide(bigDecimal2);

        System.out.println(bigDecimal1);
        System.out.println(bigDecimal2);
        System.out.println(result);
    }

    private static void conversion() {
        BigDecimal bigDecimal1 = new BigDecimal("10.01");

        double doubleValue = bigDecimal1.doubleValue();
        float floatValue = bigDecimal1.floatValue();
        int intValue = bigDecimal1.intValue();
        long longValue = bigDecimal1.longValue();
        short shortValue = bigDecimal1.shortValue();
        byte byteValue = bigDecimal1.byteValue();

        System.out.println(bigDecimal1);
        System.out.println(doubleValue);
        System.out.println(floatValue);
        System.out.println(intValue);
        System.out.println(longValue);
        System.out.println(shortValue);
        System.out.println(byteValue);
    }

    private static void comparision() {
        BigDecimal bigDecimal1 = new BigDecimal("10.01");
        BigDecimal bigDecimal2 = new BigDecimal("10.02");
        BigDecimal bigDecimal3 = new BigDecimal("10.02");

        int result = bigDecimal1.compareTo(bigDecimal2);
        boolean isEqual1 = bigDecimal1.equals(bigDecimal3);
        boolean isEqual2 = bigDecimal2.equals(bigDecimal3);

        System.out.println(bigDecimal1);
        System.out.println(bigDecimal2);
        System.out.println(bigDecimal3);
        System.out.println(result);
        System.out.println(isEqual1);
        System.out.println(isEqual2);
    }

    private static void rounding() {
        BigDecimal bigDecimal1 = new BigDecimal("4.5678");
        BigDecimal result = bigDecimal1.round(new MathContext(3));

        System.out.println(bigDecimal1);
        System.out.println(result);
    }

    private static void otherMethodsUsage() {
        BigDecimal bigDecimal1 = new BigDecimal("10");

        BigDecimal powResult = bigDecimal1.pow(2);
        BigDecimal negativeResult = bigDecimal1.negate();

        System.out.println(bigDecimal1);
        System.out.println(powResult);
        System.out.println(negativeResult);
    }
}

