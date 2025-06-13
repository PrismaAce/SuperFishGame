/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superfishgame;

import java.awt.*;
import javax.swing.*;
import superfishgame.Fish.Fish;

/**
 *
 * @author codem
 */
public class FishLabel extends JLabel {
    Image originalImage;
    Fish fish = SuperFishGame.FishMap.Map.get(1);
    public FishLabel(Fish fish)
    {
        super(fish.getIcon());
        originalImage = fish.getImage();
        
    }
}
