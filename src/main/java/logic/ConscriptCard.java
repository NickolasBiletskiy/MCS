package logic;

/**
 * Created by user on 20.03.2015.
 */
public class ConscriptCard {
    private int id;
    private String name;
    private String surName;
    private String fathersName;
    private String phoneNumber;
    private String passportData;
    private String medicalCardId;

    public ConscriptCard() {
    }
    // Незабути додати ссилку на медкартку
    public ConscriptCard(String name, String surName, String fathersName,
                         String phoneNumber, String passportData, String medicalCardId){
        setName(name);
        setSurName(surName);
        setFathersName(fathersName);
        setPhoneNumber(phoneNumber);
        setPassportData(passportData);
        setMedicalCardId(medicalCardId);

    }

    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMedicalCardId() {
        return medicalCardId;
    }

    public void setMedicalCardId(String medicalCardId) {
        this.medicalCardId = medicalCardId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassportData() {
        return passportData;
    }

    public void setPassportData(String passportData) {
        this.passportData = passportData;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }


}
