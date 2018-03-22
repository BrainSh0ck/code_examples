package com.reflection;

/**
 * TODO: comment
 *
 * @author Vihovsky Roman
 * @since 12.07.2017
 */
    class Base {
    }

    class One extends Base {
    }
public class FegInstance {

    public static void main(String[] args) {
        Base base = new One();
        One one = new One();
        System.out.println(base instanceof One); //true
        System.out.println(base instanceof Base); //true
        System.out.println(base instanceof Object); //true
        System.out.println(base.getClass() == One.class); //true
        System.out.println(base.getClass() == Base.class); //false
        System.out.println(one instanceof One); //true
        System.out.println(one instanceof Base); //true
//        System.out.println(one.getClass() == One.class); //true
        //System.out.println(one.getClass() == Base.class); //???
        Class cb = Base.class;
        System.out.println(one.getClass() == cb); //false
        System.out.println(one.getClass() == (Class)Base.class);

    }
}
