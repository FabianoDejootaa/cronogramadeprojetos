package view;

import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.GridBagConstraints;

import java.net.URL;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

/**
 * Classe de gerenciamento da tela de login.
 * @author Fabiano Aparecido Mariano de Oliveira.
 * @since 17/01/2026.
 * @version 0.0.1 (Em desenvolvimento).
 */
public class LoginView extends JFrame {
    
    private final short WIDTH = 800;
    private final short HEIGHT = 600;
    
    private final Font CALIBRI_22 = new Font("Calibri", Font.BOLD, 22);
    
    private URL iconTitleUrl = LoginView.class.getResource("/imgs/icon_title.png");
    
    private ImageIcon iconTitle = new ImageIcon(iconTitleUrl);
    
    private GridBagConstraints gbc = new GridBagConstraints();
    
    private JPanel background;
    
    private JLabel lbTitle;
    
    private ResolutionLabel lbIconTitle;
    
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
        
        lbTitle = new JLabel();
        lbTitle.setFont(CALIBRI_22);
        lbTitle.setForeground(Color.BLACK);
        
        lbIconTitle = new ResolutionLabel();
        lbIconTitle.setIcon(iconTitle);
    }
    /**
     *  Método de inserção de componentes na UI.
     */
    private void insertComponents() {
        this.add(background);
        
        insertOnBackground();
    }
    private void insertOnBackground() {
        restartGbc();
        
        background.add(lbIconTitle, gbc);
        
        gbc.gridx = 1;
        
        background.add(lbTitle, gbc);
    }
    private void restartGbc() {
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 0.0;
        gbc.weighty = 0.0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(0, 0, 0, 0);
    }
}
