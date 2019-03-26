package escucha;
//Librerias
import org.jfugue.player.Player;
//Fin librerias
public class Hilos extends Thread
{
    //Variables nivel clase
    Player player;
    String nota;
    //Fin variables nivel clase
    //Constructor
    Hilos(Player player, String nota)
    {
        this.nota = nota;
        this.player = player;
    }
    //Fin constructor
    //Inicio de tarea
    public void run()
    {
        player.play(nota);
    }
    //Fin tarea
}
