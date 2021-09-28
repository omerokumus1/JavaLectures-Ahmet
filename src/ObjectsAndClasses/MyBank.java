package ObjectsAndClasses;

public class MyBank {


    private int numberOfEmployees;
    private String address;
    private int annualRevenue;
    private double interestRate;

    public int getNumberOfEmployees(){
        return numberOfEmployees;
    }
    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public void incrementNumberOfEmployees(){
        this.numberOfEmployees++;
    }
    public void decrementNumberOfEmployees(){
        this.numberOfEmployees--;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public void setAnnualRevenue(int annualRevenue){
        this.annualRevenue = annualRevenue;
    }
    public void addAnnualRevenue(int annualRevenue){
        this.annualRevenue += annualRevenue;
    }

    private void setInterestRate(double interestRate){
        this.interestRate = interestRate;
    }

    public void changeInterestRate(boolean willChange){
        if (willChange)
            setInterestRate(2);
    }

}
