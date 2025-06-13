/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superfishgame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author codem
 */
public class BGPanel extends JPanel {
    private final Image image;
    private final int[] dimensions;
    private int[] colour = {0,0,0};
    private static ImageObserver observer;
    public String font = "Arial";
    public int size = 36;
    Font drawFont = new Font(font, 0, size);
    String message = "";
    int x = 10;
    int y = 40;
    
    public BGPanel() {
        this.image = new ImageIcon("./resources/background.png").getImage();
        this.dimensions = new int[]{image.getWidth(observer), image.getHeight(observer)};
    }
        
    public int[] getDimensions()
    {
        return dimensions;
    }
        
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setFont(drawFont);
        g.setColor(new Color(colour[0],colour[1],colour[2]));
        g.drawImage(this.image, 0, 0, null);
        g.drawString(message, x, y);
    }
    
    public void updateText(String s)
    {
        message = s;
        repaint();
    }
    
    public void updateColour(int[] newColours)
    {
        colour = new int[] {newColours[0], newColours[1], newColours[2]};
        repaint();
    }
    
    public void resetColours()
    {
        colour = new int[] {0, 0, 0};
        repaint();
    }
    
}
