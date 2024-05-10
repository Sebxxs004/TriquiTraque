package Class;

import java.awt.Color;
import javax.swing.JOptionPane;

public class Juego {
    private Navegador Nav;
    public Jugador player1, player2;
    public Juego(Navegador Nav, Jugador player1, Jugador player2, Tablero tablero) {
        this.Nav = Nav;
        this.player1 = player1;
        this.player2 = player2;
    }
    public Juego(Navegador n) {
        Nav = n;
    }

    public Jugador getPlayer1() {
        return player1;
    }

    public void setPlayer1(Jugador player1) {
        this.player1 = player1;
    }

    public Jugador getPlayer2() {
        return player2;
    }

    public void setPlayer2(Jugador player2) {
        this.player2 = player2;
    }
    public void iniciarPartida(){
        if(Nav.gui.txtPlayer1.getText().isEmpty() || Nav.gui.cbColor1.getSelectedIndex() == 0 || Nav.gui.txtPlayer2.getText().isEmpty() || Nav.gui.cbColor2.getSelectedIndex() == 0 ){
            JOptionPane.showMessageDialog(null, "Error informacion PLAYER.");
            System.out.println("Error informacion PLAYER");
            
            } else if (Nav.gui.chkCircle1.isSelected() && Nav.gui.chkCircle2.isSelected() || Nav.gui.chkExs1.isSelected() && Nav.gui.chkExs2.isSelected() || Nav.gui.cbColor2.getSelectedIndex() == Nav.gui.cbColor1.getSelectedIndex()) {
                    JOptionPane.showMessageDialog(null, "Error figuras o colores IGUALES.");
                    Nav.gui.chkCircle1.setSelected(false);
                    Nav.gui.chkCircle2.setSelected(false);
                    Nav.gui.chkExs1.setSelected(false);
                    Nav.gui.chkExs2.setSelected(false);
                } else if(Nav.gui.chkCircle1.isSelected()==false&&Nav.gui.chkExs1.isSelected()==false || Nav.gui.chkCircle2.isSelected()==false&&Nav.gui.chkExs2.isSelected()==false){
                    JOptionPane.showMessageDialog(null, "Seleccione la figura");
                } else {
                    player1 = new Jugador();
                    player2 = new Jugador();
                    player1.setNombre(Nav.gui.txtPlayer1.getText());
                    int eColor1 = Nav.gui.cbColor1.getSelectedIndex();
                    switch (eColor1) {
                        case 1 -> player1.setColor(Color.black);
                        case 2 -> player1.setColor(Color.blue);
                        case 3 -> player1.setColor(Color.yellow);
                        case 4 -> player1.setColor(new Color(128, 64, 0));
                        case 5 -> player1.setColor(Color.gray);
                        case 6 -> player1.setColor(Color.green);
                        case 7 -> player1.setColor(Color.orange);
                        case 8 -> player1.setColor(Color.pink);
                        case 9 -> player1.setColor(Color.magenta);
                        case 10 -> player1.setColor(Color.red);
                        case 0 -> JOptionPane.showMessageDialog(null, "Error color player1: null");
                        default -> JOptionPane.showMessageDialog(null, "Error: unknown");
                            
                    }
                    if(Nav.gui.chkCircle1.isSelected()){
                        player1.setFicha("O");
                        player2.setFicha("X");
                    } else {
                        player1.setFicha("X");
                        player2.setFicha("O");
                    }
                        player2.setNombre(Nav.gui.txtPlayer2.getText());
                        int eColor2 = Nav.gui.cbColor2.getSelectedIndex();
                        
                        switch (eColor2) {
                        case 1 -> player2.setColor(Color.black);
                        case 2 -> player2.setColor(Color.blue);
                        case 3 -> player2.setColor(Color.yellow);
                        case 4 -> player2.setColor(new Color(252, 75, 8));
                        case 5 -> player2.setColor(Color.gray);
                        case 6 -> player2.setColor(Color.green);
                        case 7 -> player2.setColor(Color.orange);
                        case 8 -> player2.setColor(Color.pink);
                        case 9 -> player2.setColor(new Color (120, 40, 140));
                        case 10 -> player2.setColor(Color.red);
                        case 0 -> JOptionPane.showMessageDialog(null, "Error color player1: null");
                        default -> JOptionPane.showMessageDialog(null, "Error: unknown");
                    }
                    switch(Nav.gui.cbTablero.getSelectedIndex()){
                    case 0:
                        Nav.vista1.setVisible(true);
                        Nav.gui.setVisible(false);
                        break;
                    case 1:
                        Nav.vista2.setVisible(true);
                        Nav.gui.setVisible(false);
                        break;
                    case 2:
                        Nav.vista3.setVisible(true);
                        Nav.gui.setVisible(false);
                        break;
                    }
                }
                Nav.vista1.txtTurno.setForeground(Nav.game.player1.getColor());
                Nav.gui.cbTablero.setEnabled(false);
    }
    public void cambiarTurno(){
        switch(Nav.gui.cbTablero.getSelectedIndex()){
                    case 0 -> {
                if ("X".equals(Nav.vista1.txtTurno.getText())) {
                    Nav.vista1.txtTurno.setText("O");
                } else {
                    Nav.vista1.txtTurno.setText("X");
                }
            }
                    case 1 -> {
                if ("X".equals(Nav.vista2.txtTurno.getText())) {
                    Nav.vista2.txtTurno.setText("O");
                } else {
                    Nav.vista2.txtTurno.setText("X");
                }
            }
                    case 2 -> {
                if ("X".equals(Nav.vista3.txtTurno.getText())) {
                    Nav.vista3.txtTurno.setText("O");
                } else {
                    Nav.vista3.txtTurno.setText("X");
                }
            }
                    }
        
    }
    public int hayGanador3x3(int[][] tablero) {
        if (tablero[0][0] != 0 && tablero[0][0] == tablero[0][1] && tablero[0][2] == tablero[0][1]) {
                return tablero[0][0];
        } else if (tablero[1][0] != 0 && tablero[1][0] == tablero[1][1] && tablero[1][2] == tablero[1][1]) {
                return tablero[1][0];
        } else if (tablero[2][0] != 0 && tablero[2][0] == tablero[2][1] && tablero[2][1] == tablero[2][2]){
                return tablero[2][0];
        }
        for (int columna = 0; columna < 3; columna++) {
            if (tablero[0][columna] != ' ' && tablero[0][columna] == tablero[1][columna] && tablero[0][columna] == tablero[2][columna] && tablero[0][columna] == tablero[1][columna] && tablero[0][columna] == tablero[2][columna]) {
                return tablero[0][columna];
            }
        if(tablero[0][0] != ' ' && tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2]){
            return tablero[0][0];
        } else if(tablero[0][2] != ' ' && tablero[0][2] == tablero[1][1] && tablero[2][0] == tablero[0][2]){
            return tablero [0][2];
        }
    } 
        return ' ';
}
    public int hayGanador5x5(int[][] tablero) {

        if (tablero[0][0] != 0 && tablero[0][0] == tablero[0][1] && tablero[0][0] == tablero[0][2] && tablero[0][0] == tablero[0][3] && tablero[0][0] == tablero[0][4]) {
                return tablero[0][0];
            } else if (tablero[1][0] != 0 && tablero[1][0] == tablero[1][1] && tablero[1][0] == tablero[1][2] && tablero[1][0] == tablero[1][3] && tablero[1][0] == tablero[1][4]) {
                return tablero[1][0];
            } else if (tablero[2][0] != 0 && tablero[2][0] == tablero[2][1] && tablero[2][0] == tablero[2][2] && tablero[2][0] == tablero[2][3] && tablero[2][0] == tablero[2][4]) {
                return tablero[2][0];
            } else if (tablero[3][0] != 0 && tablero[3][0] == tablero[3][1] && tablero[3][0] == tablero[3][2] && tablero[3][0] == tablero[3][3] && tablero[3][0] == tablero[3][4]) {
                return tablero[3][0];
            }
        for (int columna = 0; columna < 5; columna++) {
            if (tablero[0][columna] != 0 && tablero[0][columna] == tablero[1][columna] && tablero[0][columna] == tablero[2][columna] && tablero[0][columna] == tablero[3][columna] && tablero[0][columna] == tablero[4][columna]) {
                return tablero[0][columna];
            }
            if(tablero[0][0] != ' ' && tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2] && tablero[1][1] == tablero[3][3] && tablero[1][1] == tablero[4][4]){
                return tablero[0][0];
            } else if(tablero[0][4] != ' ' && tablero[0][4] == tablero[1][3] && tablero[4][0] == tablero[3][1] && tablero[4][0] == tablero[2][2]){
                return tablero [0][4];
            }    
        }
        return ' ';
    }

    
