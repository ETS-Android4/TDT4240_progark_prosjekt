package com.mygdx.game.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;

public class COV_delta extends UFO {
    private Texture texture;


    public COV_delta(int x, int size) {
        super(x, size);
        texture = new Texture("cov_delta.png");
        setBoundingRectangle(new Rectangle(super.getPosition().x, super.getPosition().y, super.getSize(), super.getSize()));
        super.setType(1);
    }

    public Texture getTexture() {
        return texture;
    }

    public void dispose() {
        // Se om denne skal i den abstracte klassen eller ikke. Kan hende de samme variablene skal disposes.
    }
}
