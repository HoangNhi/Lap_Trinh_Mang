package java41;

public class Test {
    public static void main(String[] args) {
        Polish nbl = new Polish("Tomek", 2015);
        Vietnamese nvn = new Vietnamese("Tung TITV", 2021);
        American nm = new American("Michal", 2030);

        nbl.xinChao();
        nvn.xinChao();
        nm.xinChao();
    }
}
