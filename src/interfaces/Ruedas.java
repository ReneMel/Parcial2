package interfaces;


import Clases.Cliente;

import java.util.ArrayList;

public interface Ruedas{
     int precio=0;
     ArrayList<Cliente> Pasajeros= new ArrayList<>();
     void AnadirPersonas();
     void MostrarAsientos();
     int MostrarGanancias();



}