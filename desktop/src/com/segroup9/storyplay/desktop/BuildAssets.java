package com.segroup9.storyplay.desktop;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.tools.texturepacker.TexturePacker;

public class BuildAssets {
    public static void main( String[] args ) {
        TexturePacker.Settings settings = new TexturePacker.Settings();
        settings.filterMin = Texture.TextureFilter.Linear;
        settings.filterMag = Texture.TextureFilter.Linear;
        TexturePacker.process( settings,
                "desktop/assets-raw/gfx", "android/assets/", "sprites.atlas" );
        TexturePacker.process( settings,
                "desktop/assets-raw/skin", "android/assets/", "uiskin.atlas" );
    }
}
