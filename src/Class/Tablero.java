package Class;

public class Tablero {
    private Navegador Nav;
    public Tablero(Navegador n) {
        Nav = n;
    }
    public void colocarFicha(){
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
    
    public void reiniciarTablero(){
        switch(Nav.gui.cbTablero.getSelectedIndex()){
                    case 0 -> {
                        Nav.vista1.btn01.setText("");
                        Nav.vista1.btn02.setText("");
                        Nav.vista1.btn03.setText("");
                        Nav.vista1.btn04.setText("");
                        Nav.vista1.btn05.setText("");
                        Nav.vista1.btn06.setText("");
                        Nav.vista1.btn07.setText("");
                        Nav.vista1.btn08.setText("");
                        Nav.vista1.btn09.setText("");
                        Nav.vista1.btn01.setEnabled(true);
                        Nav.vista1.btn02.setEnabled(true);
                        Nav.vista1.btn03.setEnabled(true);
                        Nav.vista1.btn04.setEnabled(true);
                        Nav.vista1.btn05.setEnabled(true);
                        Nav.vista1.btn06.setEnabled(true);
                        Nav.vista1.btn07.setEnabled(true);
                        Nav.vista1.btn08.setEnabled(true);
                        Nav.vista1.btn09.setEnabled(true);
                        Nav.vista1.setMovimientos(0);
                        for (int i = 0; i < 3; i++) {
                            for (int j = 0; j < 3; j++) {
                                Nav.vista1.tab3x3[i][j] = 0;
                            }
                        }
                        System.out.println("Eliminado con éxito.");
            }
                    case 1 -> {
                        Nav.vista2.btn01.setText("");
                        Nav.vista2.btn02.setText("");
                        Nav.vista2.btn03.setText("");
                        Nav.vista2.btn04.setText("");
                        Nav.vista2.btn05.setText("");
                        Nav.vista2.btn06.setText("");
                        Nav.vista2.btn07.setText("");
                        Nav.vista2.btn08.setText("");
                        Nav.vista2.btn09.setText("");
                        Nav.vista2.btn10.setText("");
                        Nav.vista2.btn11.setText("");
                        Nav.vista2.btn12.setText("");
                        Nav.vista2.btn13.setText("");
                        Nav.vista2.btn14.setText("");
                        Nav.vista2.btn15.setText("");
                        Nav.vista2.btn16.setText("");
                        Nav.vista2.btn01.setEnabled(true);
                        Nav.vista2.btn02.setEnabled(true);
                        Nav.vista2.btn03.setEnabled(true);
                        Nav.vista2.btn04.setEnabled(true);
                        Nav.vista2.btn05.setEnabled(true);
                        Nav.vista2.btn06.setEnabled(true);
                        Nav.vista2.btn07.setEnabled(true);
                        Nav.vista2.btn08.setEnabled(true);
                        Nav.vista2.btn09.setEnabled(true);
                        Nav.vista2.btn10.setEnabled(true);
                        Nav.vista2.btn11.setEnabled(true);
                        Nav.vista2.btn12.setEnabled(true);
                        Nav.vista2.btn13.setEnabled(true);
                        Nav.vista2.btn14.setEnabled(true);
                        Nav.vista2.btn15.setEnabled(true);
                        Nav.vista2.btn16.setEnabled(true);
                        Nav.vista2.setMovimientos(0);
                        for (int i = 0; i < 4 ; i++) {
                            for (int j = 0; j < 4; j++) {
                                Nav.vista2.tab4x4[i][j] = 0;
                            }
                        }
                        System.out.println("Eliminado con éxito");
            }
                    case 2 -> {
                        Nav.vista3.btn01.setText("");
                        Nav.vista3.btn02.setText("");
                        Nav.vista3.btn03.setText("");
                        Nav.vista3.btn04.setText("");
                        Nav.vista3.btn05.setText("");
                        Nav.vista3.btn06.setText("");
                        Nav.vista3.btn07.setText("");
                        Nav.vista3.btn08.setText("");
                        Nav.vista3.btn09.setText("");
                        Nav.vista3.btn10.setText("");
                        Nav.vista3.btn11.setText("");
                        Nav.vista3.btn12.setText("");
                        Nav.vista3.btn13.setText("");
                        Nav.vista3.btn14.setText("");
                        Nav.vista3.btn15.setText("");
                        Nav.vista3.btn16.setText("");
                        Nav.vista3.btn17.setText("");
                        Nav.vista3.btn18.setText("");
                        Nav.vista3.btn19.setText("");
                        Nav.vista3.btn20.setText("");
                        Nav.vista3.btn21.setText("");
                        Nav.vista3.btn22.setText("");
                        Nav.vista3.btn23.setText("");
                        Nav.vista3.btn24.setText("");
                        Nav.vista3.btn25.setText("");
                        Nav.vista3.btn01.setEnabled(true);
                        Nav.vista3.btn02.setEnabled(true);
                        Nav.vista3.btn03.setEnabled(true);
                        Nav.vista3.btn04.setEnabled(true);
                        Nav.vista3.btn05.setEnabled(true);
                        Nav.vista3.btn06.setEnabled(true);
                        Nav.vista3.btn07.setEnabled(true);
                        Nav.vista3.btn08.setEnabled(true);
                        Nav.vista3.btn09.setEnabled(true);
                        Nav.vista3.btn10.setEnabled(true);
                        Nav.vista3.btn11.setEnabled(true);
                        Nav.vista3.btn12.setEnabled(true);
                        Nav.vista3.btn13.setEnabled(true);
                        Nav.vista3.btn14.setEnabled(true);
                        Nav.vista3.btn15.setEnabled(true);
                        Nav.vista3.btn16.setEnabled(true);
                        Nav.vista3.btn17.setEnabled(true);
                        Nav.vista3.btn18.setEnabled(true);
                        Nav.vista3.btn19.setEnabled(true);
                        Nav.vista3.btn20.setEnabled(true);
                        Nav.vista3.btn21.setEnabled(true);
                        Nav.vista3.btn22.setEnabled(true);
                        Nav.vista3.btn23.setEnabled(true);
                        Nav.vista3.btn24.setEnabled(true);
                        Nav.vista3.btn25.setEnabled(true);
                        Nav.vista3.setMovimientos(0);
                        for (int i = 0; i < 5; i++) {
                            for (int j = 0; j < 5; j++) {
                                Nav.vista3.tab5x5[i][j] = 0;
                            }
                        }
                        System.out.println("Eliminado con éxito");
            }
                    }
    }
}
