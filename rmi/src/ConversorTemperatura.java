package src;

    import java.rmi.Remote;
    import java.rmi.RemoteException;
    
    public interface ConversorTemperatura extends Remote {
        double celsiusParaFahrenheit(double celsius) throws RemoteException;
        double fahrenheitParaCelsius(double fahrenheit) throws RemoteException;
    }
    





