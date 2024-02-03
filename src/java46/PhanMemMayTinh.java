package java46;

import java.util.*;

public class PhanMemMayTinh implements IMayTinhBoTui, ISapXep {
    @Override
    public double cong(double a, double b) {
        return a+b;
    }

    @Override
    public double tru(double a, double b) {
        return a-b;
    }

    @Override
    public double nhan(double a, double b) {
        return a*b;
    }

    @Override
    public double chia(double a, double b) {
        return a/b;
    }

    @Override
    public void sapXepTang(double[] arr) {
        Arrays.sort(arr);
    }

    @Override
    public void sapXepGiam(double[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int max_idx = i;
            boolean found = false;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[max_idx]) {
                    max_idx = j;
                    found = true;
                }
            }
            if (found) {
                double temp = arr[max_idx];
                arr[max_idx] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
