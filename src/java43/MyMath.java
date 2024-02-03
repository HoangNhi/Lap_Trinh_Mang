package java43;

public class MyMath {
    public int timMin(int a, int b){
        return a<=b ? a : b;
    }

    public double timMin(double a, double b){
        return a<=b ? a : b;
    }

    public double tinhTong(double a, double b){
        return a+b;
    }

    public double tinhTong(double[] arr){
        double res = 0;
        for(int i=0;i<arr.length; i++){
            res+=arr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        MyMath mm = new MyMath();
        System.out.println("min(5,5) = " + mm.timMin(5,5));
        System.out.println("min(5.5, 6.0) = "+ mm.timMin(5.5, 6.0));
        System.out.println("tinhTong(5,6)= "+mm.tinhTong(5.0, 6.0));
        double arr[] = new double[] {1,2,3,4,5};
        System.out.println("tinhTong(arr)= "+mm.tinhTong(arr));
    }
}
