package pl.heheszki.banana.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DepartmentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long depId;
    private String depName;
    private Long depMPK;
    private Float depBudget;

    public DepartmentEntity() {
    }

    public DepartmentEntity(String depName, Long depMPK, Float depBudget) {
        this.depName = depName;
        this.depMPK = depMPK;
        this.depBudget = depBudget;
    }

    public Long getDepId() {
        return depId;
    }

    public void setDepId(Long depId) {
        this.depId = depId;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public Long getDepMPK() {
        return depMPK;
    }

    public void setDepMPK(Long depMPK) {
        this.depMPK = depMPK;
    }

    public Float getDepBudget() {
        return depBudget;
    }

    public void setDepBudget(Float depBudget) {
        this.depBudget = depBudget;
    }
}
