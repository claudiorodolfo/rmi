//Compilar as classes normalmente
//Usar Calculadora_Stub.class gerada por rmic

//rodar setando as políticas de segurança
//-Djava.security.manager garante que o gerenciador de segurança padrão está instalado e, portanto, o aplicativo está sujeito as verificações das política
//java -Djava.security.manager -Djava.security.policy=client.policy ClienteRMI
import java.rmi.Naming;
import java.rmi.RemoteException;

public class ClienteRMI {

	public static void main(String[] args) throws Exception {
		String objName = "rmi://localhost:1099/Calc";
        ICalculadora calc = (ICalculadora) Naming.lookup(objName);
		System.out.println("O Resultado da soma é: " + calc.adicao(1, 2));
	}
}