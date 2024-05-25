package ltm_25052024.Bai17_RMI_Calculator.server;

import java.rmi.RemoteException;

public interface CalculatorInterface {
    double add(double a, double b) throws RemoteException;
    double subtract(double a, double b) throws RemoteException;
    double multiply(double a, double b) throws RemoteException;
    double divide(double a, double b) throws RemoteException;
}
