/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package superfishgame;

import java.util.HashMap;
import superfishgame.Fish.*;

/**
 *
 * @author codem
 */
public class SuperFishGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FishManager fm = new FishManager();
        SuperFishModel model = new SuperFishModel();
        SuperFishView view = new SuperFishView();
        SuperFishController controller = new SuperFishController(model, view);
    }
    
}