public int hayGanador4x4(int[][] tablero) {
            if (tablero[0][0] != 0 && tablero[0][0] == tablero[0][1] && tablero[0][0] == tablero[0][2] && tablero[0][0] == tablero[0][3]) {
                return tablero[0][0];
            } else if (tablero[1][0] != 0 && tablero[1][0] == tablero[1][1] && tablero[1][0] == tablero[1][2] && tablero[1][0] == tablero[1][3]) {
                return tablero[1][0];
            } else if (tablero[2][0] != 0 && tablero[2][0] == tablero[2][1] && tablero[2][0] == tablero[2][2] && tablero[2][0] == tablero[2][3]) {
                return tablero[2][0];
            } else if (tablero[3][0] != 0 && tablero[3][0] == tablero[3][1] && tablero[3][0] == tablero[3][2] && tablero[3][0] == tablero[3][3]) {
                return tablero[3][0];
            }
        for (int columna = 0; columna < 3; columna++) {
            if (tablero[0][columna] != 0 && tablero[0][columna] == tablero[1][columna] && tablero[0][columna] == tablero[2][columna] && tablero[0][columna] == tablero[3][columna]) {
                return tablero[0][columna];
            }
        }
            if(tablero[0][0] != ' ' && tablero[0][0] == tablero[1][1] && tablero[0][0] == tablero[2][2] && tablero[0][0] == tablero[3][3]){
                return tablero[0][0];
            } else if (tablero[0][3] != ' ' && tablero[0][3] == tablero[1][2] && tablero[0][3] == tablero[2][1] && tablero[0][3] == tablero[3][0]){
                return tablero[0][3];
            }
        return ' ';
    }
public void elegirGanador(int eleccion, int movimientos){
    switch (eleccion){
            case 1 -> {
                if (Nav.gui.chkExs1.isSelected()) {
                    JOptionPane.showMessageDialog(null, Nav.game.player2.getNombre() + " fue el ganador");
                    Nav.board.reiniciarTablero();
                    Nav.gui.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, Nav.game.player1.getNombre() + " fue el ganador");
                    Nav.board.reiniciarTablero();
                    Nav.gui.setVisible(true);
                }
            }
            case 2 -> {
                if (Nav.gui.chkCircle1.isSelected()) {
                    JOptionPane.showMessageDialog(null, Nav.game.player2.getNombre() + " fue el ganador");
                    Nav.board.reiniciarTablero();
                    Nav.gui.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, Nav.game.player1.getNombre() + " fue el ganador");
                    Nav.board.reiniciarTablero();
                    Nav.gui.setVisible(true);
                }
            }
            default -> {
                if (movimientos == 16) {
                    Nav.board.reiniciarTablero();
                } else {
                    System.out.println("Aún no hay ganador");
                }
            }
        }
}
}

