import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Main {

    public static void main(String[] args) throws IOException {
        String login; //Variavel que guardará o login do servidor.
        String host; //Variavel que guardará o host do servidor.
        String password; //Variável que guardará o password do usúario."
        int numero, numero2;
        System.out.println("************Teste de leitura do arquivo de propriedades************");
        Manipulador man = new Manipulador();

        Properties prop = man.getProp();

        login = prop.getProperty("prop.server.login");
        host = prop.getProperty("prop.server.host");
        password = prop.getProperty("prop.server.password");
        numero = Integer.parseInt(prop.getProperty("numeroDeTeste" + 1));
        numero2 = Integer.parseInt(prop.getProperty("numeroDeTeste" + 2));

        int quantidade, buffer1, buffer2, buffer3, buffer4;

        quantidade = Integer.parseInt(prop.getProperty("quantidadeDeArestas"));

        for(int i = 0; i < quantidade; i++)
        {
            buffer1 = Integer.parseInt(prop.getProperty("aresta" + i + "Peso"));
            buffer2 = Integer.parseInt(prop.getProperty("aresta" + i + "VerticeInicial"));
            buffer3 = Integer.parseInt(prop.getProperty("aresta" + i + "VerticeFinal"));
            buffer4 = Integer.parseInt(prop.getProperty("aresta" + i + "Quadrante"));
            System.out.println(buffer1);
            System.out.println(buffer2);
            System.out.println(buffer3);
            System.out.println(buffer4);
        }

        System.out.println("Login = " + login);
        System.out.println("Host = " + host);
        System.out.println("Password = " + password);
        System.out.println("Numero 1 = " + numero);
        System.out.println("Numero 2 = " + numero2);
    }
}
