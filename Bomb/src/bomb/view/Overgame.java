package bomb.view;

import javax.swing.*;

import static bomb.view.Container.PANEL_MENU;
import static bomb.view.Gui.H_FRAME;
import static bomb.view.Gui.W_FARME;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Overgame extends JPanel implements ActionListener{
    private JButton jbStart;
    private JButton jbExit;
    private Container container;
    //private PanelGame g;
    public static final String ST="start";
    public static final String ET="exit";

    public Overgame(Container container){    
        setLayout(null);
        initPanelMenu();
        initComponents();
        initListener();
        this.container = container;  
    }
    public final Image[] images={
        new ImageIcon(getClass().getResource("/res/drawable/images/over.jpg")).getImage(),
        
};
    public final Icon[] icons={
        new ImageIcon(getClass().getResource("/res/drawable/images/skip1.png")),
        new ImageIcon(getClass().getResource("/res/drawable/images/exit1.png")),
        new ImageIcon(getClass().getResource("/res/drawable/images/skip2.png")),
        new ImageIcon(getClass().getResource("/res/drawable/images/exit2.png")),
    };
    private void initPanelMenu() {
        setBackground(Color.green);
        setLayout(null);
    }
    public void initComponents() {
    jbStart =new JButton(icons[0]);
    jbStart.setRolloverIcon(icons[2]);
    jbStart.setSize(icons[0].getIconWidth(),icons[0].getIconHeight());
    jbStart.setLocation(200,360);
 
    add(jbStart);
    	

    jbExit =new JButton(icons[1]);
    jbExit.setRolloverIcon(icons[3]);
    jbExit.setSize(icons[2].getIconWidth(),icons[0].getIconHeight());
    jbExit.setLocation(400,360);
   
    add(jbExit);
        
    }

public void initListener(){
    jbStart.addActionListener(this);
    jbStart.setActionCommand(ST);
    jbExit.addActionListener(this);
    jbExit.setActionCommand(ET);
}


@Override
    protected void paintChildren(Graphics g) {
        super.paintChildren(g);
        Graphics2D g2d= (Graphics2D) g;
        g2d.drawImage(images[0],0,0,W_FARME,H_FRAME,null);
        
    }

@Override
public void actionPerformed(ActionEvent e) {
    String run= e.getActionCommand();
    switch (run){
        case ST:{
         
            container.showCard(PANEL_MENU);
            break;
            
        }
        case ET:{

            System.exit(0);
        }
    }

}
}
