package com.crosshairengine.firstgame.wolf_lair.Tiles;

import android.graphics.Bitmap;

import com.crosshairengine.firstgame.engine.Abstract_classes.Tile;

/**
 * Created by CrossHairEngine team on 5/2/2017.
 */

public class Tile_grass extends Tile {
    public Tile_grass(Bitmap bitmap, int leftPx, int topPx) {
        super(bitmap, leftPx, topPx);
    }

    public Tile_grass(Bitmap bitmap) {
        super(bitmap);
    }
}
