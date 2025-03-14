package src;

import java.rmi.Naming;
import java.util.Scanner;

public class ClienteRMI {
    public static void main(String[] args) {
        try {
            ConversorTemperatura servico = (ConversorTemperatura) Naming.lookup("rmi://localhost/ConversorTemperatura");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite a temperatura: ");
            double temperatura = scanner.nextDouble();
            
            System.out.print("Converter para (1) Fahrenheit ou (2) Celsius? ");
            int escolha = scanner.nextInt();
            
            if (escolha == 1) {
                System.out.println("Resultado: " + servico.celsiusParaFahrenheit(temperatura) + " °F");
            } else if (escolha == 2) {
                System.out.println("Resultado: " + servico.fahrenheitParaCelsius(temperatura) + " °C");
            } else {
                System.out.println("Opção inválida!");
            }

            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
