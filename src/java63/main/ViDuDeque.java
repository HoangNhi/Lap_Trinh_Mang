package java63.main;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ViDuDeque {
    public static void main(String[] args) {
        Deque<String> danhSachSV = new ArrayDeque<String>() {
        };

        danhSachSV.offer("TITV 1");
        danhSachSV.offer("Nguyen Van A");
        danhSachSV.offer("Nguyen Van B");
        danhSachSV.offer("TITV 2");
        danhSachSV.offerLast("TITV 4");
        danhSachSV.offerFirst("TITV 0");

        while(!danhSachSV.isEmpty()){
            String ten = danhSachSV.poll(); // Lay phan tu ra khoi Queue
            // peek => Lay ra nhung khong xoa
            System.out.println(ten);
        }
    }
}
