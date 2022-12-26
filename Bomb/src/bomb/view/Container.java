package bomb.view;

import res.drawable.sounds.Sound;

import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;

public class Container extends JPanel {
    public static final String PANEL_GAME= "PanelGame";
    public static final String PANEL_MENU= "PanelMenu";
    public static final String PANEL_HELP= "PanelHelp";

    public static final String OVER_GAME= "Overgame";
    public static final String WIN= "win";

    private PanelGame panelGame;
    private PanelMenu panelMenu;
    private PanelHelp panelHelp;
    private CardLayout cardLayout;
    private Clip clip;


    private Overgame overgame;
    private win win;


    public Container(){
        cardLayout =new CardLayout();
        panelGame=new PanelGame(this);
        panelHelp=new PanelHelp(this);
        panelMenu=new PanelMenu(this);
        overgame=new Overgame(this);
        win=new win(this);
        


        setLayout(cardLayout);
        add(panelGame,PANEL_GAME);
        add(panelMenu,PANEL_MENU);
        add(panelHelp,PANEL_HELP);

        add(overgame,OVER_GAME);
        add(win,WIN);



        cardLayout.show(this,PANEL_MENU);
        clip= Sound.getSound(getClass().getResource("/res/drawable/sounds/soundMenu.wav"));
        clip.start();
        clip.loop(100);
        addKeyListener(panelGame);
        setFocusable(true);
    }
    public void showCard(String name){
        if (name == PANEL_GAME){
            cardLayout.show(this,name);
            panelGame.initPanelGame();
            clip.stop();
        }else  if (name== PANEL_HELP){
            cardLayout.show(this,name);
        }else if (name == PANEL_MENU){
            cardLayout.show(this,PANEL_MENU);
        }

        else if(name == OVER_GAME){
            cardLayout.show(this,OVER_GAME);
        }
        else if(name == WIN){
            cardLayout.show(this,WIN);
        }
    }
}
