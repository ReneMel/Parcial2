package Clases;

import interfaces.Ruedas;

public class Gusanito implements Ruedas {

    static int precio=3;
    public Boolean[][] asientos = new Boolean[12][2];

    public Gusanito() {
        for (int i=0;i<12;i++){
            for (int j=0;j<2;j++){
                asientos[i][j]=false;
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
        return 0;
    }
}
