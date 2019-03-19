package com.adversespaceloneliness.game.desktop;

import com.adversespaceloneliness.game.AdverseSpaceLoneliness;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;

public class DesktopLauncher {

    public static void main(String[] arg) {
        Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
        new Lwjgl3Application(new AdverseSpaceLoneliness(), config);
    }
}
