//Compilar as classes normalmente
//Gerar Stubs (Calculadora_Stub.java e Calculadora_Stub.class) para comunicação remota com o comando a seguir
//rmic -keep Calculadora

//rodar setando as políticas de segurança
//-Djava.security.manager garante que o gerenciador de segurança padrão está instalado e, portanto, o aplicativo está sujeito as verificações das política
//java -Djava.security.manager -Djava.security.policy=server.policy ServidorRMI
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class ServidorRMI {
    
	public static void main(String[] args) {
        try {
			// cria um objeto para se tornar acessível via rede
            ICalculadora calc = new Calculadora();
            String objName = "rmi://localhost/Calc";
			
            System.out.println("Registrando o objeto no RMIRegistry...");
			LocateRegistry.createRegistry(1099);
            Naming.rebind(objName, calc);
			
            System.out.println("Aguardando Clientes!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    } 
}
