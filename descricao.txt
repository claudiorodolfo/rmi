//Sobre as políticas/diretrizes de segurança do Java
//https://docs.oracle.com/javase/7/docs/technotes/tools/windows/policytool.html
//https://docs.oracle.com/javase/7/docs/technotes/guides/security/PolicyFiles.html
//Há um programa dentro do próprio Java que permite criar e alterar arquivos de politicas/diretrizes de segurança chamado policytool
//ele está em "%JAVA_HOME%/bin/policytool.exe"
 
Servidor
//Compilar as classes normalmente
//Gerar Stubs (Calculadora_Stub.java e Calculadora_Stub.class) para comunicação remota com o comando a seguir
//rmic -keep Calculadora
//rodar setando as políticas de segurança
//-Djava.security.manager garante que o gerenciador de segurança padrão está instalado e, portanto, o aplicativo está sujeito as verificações das política
//java -Djava.security.manager -Djava.security.policy=server.policy ServidorRMI


Cliente
//Compilar as classes normalmente
//Usar Calculadora_Stub.class gerada por rmic
//rodar setando as políticas de segurança
//-Djava.security.manager garante que o gerenciador de segurança padrão está instalado e, portanto, o aplicativo está sujeito as verificações das política
//java -Djava.security.manager -Djava.security.policy=client.policy ClienteRMI