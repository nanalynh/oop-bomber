
package bomb.model;

import res.drawable.sounds.Sound;

import javax.sound.sampled.Clip;
import javax.swing.*;

import static bomb.model.MapItem.SIZE;

import java.awt.*;
import java.util.ArrayList;

public class BoomBang {
    private int x;
    private int y;
    public int lengh=2;
    private int lenghLeft = lengh;
    private int lenghRight = lengh;
    private int lenghUp = lengh;
    private int lenghDown = lengh;
    private int xBossDie;
    private int yBossDie;
    private int imageIndex=0;

    public final Image[] BOOM_BANG = {
            new ImageIcon(getClass().getResource("/res/drawable/images/bombbang_left_2.png")).getImage(),
            new ImageIcon(getClass().getResource("/res/drawable/images/bombbang_right_2.png")).getImage(),
            new ImageIcon(getClass().getResource("/res/drawable/images/bombbang_up_2.png")).getImage(),
            new ImageIcon(getClass().getResource("/res/drawable/images//bombbang_down_2.png")).getImage(),
            new ImageIcon(getClass().getResource("/res/drawable/images/bombbang_mid_2.png")).getImage(),
            new ImageIcon(getClass().getResource("/res/drawable/images/bombbang_left_1.png")).getImage(),
            new ImageIcon(getClass().getResource("/res/drawable/images/bombbang_right_1.png")).getImage(),
            new ImageIcon(getClass().getResource("/res/drawable/images/bombbang_up_1.png")).getImage(),
            new ImageIcon(getClass().getResource("/res/drawable/images/bombbang_down_1.png")).getImage(),

    };

    public final Image[] BOSS_DIE={
            new ImageIcon(getClass().getResource("/res/drawable/images/boss_die_1.png")).getImage(),
            new ImageIcon(getClass().getResource("/res/drawable/images//boss_die_2.png")).getImage(),
    };

    public final Image[] MAP_DESTROY ={
            new ImageIcon(getClass().getResource("/res/drawable/images/del_1.png")).getImage(),
            new ImageIcon(getClass().getResource("/res/drawable/images/del_2.png")).getImage(),
            new ImageIcon(getClass().getResource("/res/drawable/images/del_3.png")).getImage(),
            new ImageIcon(getClass().getResource("/res/drawable/images/del_4.png")).getImage(),
    };

    public BoomBang(int x, int y, int lenghWave) {
        this.x = x;
        this.y = y;
        this.lenghLeft=lenghWave;
        this.lenghRight=lenghWave;
        this.lenghDown=lenghWave;
        this.lenghUp=lenghWave;
    }
    public boolean checkBoomToPlayer(ArrayList<BoomBang> arrBoomBang, Player player){
        for (int i = 0; i< arrBoomBang.size(); i++){
            Rectangle rectangle1= getRect(x+10,y+20).intersection(player.getRect());
            if (rectangle1.isEmpty()== false){
                return true;
            }
            for (int j=1;j<=lenghLeft;j++){
                int xRaw = x - j * SIZE + 10;
                int yRaw = y + 20;
                Rectangle rectangle=getRect(xRaw,yRaw).intersection(player.getRect());
                if (rectangle.isEmpty()==false){
                    return true;
                }
            }
            for (int j=1;j<=lenghRight;j++){
                int xRaw = x + j * SIZE + 10;
                int yRaw = y + 20;
                Rectangle rectangle=getRect(xRaw,yRaw).intersection(player.getRect());
                if (rectangle.isEmpty()==false){
                    return true;
                }
            }
            for (int j=1;j<=lenghUp;j++){
                int xRaw = x + 10;
                int yRaw = y - j * SIZE + 20;
                Rectangle rectangle=getRect(xRaw,yRaw).intersection(player.getRect());
                if (rectangle.isEmpty()==false){
                    return true;
                }
            }
            for (int j=1;j<=lenghDown;j++){
                int xRaw = x + 10;
                int yRaw = y + j * SIZE + 20;
                Rectangle rectangle=getRect(xRaw,yRaw).intersection(player.getRect());
                if (rectangle.isEmpty()==false){
                    return true;
                }
            }
        }
        return false;
    }

