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
 * Louvado seja o Senhor Jesus Cristo, salvador e consolador de nossas almas!
 * Classe de gerenciamento da tela de login.
 * @author Fabiano Aparecido Mariano de Oliveira.
 * @since 17/01/2026.
 * @version 0.0.1 (Em desenvolvimento).
 */
public class LoginView extends JFrame {
    
    private final short WIDTH = 800;
    private final short HEIGHT = 600;
    
    private final Font ALMENDRA_28 = new Font("Almendra", Font.PLAIN, 28);
    private final Font ALMENDRA_22 = new Font("Almendra", Font.PLAIN, 22);
    private final Font MONTSERRAT_35 = new Font("Montserrat", Font.PLAIN, 35);
    
    private final Color DARK_GRAY = new Color(75,75,75);
    private final Color DARK_RED = new Color(255,71,90);
    
    private final URL URL_ICON_TITLE = LoginView.class.getResource("/imgs/icon_title.png");
    
    private ImageIcon iconTitle = new ImageIcon(URL_ICON_TITLE);
    
    private GridBagConstraints gbc = new GridBagConstraints();
    
    private JPanel background;

    private RoundedPanel pnTitle;
    private RoundedPanel pnMain;
    
    private JLabel lbTitle;
    private JLabel lbName;
    private JLabel lbNameSpacer;
    private JLabel lbPass;
    
    private ResolutionLabel lbIconTitle;
    
    private RoundedTextField tfName;
    
    private RoundedPassField tfPass;
    
    private RoundedButton btnLogin;
    
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
                new Dimension((int)(WIDTH * 0.925), (int)(HEIGHT * 0.25)),
                Color.WHITE,
                50
        );
        pnTitle.setBackground(Color.WHITE);
        
        pnMain = new RoundedPanel(
                new Dimension((int)(WIDTH * 0.925), (int)(HEIGHT * 0.60)),
                Color.WHITE,
                50
        );
        lbTitle = new JLabel();
        lbTitle.setFont(MONTSERRAT_35);
        lbTitle.setText("CRONOGRAMA DE PROJETOS");
        lbTitle.setForeground(DARK_RED);
        
        lbName = new JLabel();
        lbName.setFont(ALMENDRA_28);
        lbName.setText("NOME DE USUARIO");
        lbName.setForeground(DARK_RED);
        lbName.setHorizontalAlignment(SwingConstants.CENTER);
        
        lbPass = new JLabel();
        lbPass.setFont(ALMENDRA_28);
        lbPass.setText("SENHA DE USUÁRIO");
        lbPass.setForeground(DARK_RED);
        lbPass.setHorizontalAlignment(SwingConstants.CENTER);
        
        lbNameSpacer = new JLabel();
        
        lbIconTitle = new ResolutionLabel();
        lbIconTitle.setIcon(iconTitle);
        
        tfName = new RoundedTextField(
                new Dimension((int)(WIDTH * 0.80), (int)(HEIGHT * 0.1)),
                Color.WHITE,
                Color.BLACK,
                50
        );
        tfName.setFont(ALMENDRA_28);
        tfName.setSelectionColor(DARK_RED);
        
        tfPass = new RoundedPassField(
            new Dimension((int)(WIDTH * 0.80), (int)(HEIGHT * 0.1)),
            Color.WHITE,
            Color.BLACK,
            50
        );
        tfPass.setFont(ALMENDRA_28);
        tfPass.setSelectionColor(DARK_RED);
        
        btnLogin = new RoundedButton(
            new Dimension((int)(WIDTH * 0.6), (int)(HEIGHT * 0.15)),
            DARK_RED,
            Color.BLACK,
            50
        );
        btnLogin.setFont(ALMENDRA_28);
        btnLogin.setText("LOGIN");
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
        
        gbc.gridy = 1;
        gbc.insets = new Insets(20, 0, 0, 0);
        
        background.add(pnMain, gbc);
        
        insertOnPnTitle();
        insertOnPnMain();
    }
    /** 
     *  Método de inserção de componentes no painel do título.
     */
    private void insertOnPnTitle() {
        resetGbc();
        
        pnTitle.add(lbIconTitle, gbc);
        
        gbc.gridx = 1;
        gbc.insets = new Insets(0, 10, 0, 0);
        
        pnTitle.add(lbTitle, gbc);
    }
    /**
     *  Método de inserção de componentes no painel principal.
     */
    private void insertOnPnMain() {
        resetGbc();
        
        gbc.insets = new Insets(0, 50, 0, 0);
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.WEST;
        
        pnMain.add(lbName, gbc);
        
        gbc.gridx = 1;
        gbc.weightx = 1.0;
        gbc.insets = new Insets(0, 0, 0, 0);
        
        pnMain.add(lbNameSpacer, gbc);
        
        gbc.gridy = 1;
        gbc.gridx = 0;
        gbc.weightx = 0.0;
        gbc.insets = new Insets(5, 40, 0, 0);
        
        pnMain.add(tfName, gbc);
        
        gbc.gridy = 2;
        gbc.gridx = 0;
        gbc.insets = new Insets(10, 50, 0, 0);
        
        pnMain.add(lbPass, gbc);
        
        gbc.gridy = 3;
        gbc.insets = new Insets(5, 40, 0, 0);
        
        pnMain.add(tfPass, gbc);
        
        gbc.gridy = 4;
        gbc.insets = new Insets(15, 0, 0, 0);
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.CENTER;
        
        pnMain.add(btnLogin, gbc);
        
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
