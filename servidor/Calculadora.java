import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class Calculadora extends UnicastRemoteObject implements ICalculadora {

    public Calculadora() throws RemoteException { 
		//super() is allways called!
    }

    public int adicao(int x, int y) throws RemoteException { 
        return x + y;
    }

    public int subtracao(int x, int y) throws RemoteException { 
        return x - y;
    }
	
    public int multiplicacao(int x, int y) throws RemoteException { 
        return x * y;
    }
	
    public double divisao(int x, int y) throws RemoteException { 
        return x / y;
    }
}