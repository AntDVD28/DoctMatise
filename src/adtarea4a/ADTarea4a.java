package adtarea4a;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


//librería proporcionada por Matisse (necesaria porque vamos a utilizar los
//objetos propios de Matisse, en lugar de los genéricos que nos
//proporcionaría una conexión mediante JDBC)
import com.matisse.MtDatabase;
import com.matisse.MtException;

/**
 *
 * @author AntDVD
 */
public class ADTarea4a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //crea el objeto base de datos MtDatabase indicando la cadena de conexión
        //indicamos nombre del host y de la base de datos
        //no se necesita usuario porque no se ha deficnido un control de acceso
        MtDatabase db = new MtDatabase("localhost", "doctorado");
        //mensaje para la Salida
        System.out.println("=========== connectFromMtDatabase ==========\n");
        try {
            //conecta con la base de datos
            db.open();
            //inicia una transacción (matisse gestiona todas las operaciones como transacciones)
            db.startTransaction();
            //insertar datos en registros
            insertarObjetos(db);
        } catch (MtException mte) {
            //mensaje para la Salida
            System.out.println("MtException : " + mte.getMessage());
        } finally {
            //confirma cualquier transacción en proceso
            if (db.isTransactionInProgress()) {
                db.commit();
            }
            //cierra la base de datos
            db.close();
        }
    }
    
    private static void insertarObjetos(MtDatabase db) {
        //crea objetos Departamento
        Departamento d1 = new Departamento(db);
        d1.setNombre("Programación");
       
        // Crea objetos Tesis
        Tesis t1 = new Tesis(db);
        t1.setTitulo("Programación en JAVA");
        t1.setTema("Fundamentos de programación");
        Tesis t2 = new Tesis(db);
        t2.setTitulo("Java Orientado a Objetos");
        t2.setTema("Ventajas e inconvenientes");
        
        // Crea un objetos Profesor
        Profesor p1 = new Profesor(db);
        p1.setNombre("David Jiménez Riscardo");
        p1.setEmail("david.jimenez@universi.es");
        p1.setIngreso(1990);
        Profesor p2 = new Profesor(db);
        p2.setNombre("Cristina Cifuentes Gonzales");
        p2.setEmail("cristina.cifuentes@universi.es");
        p2.setIngreso(1986);
        
        //establece relaciones entre Profesor y Departamento anteriormente creados
        //Al establecer una relación no hace falta establecer la inversa*/
        p1.setPertenece(d1);
        p1.appendDirige(t1);
        p2.setPertenece(d1);
        p2.appendDirige(t2);
    }
    
}
