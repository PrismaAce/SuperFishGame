/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superfishgame.Fish;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**
 *
 * @author codem
 */
public class FishManager {
    public FishManager()
    {
        Fish.createAndRegister(1, "fish", "Normal Fish");
        Fish.createAndRegister(2, "fish", "Normal Fish 2");
        RareFish.createAndRegister(3, "fish", 2, "Normal Fish 3", new int[] {255,1,1});
    }
    
    public static class FishMap
    {
        public static final HashMap<Integer, Fish> Map = new HashMap<>();
        
        public Fish getRandomFish()
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
