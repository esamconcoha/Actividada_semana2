
package herencia1;


public class student extends person {
    
    private String program;
    private int year;
    private double fee; 

    public student(String program, int year, double fee, String name, String Address) {
        super(name, Address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString(){
        StringBuilder gg = new StringBuilder();
        gg.append("\nPrograma : ");
        gg.append(program);
        gg.append("\nAño de estudio : ");
        gg.append(year);
        gg.append("\nPago mensual: ");
        gg.append(fee);
        return gg.toString();
    }

    
    
    
    
    
}
