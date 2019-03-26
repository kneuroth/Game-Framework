/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kneuroth.framework.window.utilities;

import com.kneuroth.framework.window.Handler;
import java.awt.Graphics;
import java.awt.Rectangle;
import static java.lang.Math.abs;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Kelly Neuroth
 */
public abstract class GameObject {
    
  
    
    protected final int MAX_X_SPEED = 9;
    
    protected Handler handler;
    
    protected float x,y;
    protected ObjectId id;
    protected float velX = 0, velY = 0;
    
    protected boolean falling = true;
    protected boolean jumping = false;
    
    protected boolean onWall = false;
    
    
    public GameObject(float x, float y, ObjectId id){
        this.x = x;
        this.y = y;
        this.id = id;
    }
    
    public abstract void tick(LinkedList<GameObject> object);
    
    public abstract void render(Graphics g);
    
    public abstract float getHeight();
    
    public abstract void setHeight(float height);
        
    public abstract float getWidth();
    
    public abstract void setWidth(float width);
    
      
    
    
    public float getX(){
        return x;
    }
    public float getY(){
        return y;
    }
    public void setX(float x){
        this.x = x;
    }
    public void setY(float y){
        this.y = y;
    }
    
    public ObjectId getId(){
        return id;
    }
    
    
}
   
