package escucha;
//Librerias
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
import org.jfugue.player.Player;
import static sun.audio.AudioPlayer.player;
//Fin librerias
public class Teclas extends JFrame implements KeyListener
{
    //Creación de variables
    private JButton bdo;
    private JButton bre;
    private JButton bmi;
    private JButton bfa;
    private JButton bsol;
    private JButton bla;
    private JButton bsi;
    private JLabel txt1;
    Player player = new Player();
    //Fin variables
    //Constructor
    Teclas()
    {
        add(getbdo());
        add(getbre());
        add(getbmi());
        add(getbfa());
        add(getbsol());
        add(getbla());
        add(getbsi());
        inicializador();
    }
    //Fin constructor
    //Método inicializador
    private void inicializador()
    {
        setLayout(null);
        setTitle("Teclas");
        setVisible(true);
        setSize(700,320);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    //Fin método inicializador
    //Constructor de boton
    private JButton getbdo()
    {
        bdo = new JButton("");
        bdo.addKeyListener(this);
        bdo.setBounds(10, 10, 80, 230);
        return bdo;
    }
    private JButton getbre()
    {
        bre = new JButton("");
        bre.addKeyListener(this);
        bre.setBounds(100, 10, 80, 230);
        return bre;
    }
     private JButton getbmi()
    {
        bre = new JButton("");
        bre.addKeyListener(this);
        bre.setBounds(200, 10, 80, 230);
        return bre;
    }
     private JButton getbfa()
    {
        bre = new JButton("");
        bre.addKeyListener(this);
        bre.setBounds(300, 10, 80, 230);
        return bre;
    }
     private JButton getbsol()
    {
        bre = new JButton("");
        bre.addKeyListener(this);
        bre.setBounds(400, 10, 80, 230);
        return bre;
    }
     private JButton getbla()
    {
        bre = new JButton("");
        bre.addKeyListener(this);
        bre.setBounds(500, 10, 80, 230);
        return bre;
    }
     private JButton getbsi()
    {
        bre = new JButton("");
        bre.addKeyListener(this);
        bre.setBounds(600, 10, 80, 230);
        return bre;
    }
    //Fin constructor de boton
    //Métodos de Listener
    public void keyTyped(KeyEvent e)
    {
    }
    public void keyPressed(KeyEvent e)
    {
        //Variables
        char key = e.getKeyChar();
        //Fin variables
        if(key == 'a')
        {
            Hilos notas = new Hilos(player, "C/.8");
            notas.start();
        }
        else if(key == 's')
        {
            Hilos notas = new Hilos(player, "D/.8");
            notas.start();
        }
        else if(key == 'd')
        {
            Hilos notas = new Hilos(player, "E/.8");
            notas.start();
        }
        else if(key == 'f')
        {
            Hilos notas = new Hilos(player, "F/.8");
            notas.start();
        }
        else if(key == 'g')
        {
            Hilos notas = new Hilos(player, "G/.8");
            notas.start();
        }
        else if(key == 'h')
        {
            Hilos notas = new Hilos(player, "A/.8");
            notas.start();
        }
        else if(key == 'j')
        {
            Hilos notas = new Hilos(player, "B/.8");
            notas.start();
        }
    }
    public void keyReleased(KeyEvent e)
    {
    }   
    //Fin métodos Listener
}