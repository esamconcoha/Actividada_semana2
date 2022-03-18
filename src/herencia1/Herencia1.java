
package herencia1;


public class Herencia1 {

    
    public static void main(String[] args) {
        
        
        
        //impresión de datos de superclase person
        person p = new person("sergio cano", "Ciudad de Guatemala");
        System.out.println(p.toString());
        
        
        
        
        //impresión de datos clase student (herencia de person)
       student estudiante= new student ("programa matutino", 5, 560.33, "victor luna", "San Raymundo");
       
        System.out.println(estudiante.toString());
        
        //impresión de datos clase staff (herencia de person)
        staff master= new staff ("INED", 3650.00, "Emilio Cap", "San Juan Sacatepéquez");
        System.out.println(master.toString());
        
        
        
        
    }
    
    
    
}
