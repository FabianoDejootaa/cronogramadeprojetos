package view;

import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Classe de gerenciamento da tela de login.
 * @author Fabiano Aparecido Mariano de Oliveira.
 * @since 17/01/2026.
 * @version 0.0.1 (Em desenvolvimento).
 */
public class LoginView extends JFrame {
    
    private final short WIDTH = 800;
    private final short HEIGHT = 600;
    
    private JPanel background;
    
    /**
     *  Construtor da classe.
     */
    public LoginView() {
        this.setTitle("CronoProject");
        this.setSize(WIDTH, HEIGHT);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        customComponents();
        insertComponents();
        
        this.setVisible(true);
    }
    /**
     *  Método de customização de componentes da UI.
     */
    private void customComponents() {
        background = new JPanel(new GridBagLayout());
        background.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        background.setBackground(Color.LIGHT_GRAY);
    }
    /**
     *  Método de inserção de componentes na UI.
     */
    private void insertComponents() {
        this.add(background);
    }
}
