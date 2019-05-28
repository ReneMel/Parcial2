package Clases;

import interfaces.Ruedas;

public class Chicago implements Ruedas {

    static int precio=3;
    public Boolean[][] asientos = new Boolean[24][2];

    public Chicago() {
        for (int i=0;i<24;i++) {
            for (int j = 0; j < 2; j++) {
                asientos[i][j] = false;
            }
        }
    }

    @Override
    public void AnadirPersonas(Cliente m) {

    }

    @Override
    public void MostrarAsientos() {

    }

    @Override
    public int MostrarGanancias() {
            int cont=0;
            for (int i=0;i<24;i++){
                for (int j=0;j<2;j++){
                    if (asientos[i][j]==true){
                        cont++;
                    }
                }
            }
            cont= cont*this.precio;
        return cont;
    }
}
