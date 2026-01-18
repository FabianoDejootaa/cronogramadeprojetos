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
import javax.swing.SwingConstants;

/**
 * Classe de gerenciamento da tela de login.
 * @author Fabiano Aparecido Mariano de Oliveira.
 * @since 17/01/2026.
 * @version 0.0.1 (Em desenvolvimento).
 */
public class LoginView extends JFrame {
    
    private final short WIDTH = 800;
    private final short HEIGHT = 600;
    
    private final Font CALIBRI_32 = new Font("Calibri", Font.BOLD, 32);
    private final Font CALIBRI_40 = new Font("Calibri", Font.BOLD, 40);
    
    private final Color DARK_GRAY = new Color(75,75,75);
    private final Color DARK_RED = new Color(255,50,95);
    
    private final URL URL_ICON_TITLE = LoginView.class.getResource("/imgs/icon_title.png");
    
    private ImageIcon iconTitle = new ImageIcon(URL_ICON_TITLE);
    
    private GridBagConstraints gbc = new GridBagConstraints();
    
    private JPanel background;

    private RoundedPanel pnTitle;
    
    private JLabel lbTitle;
    private JLabel lbName;
    
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
        background.setBackground(DARK_GRAY);
        
        pnTitle = new RoundedPanel(
                new Dimension((int)(WIDTH * 0.925), (int)(HEIGHT * 0.3)),
                Color.WHITE,
                50
        );
        pnTitle.setBackground(Color.WHITE);
        
        lbTitle = new JLabel();
        lbTitle.setFont(CALIBRI_40);
        lbTitle.setText("CRONOGRAMA DE PROJETOS");
        lbTitle.setForeground(DARK_RED);
        
        lbName = new JLabel();
        lbName.setFont(CALIBRI_32);
        lbName.setText("NOME DE USUARIO");
        lbName.setForeground(Color.WHITE);
        lbName.setHorizontalAlignment(SwingConstants.CENTER);
       
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
    /**
     *  Método de inserção de componentes no background.
     */
    private void insertOnBackground() {
        resetGbc();
        
        background.add(pnTitle, gbc);
        
        insertOnPnTitle();
        
    }
    /** 
     *  Método de inserção de componentes no painel do título.
     */
    private void insertOnPnTitle() {
        resetGbc();
        
        pnTitle.add(lbIconTitle, gbc);
        
        gbc.gridx = 1;
        gbc.insets = new Insets(0, 20, 0, 0);
        
        pnTitle.add(lbTitle, gbc);
        
    }
    /**
     *  Método para reiniciar as configurações do GridBagConstraints.
     */
    private void resetGbc() {
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
