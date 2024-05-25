package ltm_25052024.Bai17_RMI_Calculator.server;

import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) {
        try{
            Registry registry = LocateRegistry.createRegistry(1099);
            CalculatorInterface calculatorSkeleton = new Calculatorlmpl();
            registry.rebind("Calculator", (Remote) calculatorSkeleton);
            while (true){
                System.out.println("Server is running ...");
                Thread.sleep(5000);
            }
        }catch (Exception ex){}

    }
}