    public void checkBoomToBoss(ArrayList<Boss> arrBoss) {
        for (int i = 0; i < arrBoss.size(); i++) {
            try {
                Rectangle rectangle1= getRect(x+10,y+20).intersection(arrBoss.get(i).getRect());
                if (rectangle1.isEmpty()== false){
                    xBossDie= arrBoss.get(i).getX();
                    yBossDie=arrBoss.get(i).getY();
                    arrBoss.remove(i);
                    Clip clip= Sound.getSound(getClass().getResource("/res/drawable//sounds/bang_bang.wav"));
                    clip.start();
                }
                for (int j = 1; j <= lenghLeft; j++) {
                    int xRaw = x - j * SIZE + 10;
                    int yRaw = y + 20;
                    Rectangle rectangle0 = getRect(xRaw, yRaw).intersection(arrBoss.get(i).getRect());
                    if (rectangle0.isEmpty() == false) {
                        xBossDie= arrBoss.get(i).getX();
                        yBossDie=arrBoss.get(i).getY();
                        arrBoss.remove(i);
                        Clip clip= Sound.getSound(getClass().getResource("/res/drawable/sounds/bang_bang.wav"));
                        clip.start();
                    }
                }
                for (int j = 1; j <= lenghRight; j++) {
                    int xRaw = x + j * SIZE + 10;
                    int yRaw = y + 20;
                    Rectangle rectangle = getRect(xRaw, yRaw).intersection(arrBoss.get(i).getRect());
                    if (rectangle.isEmpty() == false) {
                        xBossDie= arrBoss.get(i).getX();
                        yBossDie=arrBoss.get(i).getY();
                        arrBoss.remove(i);
                        Clip clip= Sound.getSound(getClass().getResource("/res/drawable/sounds/bang_bang.wav"));
                        clip.start();
                    }
                }
                for (int j = 1; j <= lenghUp; j++) {
                    int xRaw = x + 10;
                    int yRaw = y - j * SIZE + 20;
                    Rectangle rectangle = getRect(xRaw, yRaw).intersection(arrBoss.get(i).getRect());
                    if (rectangle.isEmpty() == false) {
                        xBossDie= arrBoss.get(i).getX();
                        yBossDie=arrBoss.get(i).getY();
                        arrBoss.remove(i);
                        Clip clip= Sound.getSound(getClass().getResource("/res/drawable/sounds/bang_bang.wav"));
                        clip.start();

                    }
                }
                for (int j = 1; j <= lenghDown; j++) {
                    int xRaw = x + 10;
                    int yRaw = y + j * SIZE + 20;
                    Rectangle rectangle = getRect(xRaw, yRaw).intersection(arrBoss.get(i).getRect());
                    if (rectangle.isEmpty() == false) {
                        xBossDie= arrBoss.get(i).getX();
                        yBossDie=arrBoss.get(i).getY();
                        arrBoss.remove(i);
                        Clip clip= Sound.getSound(getClass().getResource("/res/drawable/sounds/bang_bang.wav"));
                        clip.start();
                    }
                }
            }catch (IndexOutOfBoundsException e){
            }
        }
    }

