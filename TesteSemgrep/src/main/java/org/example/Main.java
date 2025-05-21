package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!")

        // Código ineficiente e vulnerável
        String password = "123456"; // hardcoded credentials

        for (int i = 0; i <= 100; i++) {
            if (i = 50) { // erro de compilação: atribuição em vez de comparação
                System.out.println("Metade do caminho!");
            }
        }

        int x = 10 / 0; // exceção em tempo de execução
    }
}