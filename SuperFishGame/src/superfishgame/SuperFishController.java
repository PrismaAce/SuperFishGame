/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superfishgame;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.ImageObserver;
import javax.swing.ImageIcon;
import superfishgame.Fish.FishManager;
import superfishgame.Fish.RareFish;

/**
 *
 * @author codem
 */
public class SuperFishController {
    private SuperFishModel model;
    private SuperFishView view;
    private static ImageObserver observer;
    
    public SuperFishController(SuperFishModel model, SuperFishView view)
    {
        this.model = model;
        this.view = view;
        
        view.fishButton.addActionListener(new Hook());
        view.lastCaught.addMouseListener(new Hover());
    }
    
    class Hook implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            System.out.println("Fish");
            view.lastCaught.updateFish(FishManager.FishMap.Map.get(3));
            view.updateLastCaught(FishManager.FishMap.Map.get(3));
        }
    }
    
    class Hover implements MouseListener
    {
        @Override
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            if(evt.getSource() instanceof FishLabel label)
            {
                Image image = label.originalImage;
                Image scaled = image.getScaledInstance((int)(image.getWidth(observer) * 1.1),(int)(image.getHeight(observer) * 1.1),Image.SCALE_SMOOTH);
                view.lastCaught.setIcon(new ImageIcon(scaled));
                view.panel.updateText(label.fish.getName());
                if (label.fish instanceof RareFish rf)
                {
                    view.panel.updateColour(rf.getColour());
                }
            }
        }

        @Override
        public void mouseExited(java.awt.event.MouseEvent evt) {
            if(evt.getSource() instanceof FishLabel)
            {
                view.lastCaught.setIcon(new ImageIcon(view.lastCaught.originalImage));
                view.panel.updateText("");
                view.panel.resetColours();
            }
        }

        @Override
        public void mouseClicked(MouseEvent e) {}

        @Override
        public void mousePressed(MouseEvent e) {}

        @Override
        public void mouseReleased(MouseEvent e) {}
    }/**/
    
    
}
