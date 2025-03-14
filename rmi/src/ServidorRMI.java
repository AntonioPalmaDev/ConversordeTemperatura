package src;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class ServidorRMI {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099); // Inicia o RMI Registry na porta padrão 1099
            ConversorTemperaturaImpl servico = new ConversorTemperaturaImpl();
            Naming.rebind("rmi://localhost/ConversorTemperatura", servico);
            System.out.println("Servidor RMI pronto...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

