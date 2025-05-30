package main;

import inputs.KeyboardInputs;
import inputs.MouseInputs;

import javax.swing.*;
import java.awt.*;
import static main.Game.GAME_HEIGHT;
import static main.Game.GAME_WIDTH;


public class GamePanel extends JPanel { //GamePanel is our painting

    private MouseInputs mouseInputs;
    private Game game;







    public GamePanel(Game game){

        this.game = game;
        mouseInputs = new MouseInputs(this);
        addKeyListener(new KeyboardInputs(this)); //calling keylistener that will take a object as argument  of KeyboardInput class
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);
        setPanelSize();

    }



    private void setPanelSize() {
        Dimension size = new Dimension(GAME_WIDTH,GAME_HEIGHT);
        setPreferredSize(size);
        System.out.println("size : "+GAME_WIDTH +" "+GAME_HEIGHT);
    }



    public void updateGame() {


    }

    public void paintComponent(Graphics g){ //Graphics is our paint brush
        //paintComponent is a magic method we never call it.it gets called when we start the game automatically

        super.paintComponent(g); //Calls the super class JPanel's method called paintComponents.this does all the necessary things to draw prevents some weird issues
        game.render(g);



    }
    public Game getGame(){
        return game;
    }




}
