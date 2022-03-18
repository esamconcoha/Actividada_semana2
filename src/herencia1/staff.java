
package herencia1;


public class staff extends person {
    
    private String school;
    private double pay;

    public staff(String school, double pay, String name, String Address) {
        super(name, Address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }
    
    @Override
    public String toString(){
        StringBuilder gg = new StringBuilder();
        gg.append("\nEscuela: ");
        gg.append(school);
        gg.append("\nPaga mensual : ");
        gg.append(pay);
        return gg.toString();
    }

    
    
    
    
    
    
}
