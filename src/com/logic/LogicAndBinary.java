package com.logic;

/**
 * Logic class.
 *
 * @author Vihovsky Roman
 * @since 04.05.2017
 */
public class LogicAndBinary {
    public static void main(String[] args) {
    	for (int i = 1; i < 101; i++) {
    		System.out.println(".header-hidden"+i+" {\r\n" +
                    "  background: #ff5821;\r\n" +
                    "  color: #ffffff;\r\n" +
                    "}"+
                    ".header-hidden"+i+" a:not(.btn),\r\n" + 
                    ".header-hidden"+i+" p {\r\n" + 
                    "  color: #ffffff;\r\n" + 
                    "}");
    	}
    }

}
