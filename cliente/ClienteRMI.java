import java.rmi.Naming;
import java.rmi.RemoteException;

public class ClienteRMI {

	public static void main(String[] args) throws Exception {
		String objName = "rmi://localhost:1099/Calc";
        ICalculadora calc = (ICalculadora) Naming.lookup(objName);
		System.out.println("O Resultado da soma é: " + calc.adicao(1, 2));
	}
}