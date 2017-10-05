package terence.com.example.webservicedemo.demo0001.model;

import java.util.Date;

/**
 * Created by terence pan on 10/5/2017.
 */
public class User {
    public User(String firstName, String middleName, String lastName, Date birthdate, String positionAgency, String positionUnit, String positionClass, String positionSerial, String classTitle, String basePca, String baseIndex) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.birthdate = birthdate;
        this.positionAgency = positionAgency;
        this.positionUnit = positionUnit;
        this.positionClass = positionClass;
        this.positionSerial = positionSerial;
        this.classTitle = classTitle;
        this.basePca = basePca;
        this.baseIndex = baseIndex;
    }

    private long uid;

    private String firstName;

    private String middleName;

    private String lastName;

    private Date birthdate;

    private String positionAgency;

    private String positionUnit;

    private String positionClass;

    private String positionSerial;

    private String classTitle;

    private String basePca;

    private String baseIndex;

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getPositionAgency() {
        return positionAgency;
    }

    public void setPositionAgency(String positionAgency) {
        this.positionAgency = positionAgency;
    }

    public String getPositionUnit() {
        return positionUnit;
    }

    public void setPositionUnit(String positionUnit) {
        this.positionUnit = positionUnit;
    }

    public String getPositionClass() {
        return positionClass;
    }

    public void setPositionClass(String positionClass) {
        this.positionClass = positionClass;
    }

    public String getPositionSerial() {
        return positionSerial;
    }

    public void setPositionSerial(String positionSerial) {
        this.positionSerial = positionSerial;
    }

    public String getClassTitle() {
        return classTitle;
    }

    public void setClassTitle(String classTitle) {
        this.classTitle = classTitle;
    }

    public String getBasePca() {
        return basePca;
    }

    public void setBasePca(String basePca) {
        this.basePca = basePca;
    }

    public String getBaseIndex() {
        return baseIndex;
    }

    public void setBaseIndex(String baseIndex) {
        this.baseIndex = baseIndex;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthdate=" + birthdate +
                ", positionAgency='" + positionAgency + '\'' +
                ", positionUnit='" + positionUnit + '\'' +
                ", positionClass='" + positionClass + '\'' +
                ", positionSerial='" + positionSerial + '\'' +
                ", classTitle='" + classTitle + '\'' +
                ", basePca='" + basePca + '\'' +
                ", baseIndex='" + baseIndex + '\'' +
                '}';
    }

}
