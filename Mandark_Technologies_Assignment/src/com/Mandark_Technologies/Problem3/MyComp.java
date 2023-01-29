package com.Mandark_Technologies.Problem3;

import java.util.Comparator;

class MyComp implements Comparator<String> {


    @Override
    public int compare(String o1, String o2) {

    	char c1 = o1.charAt(0);
    	char c2 = o2.charAt(0);
    	
        o1 = o1.substring(1);
        o2 = o2.substring(1);
        
//        checking weather the first char is equals or not 
        if(c1 == c2) {
        	return Integer.compare(Integer.parseInt(o2),Integer.parseInt(o1));
        }
        return 0;
        
    }
}