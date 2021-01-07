import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gu extends Actor
{
    private GreenfootImage img_bkup = null;
    private int width=50;
    private int height= 50;

    public gu(){
        img_bkup = new GreenfootImage( getImage() );
        getImage().scale( width,height );
    }
    
    public void act() 
    {
        GreenfootImage img = new GreenfootImage(img_bkup);
        img.scale( width,height );
        setImage(img);
        if( Greenfoot.mouseClicked(this) ){
            getWorld().addObject( new gu_p(), 300, 100 );
        }
    } 
}
