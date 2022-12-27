package bomb.model;

import res.drawable.sounds.Sound;

import javax.sound.sampled.Clip;
import javax.swing.*;

import static bomb.model.MapItem.SIZE;

import java.awt.*;
import java.util.ArrayList;

public class Player {
    private int x;
    private int y;
    private int orient;
    public Image image;
    private int soBoom=2;
    private int speed=4;
    private int timeMove;
    private int lenghBoomBang=1;
    private boolean isPlayerRun= false;
    public static final int LEFT=0;
    public static final int RIGHT=1;
    public static final int UP=2;
    public static final int DOWN=3;
    private int imageIndex=0;
     public final Image[] IMAGES_HIEUUNG={
            new ImageIcon(getClass().getResource("/res/drawable/images/hieuUng_11.png")).getImage(),
            new ImageIcon(getClass().getResource("/res/drawable/images/hieuUng_12.png")).getImage(),
            new ImageIcon(getClass().getResource("/res/drawable/images/hieuUng_13.png")).getImage(),
            new ImageIcon(getClass().getResource("/res/drawable/images/hieuUng_14.png")).getImage(),
            new ImageIcon(getClass().getResource("/res/drawable/images/hieuUng_15.png")).getImage(),
            new ImageIcon(getClass().getResource("/res/drawable/images/hieuUng_16.png")).getImage(),
            new ImageIcon(getClass().getResource("/res/drawable/images/hieuUng_17.png")).getImage(),
            new ImageIcon(getClass().getResource("/res/drawable/images/hieuUng_18.png")).getImage(),
    };


    public final Image[] IMAGES_PLAYER_LEFT= {
            new ImageIcon(getClass().getResource("/res/drawable/images/player_left_1.png")).getImage(),
            new ImageIcon(getClass().getResource("/res/drawable/images/player_left_2.png")).getImage(),
            new ImageIcon(getClass().getResource("/res/drawable/images/player_left_3.png")).getImage(),
            new ImageIcon(getClass().getResource("/res/drawable/images/player_left_4.png")).getImage(),
            new ImageIcon(getClass().getResource("/res/drawable/images/player_left_5.png")).getImage(),
    };
    public final Image[] IMAGES_PLAYER_RIGHT= {
            new ImageIcon(getClass().getResource("/res/drawable/images/player_right_1.png")).getImage(),
            new ImageIcon(getClass().getResource("/res/drawable/images/player_right_2.png")).getImage(),
            new ImageIcon(getClass().getResource("/res/drawable/images/player_right_3.png")).getImage(),
            new ImageIcon(getClass().getResource("/res/drawable/images/player_right_4.png")).getImage(),
            new ImageIcon(getClass().getResource("/res/drawable/images/player_right_5.png")).getImage(),
    };
    public final Image[] IMAGES_PLAYER_UP= {
            new ImageIcon(getClass().getResource("/res/drawable/images/player_up_1.png")).getImage(),
            new ImageIcon(getClass().getResource("/res/drawable/images/player_up_2.png")).getImage(),
            new ImageIcon(getClass().getResource("/res/drawable/images/player_up_3.png")).getImage(),
            new ImageIcon(getClass().getResource("/res/drawable/images/player_up_4.png")).getImage(),
            new ImageIcon(getClass().getResource("/res/drawable/images/player_up_5.png")).getImage(),
    };
    public final Image[] IMAGES_PLAYER_DOWN= {
            new ImageIcon(getClass().getResource("/res/drawable/images/player_down_1.png")).getImage(),
            new ImageIcon(getClass().getResource("/res/drawable/images/player_down_2.png")).getImage(),
            new ImageIcon(getClass().getResource("/res/drawable/images/player_down_3.png")).getImage(),
            new ImageIcon(getClass().getResource("/res/drawable/images/player_down_4.png")).getImage(),
            new ImageIcon(getClass().getResource("/res/drawable/images/player_down_5.png")).getImage(),
    };
    public Player(int x, int y, int orient,int timeMove) {
        this.x = x;
        this.y = y;
        this.timeMove=timeMove;
        this.orient = orient;
    }

    public int getSoBoom() {
        return soBoom;
    }

