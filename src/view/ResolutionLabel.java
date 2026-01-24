package view;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JLabel;

/**
 *  Louvado seja o Senhor Jesus Cristo, salvador e consolador de nossas almas!
 *  Classe de reconstrução do JLabel.
 *  Reconstrução da renderização de imagens com ativação de antiserrilhado.
 *  @author Fabiano Aparecido Mariano de Oliveira.
 *  @since 18/01/2026.
 *  @version 0.0.1
 */
public class ResolutionLabel extends JLabel{
    
    /**
     *  Construtor da classe.
     */
    public ResolutionLabel () {
        super();
    }
    
    /**
     *  Método de renderização do objeto.
     *  Sobreescrita para ativar a renderização com configuração bilinear da GPU.
     *  @param g Objeto de manipulação de renderização.
     */
    @Override
    protected void paintComponent(Graphics g) {
        
        Graphics2D g2D = (Graphics2D) g;
        
        g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
    
        super.paintComponent(g);
    }
}
