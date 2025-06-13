/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superfishgame.Fish;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import superfishgame.SuperFishModel;

/**
 *
 * @author codem
 */
public class FishManager {
    private SuperFishModel model;
    public FishManager(SuperFishModel model)
    {
        this.model = model;
        Fish.createAndRegister(model, 1, "fish", "Normal Fish");
        Fish.createAndRegister(model, 2, "happyfish", "Happy Fish");
        Fish.createAndRegister(model, 3, "ogrefish", "Ogre Fish");
        RareFish.createAndRegister(model,4, "negativefish", 2, "Negative Fish", new int[] {0,40,255});
        RareFish.createAndRegister(model,5, "evilfish", 2, "Evil Fish", new int[] {255,1,1});
        RareFish.createAndRegister(model,6, "glitchyfish", 2, "Evil Fish", new int[] {20,255,1});
        RareFish.createAndRegister(model,7, "evilfish", 5, "Super Evil Fish", new int[] {255,1,1});
        RareFish.createAndRegister(model,8, "fishbone", 10, "Fishbone", new int[] {120,120,120});
    }
    
    public static class FishMap
    {
        public static final HashMap<Integer, Fish> Map = new HashMap<>();
        
        public static Fish getRandomFish()
        {
            List<Fish> fishList = new ArrayList<>(Map.values());
            double totalWeight = 0;
            for (Fish fish : fishList) 
            {
                totalWeight += fish.getWeight();
            }
            Random r = new Random();
            // i miss you c# weightedrandom
            double rand = r.nextDouble() * totalWeight;
            double weight = 0;
            for (Fish fish : fishList) 
            {
                weight += fish.getWeight();
                if (rand <= weight) 
                {
                    return fish;
                }
            }
            // this shouldnt happen but hey if it does you get default fish :)
            return fishList.get(0);
        }
    }
    

    
    

}
