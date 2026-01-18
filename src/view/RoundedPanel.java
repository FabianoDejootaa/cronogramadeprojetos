package view;

import java.awt.Dimension;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.GridBagLayout;

import javax.swing.JPanel;

/**
 *  Classe de renderização gráfica do JPanel.
 *  @author Fabiano Aparecido Mariano de Oliveira.
 *  @since 18/01/2026.
 *  @version 0.0.1
 */
public class RoundedPanel extends JPanel {
    
    private Dimension size;
    
    private Color color;
    
    private int radius;
    
    /**
     * Construtor da classe.
     * @param size Tamanho do objeto.
     * @param color Cor do objeto.
     * @param radius Raio da borda arredondada.
     */
    public RoundedPanel (Dimension size, Color color, int radius) {
        super();
        this.size = size;
        this.color = color;
        this.radius = radius;
        
        this.setOpaque(false);
        this.setPreferredSize(size);  
        this.setLayout(new GridBagLayout());
    }
    /**
     *  Método de renderização gráfica do JPanel.
     *  Sobreescrita para implementar bordas arredondadas.
     *  @param g Objeto de manipulação da renderização gráfica.
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    
        Graphics2D g2D = (Graphics2D) g;
        
        g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        
        g2D.setColor(color);
        
        g2D.fillRoundRect(0, 0, size.width, size.height, radius, radius);
    }
}
