package bomb.model;

import javax.swing.*;

import static bomb.model.MapItem.SIZE;

import java.awt.*;
import java.util.Random;

public class Item {
    private int x;
    private int y;
    private int bitItem;
    private Image image;
    private Random random=new Random();
    public final Image[] ITEM_IMAGE={
            new ImageIcon(getClass().getResource("/res/drawable/images/item_bomb.png")).getImage(),
            new ImageIcon(getClass().getResource("/res/drawable/images/item_bombsize.png")).getImage(),
            new ImageIcon(getClass().getResource("/res/drawable/images/item_shoe.png")).getImage(),
    };

    public Item(int x, int y) {
        int rd=random.nextInt(3);
        this.x = x;
        this.y = y;
        this.bitItem=rd;
        this.image=ITEM_IMAGE[rd];
    }

    public int getBitItem() {
        return bitItem;
    }

    public void setBitItem(int bitItem) {
        this.bitItem = bitItem;
    }

    public Rectangle getRect(){
        Rectangle rectangle=new Rectangle(x+image.getWidth(null)/2,y+image.getHeight(null)/2,SIZE-30,SIZE-25);
        return rectangle;
    }

    public void draw(Graphics2D g2d){
        g2d.drawImage(image,x,y,SIZE-5,SIZE-5,null);
    }
}

