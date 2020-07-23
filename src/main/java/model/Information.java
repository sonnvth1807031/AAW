package model;

import javax.persistence.*;

@Entity
@Table(name = "information")
public class Information {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "subjects")
    private String subjects;

    @Column(name = "name")
    private String name;

    @Column(name = "rollNumber")
    private String rollNumber;

    @Column(name = "theoreticalPoint")
    private double theoreticalPoint;

    @Column(name = "practicePoints")
    private double practicePoints;

    @Column(name = "AssignmentPoints")
    private double AssignmentPoints;

    @Column(name = "createAT")
    private long createAT;

    @Column(name = "updateAt")
    private long updateAt;

    public Information(Integer id, String subjects, String name, String rollNumber, double theoreticalPoint, double practicePoints, double assignmentPoints, long createAT, long updateAt) {
        this.id = id;
        this.subjects = subjects;
        this.name = name;
        this.rollNumber = rollNumber;
        this.theoreticalPoint = theoreticalPoint;
        this.practicePoints = practicePoints;
        AssignmentPoints = assignmentPoints;
        this.createAT = createAT;
        this.updateAt = updateAt;
    }

    public Information() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSubjects() {
        return subjects;
    }

    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public double getTheoreticalPoint() {
        return theoreticalPoint;
    }

    public void setTheoreticalPoint(double theoreticalPoint) {
        this.theoreticalPoint = theoreticalPoint;
    }

    public double getPracticePoints() {
        return practicePoints;
    }

    public void setPracticePoints(double practicePoints) {
        this.practicePoints = practicePoints;
    }

    public double getAssignmentPoints() {
        return AssignmentPoints;
    }

    public void setAssignmentPoints(double assignmentPoints) {
        AssignmentPoints = assignmentPoints;
    }

    public long getCreateAT() {
        return createAT;
    }

    public void setCreateAT(long createAT) {
        this.createAT = createAT;
    }

    public long getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(long updateAt) {
        this.updateAt = updateAt;
    }
}
