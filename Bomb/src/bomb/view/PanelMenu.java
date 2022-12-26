package bomb.view;

import res.drawable.sounds.Sound;

import javax.sound.sampled.Clip;
import javax.swing.*;

import static bomb.view.Container.PANEL_GAME;
import static bomb.view.Container.PANEL_HELP;
import static bomb.view.Gui.H_FRAME;
import static bomb.view.Gui.W_FARME;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelMenu extends JPanel implements ActionListener {
    private JButton jbStart;
    private JButton jbHelp;
    private JButton jbExit;
    public static final String START="start";
    public static final String HELP="help";
    public static final String EXIT="exit";
    private Container container;
    public PanelMenu(Container container){
        initPanelMenu();
        initComponents();
        initListener();
        this.container = container;
    }

    public final Image[] image={
            new ImageIcon(getClass().getResource("/res/drawable/images/menupanel.png")).getImage(),
    };

    public final Icon[] icons={
            new ImageIcon(getClass().getResource("/res/drawable/images/startButton1.png")),
            new ImageIcon(getClass().getResource("/res/drawable/images/help1.png")),
            new ImageIcon(getClass().getResource("/res/drawable/images/exitButton1.png")),
            new ImageIcon(getClass().getResource("/res/drawable/images/startButton2.png")),
            new ImageIcon(getClass().getResource("/res/drawable/images/help2.png")),
            new ImageIcon(getClass().getResource("/res/drawable/images/exitButton2.png")),
    };

    private void initPanelMenu() {
        setBackground(Color.green);
        setLayout(null);
    }
    private void initComponents() {
        jbStart =new JButton(icons[0]);
        jbStart.setRolloverIcon(icons[3]);
        jbStart.setSize(icons[0].getIconWidth(),icons[0].getIconHeight());
        jbStart.setLocation(120,H_FRAME-jbStart.getHeight()-80);
        jbStart.setBorderPainted(false);
        jbStart.setContentAreaFilled(false);
        jbStart.setOpaque(false);  
        add(jbStart);

        jbHelp =new JButton(icons[1]);
        jbHelp.setRolloverIcon(icons[4]);
        jbHelp.setSize(icons[1].getIconWidth(),icons[0].getIconHeight());
        jbHelp.setLocation(jbStart.getX()+jbStart.getWidth()+50,jbStart.getY());
        jbHelp.setBorderPainted(false);
        jbHelp.setContentAreaFilled(false);
        jbHelp.setOpaque(false);  
        add(jbHelp);

        jbExit =new JButton(icons[2]);
        jbExit.setRolloverIcon(icons[5]);
        jbExit.setSize(icons[2].getIconWidth(),icons[0].getIconHeight());
        jbExit.setLocation(jbHelp.getX()+jbHelp.getWidth()+50,jbStart.getY());
        jbExit.setBorderPainted(false);
        jbExit.setContentAreaFilled(false);
        jbExit.setOpaque(false);  
        add(jbExit);
    }

    public void initListener(){
        jbStart.addActionListener(this);
        jbStart.setActionCommand(START);
        jbHelp.addActionListener(this);
        jbHelp.setActionCommand(HELP);
        jbExit.addActionListener(this);
        jbExit.setActionCommand(EXIT);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d= (Graphics2D) g;
        g2d.drawImage(image[0],0,0,W_FARME,H_FRAME,null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String run= e.getActionCommand();
        switch (run){
            case START:{
                Clip clip= Sound.getSound(getClass().getResource("/res/drawable/sounds/click.wav"));
                clip.start();
                container.showCard(PANEL_GAME);
                break;
            }
            case HELP:{
                Clip clip= Sound.getSound(getClass().getResource("/res/drawable/sounds/click.wav"));
                clip.start();
                container.showCard(PANEL_HELP);
                break;
            }
            case EXIT:{
                Clip clip= Sound.getSound(getClass().getResource("/res/drawable/sounds/click.wav"));
                clip.start();
                System.exit(0);
            }
        }
    }
}
