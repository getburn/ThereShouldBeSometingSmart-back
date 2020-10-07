package pl.heheszki.banana.model;

import javax.persistence.*;

@Entity
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long empId;
    private String empName;
    private String empSecName;
    private Long empDepId;  //id from different Departments table
    private int empSalary;  //wymiar czasu pracy
    private float empSalaryAmount;

    public EmployeeEntity (){

    }

    public EmployeeEntity(String empName, String empSecName, Long empDepId, int empSalary, float empSalaryAmount) {
        this.empName = empName;
        this.empSecName = empSecName;
        this.empDepId = empDepId;
        this.empSalary = empSalary;
        this.empSalaryAmount = empSalaryAmount;
    }

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpSecName() {
        return empSecName;
    }

    public void setEmpSecName(String empSecName) {
        this.empSecName = empSecName;
    }

    public Long getEmpDepId() {
        return empDepId;
    }

    public void setEmpDepId(Long empDepId) {
        this.empDepId = empDepId;
    }

    public int getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(int empSalary) {
        this.empSalary = empSalary;
    }

    public float getEmpSalaryAmount() {
        return empSalaryAmount;
    }

    public void setEmpSalaryAmount(float empSalaryAmount) {
        this.empSalaryAmount = empSalaryAmount;
    }


}
