package com.abkkm.fundamentals;

public class StringObject {

    public static void main(String[] args) {

        //how many object created here
        String s1=new String("abkkm");
        //1 object -> new -> heap
        //2 object -> literal -> SCP (String constant pool area)

        String s2="abkkm";
        // intern method used to get reference from SCP
        System.out.println(s1.intern());
        System.out.println(s1.intern().hashCode()==s2.hashCode());

        //total object count 2


    }
}
