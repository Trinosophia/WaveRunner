import java.awt.Canvas;
public class Game extends Canvas implements Runnable{

    public static final int WIDTH = 640, HEIGHT = WIDTH / 12 * 9;

    public Game(){
        new Window(WIDTH, HEIGHT, "WaveRunner", this);
    }

    public synchronized void start(){

    }

    public void run(){

    }
    public static void main(String[] args){
        new Game();
    }
}