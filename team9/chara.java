import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class chara here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class chara extends Actor
{
    /**
     * Act - do whatever the chara wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
<<<<<<< HEAD
        if( Greenfoot.isKeyDown( "up" ) ){
        setRotation(270);
        move(1);

    }  
}
=======
        // Add your action code here.
        if( Greenfoot.isKeyDown("down"))
        {
            setRotation(90);
            move(1);
        }
            
    }   
>>>>>>> 7c653d2a750c7e0247fd6ec16a9df53267db14c1
}
