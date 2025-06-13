/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superfishgame.Fish;

/**
 *
 * @author codem
 */
public class FishManager {
    public FishManager()
    {
        Fish.createAndRegister(1, "fish", 1, "Normal Fish");
        Fish.createAndRegister(2, "fish", 1, "Normal Fish 2");
        RareFish.createAndRegister(3, "fish", 1, "Normal Fish 3", new int[] {255,1,1});
    }
}
