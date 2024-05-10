package Class;

import GUI.Gamen5x5;
import GUI.Game3x3;
import GUI.Game4x4;
import GUI.Principal;

public class Navegador {
    public Juego game;
    public Jugador player;
    public Tablero board;
    public Principal gui;
    public Game3x3 vista1;
    public Game4x4 vista2;
    public Gamen5x5 vista3;

    public Navegador() {
        game = new Juego(this);
        player = new Jugador(this);
        board = new Tablero(this);
        gui = new Principal(this);
        vista1 = new Game3x3(this);
        vista2 = new Game4x4(this);
        vista3 = new Gamen5x5(this);
    }
    
}
