package view;

import javax.swing.JFrame;

/**
 * Classe de gerenciamento da tela de login.
 * @author Fabiano Aparecido Mariano de Oliveira.
 * @since 17/01/2026.
 * @version 0.0.1 (Em desenvolvimento).
 */
public class LoginView extends JFrame {
    
    /**
     *  Construtor da classe
     *  @author Fabiano Aparecido Mariano de Oliveira.
     *  @since 17/01/2026.
     */
    public LoginView() {
        this.setTitle("CronoProject");
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
