package java47.test;

import java47.code_a.Vidu;

public class TestViDu {
    public static void main(String[] args) {
        Vidu vd = new Vidu(5,6);
        System.out.println(vd.getA());

        java47.code_b.Vidu vd2 = new java47.code_b.Vidu(1,2,3);
        System.out.println(vd2.getC());
    }
}
