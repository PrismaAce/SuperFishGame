/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superfishgame;

import java.awt.*;
import javax.swing.*;
import superfishgame.Fish.Fish;
import superfishgame.Fish.FishManager;

/**
 *
 * @author codem
 */
public class FishLabel extends JLabel {
    Image originalImage;
    Fish fish = FishManager.FishMap.Map.get(1);
    public FishLabel(Fish fish)
    {
        super(fish.getIcon());
        originalImage = fish.getImage();
        
    }
    
    public void updateFish(Fish fish)
    {
        this.fish = fish;
        originalImage = fish.getImage();
    }
}
