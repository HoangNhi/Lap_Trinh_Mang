package java63.main;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class ViDuPriorityQueue {
    public static void main(String[] args) {
        // PriorityQueue - Hang doi duoc sap xep
        Queue<String> danhSachSV = new PriorityQueue<String>();

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
