package com.cic.game2;

import com.jme3.app.SimpleApplication;
import com.jme3.bullet.collision.PhysicsCollisionEvent;
import com.jme3.bullet.collision.PhysicsCollisionListener;
import com.jme3.input.controls.ActionListener;
import com.jme3.system.AppSettings;
import java.util.logging.Logger;

public class Game2Application extends SimpleApplication implements PhysicsCollisionListener {

    private static final Logger log = Logger.getLogger(Game2Application.class.getName());

    public static void main(String[] args) {
//        JinputDriverExtractor.extract();

        Game2Application app = new Game2Application();

        //app.setShowSettings(false);
        AppSettings mySettings = new AppSettings(true);
        mySettings.setVSync(true);
        mySettings.setSamples(2);
        mySettings.setResolution(1024, 768);
        mySettings.setTitle("Game2");
//        mySettings.setSettingsDialogImage("Textures/splash.png");

        app.setSettings(mySettings);

        app.start();
    }

    public Game2Application() {
        super();

    }

    @Override
    public void simpleInitApp() {
        /* Setup camera */
        flyCam.setEnabled(false);

        setDisplayStatView(false);
    }

    private ActionListener actionListener = new ActionListener() {
        public void onAction(String name, boolean keyPressed, float tpf) {
            /*if (name.equals("ToggleTextures") && !keyPressed) {
             useTextures = !useTextures;
             materials.enableTextures(useTextures);
             }*/
        }
    };

    @Override
    public void simpleUpdate(float tpf) {
    }

    @Override
    public void collision(PhysicsCollisionEvent pce) {
        /*
         if (releaseMillis > 0) {
         System.out.println(pce);
         System.out.println(System.currentTimeMillis() - releaseMillis);
         releaseMillis = -1;
         }
         */
    }
}
