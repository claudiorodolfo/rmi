import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ICalculadora extends Remote {
	
    int adicao(int x, int y) throws RemoteException;
    int subtracao(int x, int y) throws RemoteException;
    int multiplicacao(int x, int y) throws RemoteException;
    double divisao(int x, int y) throws RemoteException;
}