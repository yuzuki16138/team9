import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gu_p here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gu_p extends player
{
    private GreenfootImage img_bkup = null;
    private int width=10;
    private int height= 10;

    public gu_p(){
        img_bkup = new GreenfootImage( getImage() );
        getImage().scale( width,height );
    }
    
    public void act() 
    {
        GreenfootImage img = new GreenfootImage(img_bkup);
        img.scale( width,height );
        setImage(img);
    }    
}
