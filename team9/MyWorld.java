import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        showText( "さあ、勝負だ！！！", 320, 50 );
        addObject( new choki(), 300, 250 );
        addObject( new gu(), 300, 100 );
        addObject( new gu(), 300, 350 );
        addObject( new choki(), 100, 350 );
        addObject( new pa(), 500, 350 );
    }
}