    public void checkBoomToBoom(ArrayList<Boom> arrBoom, ArrayList<Integer> timeBoom) {
        for (int i = 0; i < arrBoom.size(); i++) {
            Rectangle rectangle1= getRect(x+10,y+20).intersection(arrBoom.get(i).getRect());
            if (rectangle1.isEmpty()== false){
                timeBoom.set(i,0);
            }
            for (int j=1;j<=lenghLeft;j++) {
                int xRaw = x - j * SIZE + 10;
                int yRaw = y + 20;
                Rectangle rectangle = getRect(xRaw, yRaw).intersection(arrBoom.get(i).getRect());
                if (rectangle.isEmpty() == false ) {
                    timeBoom.set(i, 0);
                }
            }
            for (int j=1;j<=lenghRight;j++) {
                int xRaw = x + j*SIZE + 10;
                int yRaw = y + 20;
                Rectangle rectangle = getRect(xRaw, yRaw).intersection(arrBoom.get(i).getRect());
                if (rectangle.isEmpty() == false ) {
                    timeBoom.set(i, 0);
                }
            }
            for (int j=1;j<=lenghUp;j++) {
                int xRaw = x + 10;
                int yRaw = y - j*SIZE + 20;
                Rectangle rectangle = getRect(xRaw, yRaw).intersection(arrBoom.get(i).getRect());
                if (rectangle.isEmpty() == false ) {
                    timeBoom.set(i, 0);
                }
            }
            for (int j=1;j<=lenghDown;j++) {
                int xRaw = x+10;
                int yRaw = y+j*SIZE+20;
                Rectangle rectangle = getRect(xRaw, yRaw).intersection(arrBoom.get(i).getRect());
                if (rectangle.isEmpty() == false ) {
                    timeBoom.set(i, 0);
                }
            }
        }
    }

    public void draw(Graphics2D g2d,ArrayList<MapItem> arrMapItem){
        drawMid(g2d, arrMapItem);
        drawLeft(g2d, arrMapItem);
        drawRight(g2d, arrMapItem);
        drawUp(g2d, arrMapItem);
        drawDown(g2d, arrMapItem);
        if (xBossDie!=0 || yBossDie!=0) {
            imageIndex++;
            Image image= BOSS_DIE[imageIndex/50%BOSS_DIE.length];
            g2d.drawImage(image, xBossDie, yBossDie, null);
        }
    }
    public void drawMid(Graphics2D g2d, ArrayList<MapItem> arrMapItem) {
        g2d.drawImage(BOOM_BANG[4], x + 10, y + 20, null);
    }

    public Rectangle getRect(int xRaw,int yRaw) {
        Rectangle rectangle = new Rectangle(xRaw+5, yRaw+3, SIZE-10, SIZE-10);
        return rectangle;
    }

    public void drawLeft(Graphics2D g2d, ArrayList<MapItem> arrMapItem) {
        for (int j = 1; j <= lenghLeft; j++) {
            int xRaw = x - j * SIZE + 10;
            int yRaw = y + 20;
            if (j==lenghLeft) {
                g2d.drawImage(BOOM_BANG[0], xRaw+5, yRaw-6, null);
            }else {
                g2d.drawImage(BOOM_BANG[5], xRaw, yRaw-6, null);
            }
            for (int i = 0; i < arrMapItem.size(); i++) {
                Rectangle rectangle = getRect(xRaw,yRaw).intersection(arrMapItem.get(i).getRect());
                if (rectangle.isEmpty() == false) {
                    if (arrMapItem.get(i).bit == 2 || arrMapItem.get(i).bit == 4
                            || arrMapItem.get(i).bit == 5 ) {
                        arrMapItem.remove(i);
                        lenghLeft = lenghLeft - (lenghLeft - j);

                    } else if (arrMapItem.get(i).bit != 2 && arrMapItem.get(i).bit != 4
                            && arrMapItem.get(i).bit != 5 && arrMapItem.get(i).bit != 0) {
                        lenghLeft = lenghLeft - (lenghLeft - j);
                    }
                }
            }
        }
    }

