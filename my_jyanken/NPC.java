import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

/**
 * Write a description of class NPC here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class NPC extends Actor
{
    private GreenfootImage img_bkup = null;
    private int width=50;
    private int height= 50;
    
    private GreenfootImage gu_img  = null;
    private GreenfootImage choki_img  = null; 
    private GreenfootImage pa_img  = null; 


    public NPC(){
        img_bkup = new GreenfootImage( getImage() );
        getImage().scale( width,height );
        gu_img= new GreenfootImage( "images/janken_gu.png" ); 
        choki_img = new GreenfootImage( "images/janken_choki.png" ); 
        pa_img = new GreenfootImage( "images/janken_pa.png" ); 
    }
    Random random = new Random();
    int randomValue = random.nextInt(3);
    public void act() 
    {
        GreenfootImage img = new GreenfootImage(img_bkup);
        img.scale( width,height );
        setImage(img);
        getWorld().showText( "じゃんけん", 300, 50 );
        
        Actor actor1 = getOneIntersectingObject( gu_p.class );
            if( actor1 != null ){
                if(randomValue==0){
                    getWorld().showText( "ポン", 300, 50 );
                    setImage(gu_img);
                    getImage().scale( width,height );
                    getWorld().showText( "あいこ", 300, 200 );
                }//1=gu
                if(randomValue==1){
                    getWorld().showText( "ポン", 300, 50 );
                    setImage(choki_img);
                    getImage().scale( width,height );
                    getWorld().showText( "かち", 300, 200 );
                }//2=choki
                if(randomValue==2){
                    getWorld().showText( "ポン", 300, 50 );
                    setImage(pa_img);
                    getImage().scale( width,height );
                    getWorld().showText( "まけ", 300, 200 );
                }//3=pa
            }
        Actor actor2 = getOneIntersectingObject( choki_p.class );
        if( actor2 != null ){
                if(randomValue==0){
                    getWorld().showText( "ポン", 300, 50 );
                    setImage(gu_img);
                    getImage().scale( width,height );
                    getWorld().showText( "まけ", 300, 200 );
                }
                if(randomValue==1){
                    getWorld().showText( "ポン", 300, 50 );
                    setImage(choki_img);
                    getImage().scale( width,height );
                    getWorld().showText( "あいこ", 300, 200 );
                }
                if(randomValue==2){
                    getWorld().showText( "ポン", 300, 50 );
                    setImage(pa_img);
                    getImage().scale( width,height );
                    getWorld().showText( "かち", 300, 200 );
                }
        }
        Actor actor3 = getOneIntersectingObject( pa_p.class );
        if( actor3 != null ){
                if(randomValue==0){
                    getWorld().showText( "ポン", 300, 50 );
                    setImage(gu_img);
                    getImage().scale( width,height );
                    getWorld().showText( "かち", 300, 200 );}
                if(randomValue==1){
                    getWorld().showText( "ポン", 300, 50 );
                    setImage(choki_img);
                    getImage().scale( width,height );
                    getWorld().showText( "まけ", 300, 200 );}
                if(randomValue==2){
                    getWorld().showText( "ポン", 300, 50 );
                    setImage(pa_img);
                    getImage().scale( width,height );
                    getWorld().showText( "あいこ", 300, 200 );}
        }
    }
}
