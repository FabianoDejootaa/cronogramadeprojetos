package view;

import java.awt.BasicStroke;
import javax.swing.JButton;

import java.awt.Dimension;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.BorderFactory;
import javax.swing.ButtonModel;

/**
 *  Louvado seja o Senhor Jesus Cristo, salvador e consolador de nossas almas!
 *  Classe de reconstrução do JButton.
 *  Reescrita para criar um botão arredondado.
 *  @author Fabiano Aparecido Mariano de Oliveira.
 *  @since 24/01/2026
 *  @version 0.0.1
 */
public class RoundedButton extends JButton {
    
    private Dimension size;
    
    private Color color;
    private Color borderColor;
    
    private int radius;
    
    /**
     * Construtor da classe.
     * @param size Tamanho.
     * @param color Cor de fundo.
     * @param borderColor Cor de borda.
     * @param radius Raio de borda.
     */
    public RoundedButton(Dimension size, Color color, Color borderColor, int radius) {
        this.size = size;
        
        this.color = color;
        this.borderColor = borderColor;
        
        this.radius = radius;
        
        this.setPreferredSize(size);
        this.setBackground(color);
        this.setForeground(borderColor);
        this.setOpaque(false);
    }
    @Override
    protected void paintComponent(Graphics g) {
        
        Graphics2D g2D = (Graphics2D) g.create();
        
        g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        g2D.setColor(color);
        
        ButtonModel model = this.getModel();
        
        if(model.isPressed()) {
            g2D.setColor(color.darker());
        } else if(model.isRollover()) {
            g2D.setColor(color.brighter());
        } else {
            g2D.setColor(color);
        }
        
        g2D.fillRoundRect(0, 0, this.getWidth(), this.getHeight(), radius, radius);
        
        super.paintComponent(g2D);
        
        this.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        
        g2D.setColor(borderColor);
        
        g2D.setStroke(new BasicStroke(4));
        
        g2D.drawRoundRect(2, 2, this.getWidth() - 4, this.getHeight() - 4, radius, radius);
        
        this.paintBorder(g2D);
    }
    
    
}
