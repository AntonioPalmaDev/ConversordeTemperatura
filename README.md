# Sistema Cliente-Servidor com Java RMI

Este projeto implementa um sistema cliente-servidor usando **Java RMI (Remote Method Invocation)** para conversão de temperatura entre Celsius e Fahrenheit.

## 📌 Estrutura do Projeto

- **ConversorTemperatura.java** → Interface remota que define os métodos do serviço.
- **ConversorTemperaturaImpl.java** → Implementação da interface remota.
- **ServidorRMI.java** → Classe que registra o serviço no RMI Registry.
- **ClienteRMI.java** → Cliente que solicita conversões ao servidor.

---

## 🚀 Como Executar o Projeto

### 🖥️ Rodando no Localhost (Mesma Máquina)

1️⃣ **Compilar os arquivos Java**
```sh
javac -d src src/*.java
```

2️⃣ **Iniciar o Registro RMI**
```sh
rmiregistry &
```

3️⃣ **Executar o Servidor**
```sh
java -cp src src.ServidorRMI
```
Saída esperada: `Servidor pronto!`

4️⃣ **Executar o Cliente** (em outro terminal)
```sh
java -cp src src.ClienteRMI
```

---

### 🌍 Rodando em Máquinas Diferentes

#### 🔹 No Servidor (Máquina que hospedará o serviço)
1️⃣ **Obter o IP da máquina**
```sh
ipconfig # Windows
ifconfig  # Linux/macOS
```
Exemplo de IP: `192.168.1.10`

2️⃣ **Compilar os arquivos Java**
```sh
javac *.java
```

3️⃣ **Iniciar o Registro RMI**
```sh
rmiregistry &
```

4️⃣ **Executar o Servidor**
```sh
java ServidorRMI
```

#### 🔹 No Cliente (Outra máquina)
1️⃣ **Configurar o IP do servidor no código do cliente**
No `ClienteRMI.java`, altere:
```java
Registry registry = LocateRegistry.getRegistry("192.168.1.10", 1099);
```

2️⃣ **Compilar o Cliente**
```sh
javac ClienteRMI.java
```

3️⃣ **Executar o Cliente**
```sh
java ClienteRMI
```

---

## 🔥 Possíveis Erros e Soluções

❌ **"java.rmi.ConnectException: Connection refused"**
🔹 Verifique se o `rmiregistry` e o servidor estão rodando.

❌ **"Address already in use: bind"**
🔹 A porta 1099 já está ocupada. Use outra porta ao iniciar o RMI Registry.
```sh
rmiregistry 2020 &
java ServidorRMI
```
🔹 No Cliente, altere:
```java
Registry registry = LocateRegistry.getRegistry("192.168.1.10", 2020);
```

---

## 📚 Referências
- Documentação Java RMI: https://docs.oracle.com/javase/tutorial/rmi/

---

Qualquer dúvida, entre em contato! 🚀

