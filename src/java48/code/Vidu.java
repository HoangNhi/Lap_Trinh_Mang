package java48.code;

public class Vidu {
    private Infor infor;

    public void method(){
//        this.infor.a = 0; // Error: "a" has private access
        this.infor.b = 2;
        this.infor.c = 3;
        this.infor.d = 4;
    }
}
