package main;

import view.LoginView;

/**
 * Louvado seja o Senhor Jesus Cristo, salvador e consolador de nossas almas!
 * Classe de inicialização do sistema.
 * @author Fabiano Aparecido Mariano de Oliveira.
 * @since 17/01/2026.
 * @version 0.0.1 (Em desenvolvimento).
 */
public class Initialize {
    /**
     *  Método main.
     *  @param args Argumentos do método main.
     */
    public static void main(String args[]) {
        new Thread(() -> {
            final int MB = 1024 * 1024;
            
            short memoryUsage = (short)((Runtime.getRuntime().totalMemory()- 
                Runtime.getRuntime().freeMemory()) / MB);
            
            while(!Thread.currentThread().isInterrupted()) {
                try {
                    System.out.println("Uso de memória: " + memoryUsage + " MB");
                    Thread.sleep(1000);
                } catch(InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
            }
        }).start();
        new Thread(() -> {
            LoginView view = new LoginView();
        }).start();
    }
}
