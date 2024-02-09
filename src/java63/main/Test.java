package java63.main;

import java.util.LinkedList;
import java.util.Queue;

public class Test {
    public static void main(String[] args) {
        // Queue - First In First Out
        Queue<String> danhSachSV = new LinkedList<String>();

        danhSachSV.offer("TITV 1");
        danhSachSV.offer("Nguyen Van A");
        danhSachSV.offer("Nguyen Van B");
        danhSachSV.offer("TITV 2");

        while(!danhSachSV.isEmpty()){
            String ten = danhSachSV.poll(); // Lay phan tu ra khoi Queue
            // peek => Lay ra nhung khong xoa
            System.out.println(ten);
        }
    }
}
