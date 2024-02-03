package java48.code;

public class Sub_Infor extends Infor {
    public void method(){
        //super.a = 0; // Error: "a" has private access
        super.b = 2;
        super.c = 3;
        super.d = 4;
    }
}
