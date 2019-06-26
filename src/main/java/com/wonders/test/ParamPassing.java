package com.wonders.test;

/**
 * @author huangweiyue
 * @description 《码出高效》P66参数传递
 * @date Created in 2019-06-26
 */
public class ParamPassing {
    private static int intStatic = 222;
    private static String stingStatic = "old String";
    private static StringBuilder staticStringBuilder = new StringBuilder("old StringBuilder");

    public static void main(String[] args) {
       /* method(intStatic);
        System.out.println(intStatic);
        method();
        System.out.println(intStatic);*/

       /* method(stingStatic);
        System.out.println(stingStatic);*/

        method(staticStringBuilder,staticStringBuilder);
        System.out.println(staticStringBuilder);
    }

    public static void method(int intStatic) {
        intStatic = 777;
    }

    public static void method() {
        intStatic = 888;
    }

    public static void method(String stringStatic) {
        stringStatic = "new string";
    }

    public static void method(StringBuilder sb1, StringBuilder sb2) {
        sb1.append(".method.first-");
        sb2.append("method.second-");

        sb1 = new StringBuilder("new StringBuilder");
        sb1.append("new method's append");

    }
}
