package java48.test;

import java48.code.Infor;

public class Test {
    private Infor infor;
    public void method(){
        //this.infor.a = 0; // Error: "a" has private access
        //this.infor.b = 2; // Error: "b" cannot be accessed from outside package
        //this.infor.c = 3; // Error: "c" has protected access
        this.infor.d = 4;
    }
}
