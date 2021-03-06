/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio.facade;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import negocio.dao.interfaces.IExcelContent;
import negocio.dao.interfaces.IUserDAO;
import negocio.daos.LogDAO;
import negocio.daos.UserDAO;
import negocio.dto.LogDTO;
import negocio.dto.PersonaDTO;
import negocio.dto.UserDTO;
import negocio.interfaces.InterfaceEmailResponse;
import negocio.interfaces.InterfaceExcel;
import negocio.parser.ExcelReader;
import negocio.response.EmailBuilder;
import org.apache.commons.codec.digest.DigestUtils;
import util.Conexion;

/**
 * Clase Facade. Clase controlador. La separo del servlet para no hacer masacote de código
 * Se encarga de recibir la ruta, pedir el procesamiento del archivo y envío de los emails para retornar el resultado 
 * @author javie
 */
public class Facade {
    private InterfaceExcel excel_helper = new ExcelReader();
    private EmailBuilder email_helper = new EmailBuilder();
    
    public boolean IniciarSesion(String user, String pass) throws SQLException{
        Connection con=null;
        try {
            con=Conexion.conectar();
            IUserDAO udao=UserDAO.getInstanceUserDAO(con);
            UserDTO udto=new UserDTO(user, this.encriptar(pass));
            return udao.validarUsuario(udto);
        } catch (Exception ex) {
            Logger.getLogger(Facade.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(con!=null){
                con.close();
            }
        }
        return false;
    }
    
    private String encriptar(String cad){
        return DigestUtils.md5Hex(cad);    
    }
    
    public boolean leerArchivo(String ruta, String contenido, String asunto,int columna){
        //Pedir a excel_helper que retorne la lista de Personas a través de leerArchivo
        System.out.println("datos entrada ******************************************\n"+ruta+"\n"+contenido+"\n"+asunto+"\n"+columna);
        IExcelContent ec=excel_helper.leerArchivo(ruta);
        //Delegar función de envío de email a enviarEmail (Abajo). Retornar su boolean
        return this.enviarEmail(ec, contenido, asunto,columna);
    }
    
    public boolean enviarEmail(IExcelContent tabla, String contenido, String asunto, int columna){
        //Al tener el list pedir al email_helper enviar los email. email_helper (Instacia de EmailBuilder)
        return email_helper.enviarEmails(tabla, contenido, asunto, columna);
        //Retornar boolean de email_helper
        //return false;
    }
    
    public boolean registrarLog(String titulo, String descripcion, String fecha_hora_inicio, String fecha_hora_fin){
        LogDAO dao = new LogDAO();
        boolean exito = false;
        try{
            LogDTO dto = new LogDTO(titulo, descripcion, fecha_hora_inicio, fecha_hora_fin);
            exito = dao.registrarLog(dto);
        }catch(Exception e){
            e.getStackTrace();
        }
        return exito;
    }
    
    public static void main(String[] args) {
        Facade f=new Facade();
        System.out.println(f.leerArchivo("C:\\Users\\Lenovo\\Desktop\\prueba.xlsx", "$nombre$ hola $telefono$", "nada", 1));
    }
    
}
