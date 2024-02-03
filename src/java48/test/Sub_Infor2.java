package java48.test;

import java48.code.Infor;

public class Sub_Infor2 extends Infor {
    public void method(){
        //super.a = 0; // Error: "a" has private access
        //super.b = 2; // Error: "b" cannot be accessed from outside package
        super.c = 3;
        super.d = 4;
    }
}
