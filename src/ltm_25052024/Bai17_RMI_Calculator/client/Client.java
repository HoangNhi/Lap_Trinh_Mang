package ltm_25052024.Bai17_RMI_Calculator.client;

import ltm_25052024.Bai17_RMI_Calculator.server.CalculatorInterface;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try{
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            CalculatorInterface calStub = (CalculatorInterface)registry.lookup("Calculator");
            Scanner sc = new Scanner(System.in);
            while (true){
                System.out.println("Chon phep tinh: ");
                System.out.println("1. +");
                System.out.println("2. -");
                System.out.println("3. *");
                System.out.println("4. /");
                int ch = sc.nextInt();
                System.out.println("Nhap a: ");
                double a = sc.nextDouble();
                System.out.println("Nhap b: ");
                double b = sc.nextDouble();

                double result = 0;

                switch (ch){
                    case 1:
                        result = calStub.add(a, b);
                        break;
                    case 2:
                        result = calStub.subtract(a, b);
                        break;
                    case 3:
                        result = calStub.multiply(a, b);
                        break;
                    case 4:
                        result = calStub.divide(a, b);
                        break;
                    default:
                        throw new AssertionError();
                }

                System.out.println("Result: " + result);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
