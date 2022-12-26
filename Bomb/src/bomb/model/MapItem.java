package bomb.model;

import javax.swing.*;
import java.awt.*;

public class MapItem {
    private int x;
    private int y;
    public int bit;
    public static final int SIZE=45;
    public final Image[] MY_IMAGE={
            new ImageIcon(getClass().getResource("/res/drawable/images/cloud.png")).getImage(),
            new ImageIcon(getClass().getResource("/res/drawable/images/doll.png")).getImage(),
            new ImageIcon(getClass().getResource("/res/drawable/images/tree.png")).getImage(),
            new ImageIcon(getClass().getResource("/res/drawable/images/gifts.png")).getImage(),
            new ImageIcon(getClass().getResource("/res/drawable/images/snow.png")).getImage(),
            new ImageIcon(getClass().getResource("/res/drawable/images/bear.png")).getImage(),
            new ImageIcon(getClass().getResource("/res/drawable/images/bear.png")).getImage(),
            new ImageIcon(getClass().getResource("/res/drawable/images/sofa.png")).getImage(),
            new ImageIcon(getClass().getResource("/res/drawable/images/sofa.png")).getImage(),
            new ImageIcon(getClass().getResource("/res/drawable/images/background.png")).getImage(),
            new ImageIcon(getClass().getResource("/res/drawable/images/goctrentrai.png")).getImage(),
            new ImageIcon(getClass().getResource("/res/drawable/images/goctrenphai.png")).getImage(),
            new ImageIcon(getClass().getResource("/res/drawable/images/gocduoitrai.png")).getImage(),
            new ImageIcon(getClass().getResource("/res/drawable/images/gocduoiphai.png")).getImage(),
    };

    public MapItem(int x, int y, int bit) {
        this.x = x;
        this.y = y;
        this.bit = bit;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Rectangle getRect(){
        Rectangle rectangle=new Rectangle(x,y+15,SIZE-10,SIZE-10);
        return rectangle;
    }
    public void draw(Graphics2D g2d){
        if (bit!=0) {
            g2d.drawImage(MY_IMAGE[bit-1], x,y,SIZE+2,SIZE+2,null);
        }
        if (x== 0&& y==0){
            g2d.drawImage(MY_IMAGE[10],x,y,null);
        }
        if (x== 16*SIZE && y==0){
            g2d.drawImage(MY_IMAGE[11],x,y,null);
        }
        if (x== 0 && y==14*SIZE){
            g2d.drawImage(MY_IMAGE[12],x,y,null);
        }
        if (x== 16*SIZE && y== 14*SIZE){
            g2d.drawImage(MY_IMAGE[13],x,y,null);
        }
    }

}











