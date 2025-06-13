/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superfishgame;

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
    private static ImageObserver observer;
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
        g.drawImage(this.image, 0, 0, null);
    }
}
