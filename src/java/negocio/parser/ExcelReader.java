/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio.parser;

import java.util.ArrayList;
import negocio.dto.PersonaDTO;
import negocio.interfaces.InterfaceExcel;

/**
 * Clase EmailReader. Se encarga de leer el archivo y retornar la lista de personas para enviar el email.
 * @author javie
 */
public class ExcelReader implements InterfaceExcel{

    @Override
    public ArrayList<PersonaDTO> leerArchivo(String ruta) {
        //Busca el archivo y realiza el correspondiente recorrido. Se construye un List<PersonaDTO>. 
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}