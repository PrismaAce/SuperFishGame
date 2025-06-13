/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superfishgame.Fish;

import superfishgame.SuperFishGame;

/**
 *
 * @author codem
 */
public class RareFish extends Fish {
    int[] colour = {255, 255, 255};
    public RareFish(int ID, String spritePath, int rarity, String name, int[] colour) {
        super(ID, spritePath, rarity, name);
        this.rarity = rarity;
        this.colour = colour;
    }
    
    public static RareFish createAndRegister(int ID, String spritePath, int rarity, String name, int[] colour) {
        RareFish fish = new RareFish(ID, spritePath, rarity, name, colour);
        SuperFishGame.FishMap.Map.put(ID, fish);
        return fish;
    }
    
}
