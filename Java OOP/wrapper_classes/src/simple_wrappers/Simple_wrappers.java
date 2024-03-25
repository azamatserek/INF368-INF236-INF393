package simple_wrappers;

public class Simple_wrappers {

    public static void work_with_booleans(){
        Integer i1 = new Integer(42);
        Integer i2 = new Integer("42");
        System.out.println(i1);
        System.out.println(i2);

        Float f1 = new Float(3.14f);
        Float f2 = new Float("3.14f");
        System.out.println(f1);
        System.out.println(f2);

        Character c1 = new Character('c');
        System.out.println(c1);

        Boolean boolean1 = new Boolean(true);
        Boolean boolean2 = new Boolean("Some String");

        System.out.println(boolean1);
        System.out.println(boolean2);
    }

    public static void work_with_integers(){
        Integer integer1 = Integer.valueOf("6");
        Integer integer2 = Integer.valueOf(6);
        // преобразовывает 101011 к 43
        Integer integer3 = Integer.valueOf("101011", 2);
        System.out.println(integer1);
        System.out.println(integer2);
        System.out.println(integer3);
    }

    public static void work_with_convertations(){


        Long long1 = Long.valueOf("45");
        long long2 = Long.parseLong("67");
        long long3 = Long.parseLong("100000", 2);

        System.out.println("long1 = " + long1);
        System.out.println("long2 = " + long2);
        System.out.println("long3 = " + long3);

        String string1 = Integer.toHexString(254);
        System.out.println("254 в 16-ой системе = " + string1);

        String string2 = Long.toOctalString(254);
        System.out.println("254 в  8-ой системе = " + string2);

        String string3 = Long.toBinaryString(254);
        System.out.println("254 в  2-ой системе = " + string3);

        Integer iOb = new Integer(1000);
        System.out.println(iOb.byteValue());
        System.out.println(iOb.shortValue());
        System.out.println(iOb.intValue());
        System.out.println(iOb.longValue());
        System.out.println(iOb.floatValue());
        System.out.println(iOb.doubleValue());
    }

    public static void work_with_infinities(){
        int a = 7;
        double  b = 0;
        double c = -0.0;
        double g = Double.NEGATIVE_INFINITY;
        System.out.println("7 / 0.0 = " + a / b);
        System.out.println("7 / -0.0 = " + a / c);
        System.out.println("0.0 == -0.0 = " + (b == c));
        System.out.println("-Infinity * 0 = " + g * 0);
    }

    public static void work_with_buffers(){
        StringBuffer buffer=new StringBuffer("hello");
        buffer.append(" ");
        buffer.append("java");
        System.out.println(buffer);

        StringBuilder builder=new StringBuilder("hello");
        builder.append("java");
        System.out.println(builder);

        long startTime = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer("Java");
        for (int i=0; i<100000; i++){
            sb.append("Tpoint");
        }
        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");
        startTime = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder("Java");
        for (int i=0; i<100000; i++){
            sb2.append("Tpoint");
        }
        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");
    }

}
