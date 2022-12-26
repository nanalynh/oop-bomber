package bomb.model;

import javax.swing.*;

import static bomb.model.MapItem.SIZE;

import java.awt.*;

public class Boom {
    private int x;
    private int y;
    public int checkBoom;
    private Image image;
    private int imageIndex=0;
    private int lenghBoom;
    public final Image[] IMAGE_BOOM={
            new ImageIcon(getClass().getResource("/res/drawable/images/boom1.png")).getImage(),
            new ImageIcon(getClass().getResource("/res/drawable/images/boom2.png")).getImage(),
            new ImageIcon(getClass().getResource("/res/drawable/images/boom3.png")).getImage(),
            new ImageIcon(getClass().getResource("/res/drawable/images/boom4.png")).getImage(),
            new ImageIcon(getClass().getResource("/res/drawable/images/boom5.png")).getImage(),
            new ImageIcon(getClass().getResource("/res/drawable/images/boom6.png")).getImage(),
            new ImageIcon(getClass().getResource("/res/drawable/images/boom7.png")).getImage(),
            new ImageIcon(getClass().getResource("/res/drawable/images/boom8.png")).getImage(),
    };

    public Boom(int x, int y,int lenghBoom) {
        this.x = x-20;
        this.y = y;
        this.lenghBoom=lenghBoom;
        this.checkBoom=1;
        this.image=IMAGE_BOOM[0];
        boomBang();
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

    public int isCheckBoom() {
        return checkBoom;
    }

    public void setCheckBoom(int checkBoom) {
        this.checkBoom = checkBoom;
    }

    public void draw(Graphics2D g2d){
        imageIndex++;
        image = IMAGE_BOOM[imageIndex/5 %IMAGE_BOOM.length];
        g2d.drawImage(image,x,y,SIZE,SIZE,null);
    }

    public Rectangle getRect(){
        Rectangle rectangle= new Rectangle(x+15,y+15,SIZE-10,SIZE-10);
        return  rectangle;
    }

    public BoomBang boomBang(){
        int xRaw= x-10;
        int yRaw= y-10;
        int lenghWave=this.lenghBoom;
        BoomBang boomBang = new BoomBang(xRaw,yRaw,lenghWave);
        return boomBang;
    }
}

