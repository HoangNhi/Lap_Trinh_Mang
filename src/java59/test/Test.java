package java59.test;

public class Test {
    public static void main(String[] args) {
        ThoiKhoaBieu tkb_t2 = new ThoiKhoaBieu(Day.Monday, "Toan Ly Hoa");
        ThoiKhoaBieu tkb_t3 = new ThoiKhoaBieu(Day.Tuesday, "Van Su Dia");
        ThoiKhoaBieu tkb_t4 = new ThoiKhoaBieu(Day.Wednesday, "Ly Hoa Sinh");
        ThoiKhoaBieu tkb_t5 = new ThoiKhoaBieu(Day.Tuesday, "Tin Hoc GDCD The duc");

        System.out.println(tkb_t5.toString());

        int x = Month.January.Days();
        System.out.println(x);
    }
}
