package com.offer;

import org.junit.Test;

public class RepalceSpace {
    public String replaceSpace(StringBuffer str) {


        return str.toString().replaceAll("\\s","%20");

   }

    @Test
    public void testSpace(){
        System.out.print(replaceSpace(new StringBuffer("we are happy")));
    }
}
