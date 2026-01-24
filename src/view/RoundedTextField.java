package view;

import java.awt.BasicStroke;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.BorderFactory;

import javax.swing.JTextField;

/**
 *  Louvado seja o Senhor Jesus Cristo, salvador e consolador de nossas almas!
 *  Classe de reconstrução do JTextField.
 *  Reescrita para criar um campo de texto arredondado.
 *  @author Fabiano Aparecido Mariano de Oliveira.
 *  @since 19/01/2026
 *  @version 0.0.2 - Ultima atualização em 24/01/2026.
 */
public class RoundedTextField extends JTextField {
    
    private Dimension size;
    
    private Color color;
    private Color borderColor;
    
    private int radius;
    
    /**
     * Construtor da classe.
     * @param size Tamanho.
     * @param color Cor de fundo.
     * @param borderColor Cor da borda.
     * @param radius  Raio da borda.
     */
    public RoundedTextField(Dimension size, Color color, Color borderColor, int radius) {
        super();
        
        this.size = size;
        this.color = color;
        this.borderColor = borderColor;
        this.radius = radius;
        
        this.setPreferredSize(size);
        this.setOpaque(false);
        this.setBackground(color);
        this.setForeground(borderColor);
    }

    /**
     * Sobreescrita da renderização do botão.
     * @param g Objeto de manipulação da renderização.
     */
    @Override
    protected void paintComponent(Graphics g) {
        
        Graphics2D g2D = (Graphics2D) g;
        
        g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        g2D.setColor(this.getBackground());
        
        g2D.fillRoundRect(0, 0, this.getWidth(), this.getHeight(), radius, radius);

        super.paintComponent(g2D);
        
        this.setBorder(null);
        
        g2D.setColor(borderColor);
        
        g2D.setStroke(new BasicStroke(2));
        
        this.setBorder(BorderFactory.createEmptyBorder(0, 25, 0, 0));
        
        g2D.drawRoundRect(6, 6, this.getWidth() - 12, this.getHeight() - 12, radius, radius);
        
        this.paintBorder(g2D);
    }
}