    public void drawRight(Graphics2D g2d, ArrayList<MapItem> arrMapItem) {
        for (int j=1;j<=lenghRight;j++) {
            int xRaw = x + j*SIZE + 10;
            int yRaw = y + 20;
            if (j==lenghRight) {
                g2d.drawImage(BOOM_BANG[1], xRaw-3, yRaw-6, null);
            }else {
                g2d.drawImage(BOOM_BANG[6], xRaw, yRaw-6, null);
            }
            for (int i = 0; i < arrMapItem.size(); i++) {
                Rectangle rectangle = getRect(xRaw,yRaw).intersection(arrMapItem.get(i).getRect());
                if (rectangle.isEmpty() == false) {
                    if (arrMapItem.get(i).bit == 2 || arrMapItem.get(i).bit == 4
                            || arrMapItem.get(i).bit == 5 ) {
                        arrMapItem.remove(i);
                        lenghRight = lenghRight - (lenghRight - j);

                    } else if (arrMapItem.get(i).bit != 2 && arrMapItem.get(i).bit != 4
                            && arrMapItem.get(i).bit != 5 && arrMapItem.get(i).bit != 0) {
                        lenghRight = lenghRight - (lenghRight - j);
                    }
                }

            }
        }
    }

    public void drawUp(Graphics2D g2d, ArrayList<MapItem> arrMapItem) {
        for (int j=1;j<=lenghUp;j++) {
            int xRaw = x + 10;
            int yRaw = y - j*SIZE + 20;
            if (j==lenghUp) {
                g2d.drawImage(BOOM_BANG[2], xRaw, yRaw+5, null);
            }else {
                g2d.drawImage(BOOM_BANG[7], xRaw, yRaw, null);
            }
            for (int i = 0; i < arrMapItem.size(); i++) {
                Rectangle rectangle = getRect(xRaw,yRaw).intersection(arrMapItem.get(i).getRect());
                if (rectangle.isEmpty() == false) {
                    if (arrMapItem.get(i).bit == 2 || arrMapItem.get(i).bit == 4
                            || arrMapItem.get(i).bit == 5 ) {
                        arrMapItem.remove(i);
                        imageIndex++;
                        g2d.drawImage(MAP_DESTROY[imageIndex/20% MAP_DESTROY.length], arrMapItem.get(i).getX(), arrMapItem.get(i).getY(),null);
                        lenghUp = lenghUp - (lenghUp - j);

                    } else if (arrMapItem.get(i).bit != 2 && arrMapItem.get(i).bit != 4
                            && arrMapItem.get(i).bit != 5 && arrMapItem.get(i).bit != 0) {
                        lenghUp = lenghUp - (lenghUp - j);
                    }
                }
            }

        }
    }

    public void drawDown(Graphics2D g2d, ArrayList<MapItem> arrMapItem) {
        for (int j=1;j<=lenghDown;j++) {
            int xRaw = x+10;
            int yRaw = y+j*SIZE+20;
            if (j==lenghDown) {
                g2d.drawImage(BOOM_BANG[3], xRaw, yRaw-3, null);
            }else {
                g2d.drawImage(BOOM_BANG[8], xRaw, yRaw, null);
            }
            for (int i = 0; i < arrMapItem.size(); i++) {
                Rectangle rectangle = getRect(xRaw,yRaw).intersection(arrMapItem.get(i).getRect());
                if (rectangle.isEmpty() == false) {
                    if (arrMapItem.get(i).bit == 2 || arrMapItem.get(i).bit == 4
                            || arrMapItem.get(i).bit == 5 ) {
                        arrMapItem.remove(i);
                        imageIndex++;
                        g2d.drawImage(MAP_DESTROY[imageIndex/20% MAP_DESTROY.length], arrMapItem.get(i).getX(), arrMapItem.get(i).getY(),null);
                        lenghDown = lenghDown - (lenghDown - j);

                    } else if (arrMapItem.get(i).bit != 2 && arrMapItem.get(i).bit != 4
                            && arrMapItem.get(i).bit != 5 && arrMapItem.get(i).bit != 0) {
                        lenghDown = lenghDown - (lenghDown - j);
                    }
                }
            }
        }
    }

}