    public void setSoBoom(int soBoom) {
        this.soBoom = soBoom+1;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void changeOrient(int newOrient){
        orient=newOrient;
        isPlayerRun=true;
    }

    public boolean isIrun() {
        return isPlayerRun;
    }

    public void draw(Graphics2D g2d){
        switch (orient){
            case LEFT:{
                if (!isIrun()){
                    g2d.drawImage(IMAGES_PLAYER_LEFT[0],x,y,SIZE+5,SIZE+15,null);
                }
                else {
                    imageIndex++;
                    g2d.drawImage(IMAGES_PLAYER_LEFT[imageIndex / 10 % IMAGES_PLAYER_LEFT.length], x, y,SIZE+5,SIZE+15, null);
                }
                break;
            }
            case RIGHT:{
                if (!isIrun()){
                    g2d.drawImage(IMAGES_PLAYER_RIGHT[0],x,y,SIZE+5,SIZE+15,null);
                }
                else {
                    imageIndex++;
                    g2d.drawImage(IMAGES_PLAYER_RIGHT[imageIndex / 10 % IMAGES_PLAYER_RIGHT.length], x, y, SIZE+5,SIZE+15,null);
                }
                break;
            }
            case UP:{
                if (!isIrun()){
                    g2d.drawImage(IMAGES_PLAYER_UP[0],x,y,SIZE+5,SIZE+15,null);
                }
                else {
                    imageIndex++;
                    g2d.drawImage(IMAGES_PLAYER_UP[imageIndex / 10 % IMAGES_PLAYER_UP.length], x, y,SIZE+5,SIZE+15, null);
                }
                break;
            }
            case DOWN:{
                if (!isIrun()){
                    g2d.drawImage(IMAGES_PLAYER_DOWN[0],x,y,SIZE+5,SIZE+15,null);
                }
                else {
                    imageIndex++;
                    g2d.drawImage(IMAGES_PLAYER_DOWN[imageIndex / 10 % IMAGES_PLAYER_LEFT.length], x, y,SIZE+5,SIZE+15,null);
                }
            }
            break;
        }
        isPlayerRun=false;
        imageIndex++;
        g2d.drawImage(IMAGES_HIEUUNG[imageIndex/7%IMAGES_HIEUUNG.length],x-5,y,SIZE+20,SIZE+20,null);
    }

    public Rectangle getRect(){
        Rectangle rectangle=new Rectangle(x,y+25,SIZE-10,SIZE-10);
        return rectangle;
    }

    public boolean checkMoveMap(ArrayList<MapItem> arrMapItem){
        for (MapItem mapItem : arrMapItem){
            if (mapItem.bit == 5 || mapItem.bit == 1 || mapItem.bit == 2 || mapItem.bit == 3 ||
                    mapItem.bit == 4 || mapItem.bit== 6 ||  mapItem.bit== 7 || mapItem.bit== 8
                    || mapItem.bit== 9) {
                Rectangle rectangle = getRect().intersection(mapItem.getRect());
                if (rectangle.isEmpty() == false) {
                    return true;
                }
            }
        }
        return false;
    }

    public void setMoveBoom(ArrayList<Boom> arrBoom){
        for (int i=0;i<arrBoom.size();i++){
            Rectangle rectangle= getRect().intersection(arrBoom.get(i).getRect());
            if (rectangle.isEmpty() == true){
                arrBoom.get(i).setCheckBoom(0);
            }
        }
    }

    public boolean checkMoveBoom(ArrayList<Boom> arrBoom){
        setMoveBoom(arrBoom);
        for (int i=0;i<arrBoom.size();i++){
            Rectangle rectangle= getRect().intersection(arrBoom.get(i).getRect());
            if (rectangle.isEmpty()==false && arrBoom.get(i).isCheckBoom()==0){
                return false;
            }
        }
        return true;
    }

    public void move(ArrayList<MapItem> arrMapItem, ArrayList<Boom> arrBoom, int t){
        if (t%timeMove!=0){
            return;
        }
        int xRaw=x;
        int yRaw=y;
        switch (orient){
            case LEFT:
                xRaw-=speed;
                break;
            case RIGHT:
                xRaw+=speed;
                break;
            case UP:
                yRaw-=speed;
                break;
            case DOWN:
                yRaw+=speed;
            default:
        }
        int xRaw1=x;
        int yRaw1=y;
        x=xRaw;
        y=yRaw;
        boolean checkMovePlayer= checkMoveMap(arrMapItem);
        boolean checkMovePlayerToBoom= checkMoveBoom(arrBoom);
        if (checkMovePlayer==true ){
            x=xRaw1;
            y=yRaw1;
        }
        if (checkMovePlayerToBoom==false){
            x=xRaw1;
            y=yRaw1;
        }
    }

    public boolean checkDieToBoss(ArrayList<Boss> arrBoss){
        for (int i=0;i<arrBoss.size();i++){
            Rectangle rectangle=getRect().intersection(arrBoss.get(i).getRect());
            if (rectangle.isEmpty()== false){
                return true;
            }
        }
        return false;
    }

    public Boom DatBoom(ArrayList<Boom> arrBoom){
        int xRaw= this.x+SIZE/2;
        int yRaw= this.y+SIZE/2;
        int xBoom= xRaw-xRaw%SIZE+15;
        int yBoom= yRaw-yRaw%SIZE;
        int lengBoom=this.lenghBoomBang;
        Boom boom = new Boom(xBoom, yBoom,lengBoom);
        return boom;
    }

    public void moveItem(ArrayList<Item> arrItem){
        for (int i=0;i<arrItem.size();i++){
            Rectangle rectangle=getRect().intersection(arrItem.get(i).getRect());
            if (rectangle.isEmpty()==false){
                if (arrItem.get(i).getBitItem()==0){
                    setSoBoom(soBoom);
                    arrItem.remove(i);
                }
                else if (arrItem.get(i).getBitItem()==1){
                    lenghBoomBang++;
                    arrItem.remove(i);
                }
                else if (arrItem.get(i).getBitItem()==2){
                    setSpeed(getSpeed()+1);
                    arrItem.remove(i);
                }
                Clip clip= Sound.getSound(getClass().getResource("/res/drawable/sounds/item.wav"));
                clip.start();
            }
        }
    }


}

