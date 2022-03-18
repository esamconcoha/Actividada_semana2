
package herencia1;


public class person {
    private String name;
    private String Address;

    public person(String name, String Address) {
        this.name = name;
        this.Address = Address;
    }

    public person() {
    }
    
    
        

    public String getName() {
        return name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }
    
    @Override
    public String toString(){
        StringBuilder gg = new StringBuilder();
        gg.append("\nnombre: ");
        gg.append(name);
        gg.append("\nDirección : ");
        gg.append(Address);
        return gg.toString();
    }
   
    
     
   
    
    
    
}
