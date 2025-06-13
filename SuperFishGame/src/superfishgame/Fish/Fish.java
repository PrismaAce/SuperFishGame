/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superfishgame.Fish;

import java.awt.Image;
import javax.swing.ImageIcon;
import superfishgame.SuperFishGame;

/**
 *
 * @author codem
 */
public abstract class Fish {
    private int fishID;
    private String spritePath;
    private Image image;
    private ImageIcon icon;
    int rarity = 1;
    private String name;
    public Fish (int ID, String spritePath, int rarity, String name)
    {
        String fullPath = "./resources/fish/";
        if (spritePath == null) {
            System.out.println("defaulting");
            fullPath += "fish.png";
        }
        else fullPath += spritePath+".png";
        this.image = new ImageIcon(fullPath).getImage();
        this.icon = new ImageIcon(fullPath);
        
        this.fishID = ID;
        this.rarity = rarity;
        this.name = name;
    }
    
    public int getID()
    {
        return this.fishID;
    }
    
    public ImageIcon getIcon()
    {
        return this.icon;
    }
    
    public Image getImage()
    {
        return this.image;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public double getWeight() {
        return 1.0 / rarity;
    }
    
    public static Fish createAndRegister(int ID, String spritePath, String name) {
        Fish fish = new Fish(ID, spritePath, 1, name) {};
        FishManager.FishMap.Map.put(ID, fish);
        return fish;
    }
}
