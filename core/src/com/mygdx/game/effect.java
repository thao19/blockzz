package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.ParticleEffect;
import com.badlogic.gdx.scenes.scene2d.Actor;


public class effect extends Actor {

    float x,y;
    ParticleEffect particleEffect = new ParticleEffect();
    effect( float x, float y){

        this.x=x;
        this.y=y;

        particleEffect.load(Gdx.files.internal("particle/particleAqua1.p"), Gdx.files.internal("particle"));


    }

    public effect() {
        particleEffect.load(Gdx.files.internal("particle/particleAqua1.p"), Gdx.files.internal("particle"));
    }

    @Override
    public float getX() {
        return x;
    }

    @Override
    public void setX(float x) {
        this.x = x;
    }

    @Override
    public float getY() {
        return y;
    }

    @Override
    public void setY(float y) {
        this.y = y;
    }

    public void callpar()
    {
        particleEffect.start();
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        batch.end();
        batch.begin();


        if(particleEffect != null){
            particleEffect.setPosition(x,y);
            particleEffect.draw(batch,Gdx.graphics.getDeltaTime());
            //particleEffect.setPosition(x,y);
        }



        super.draw(batch, parentAlpha);

    }

    @Override
    public void act(float delta) {
        super.act(delta);
    }
}
