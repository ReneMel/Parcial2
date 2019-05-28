package interfaces;


import Clases.Cliente;

import java.util.ArrayList;

public interface Ruedas{
     ArrayList<Cliente> Pasajeros= new ArrayList<>();
     void AnadirPersonas(Cliente m);
     void MostrarAsientos();
     int MostrarGanancias();



}