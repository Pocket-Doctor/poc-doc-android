package feri.pora.datalib;
import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.print.Doc;


public class User extends Person {
    private String privateKey;
    private String publicKey;
    private String medicalNumber;
    private String password;
    private String language = "en";
    private ArrayList<Doctor> doctorList;

    public User(){
        super();
        doctorList = new ArrayList<Doctor>();
    }


    public User(String id, String privateKey, String publicKey,
                String medicalNumber, String fullName, String password, String phone) {
        super(id, fullName, phone, "");
        this.medicalNumber = medicalNumber;
        this.password = password;
        this.privateKey = privateKey;
        this.publicKey = publicKey;
        doctorList = new ArrayList<Doctor>();

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public String getMedicalNumber() {
        return medicalNumber;
    }

    public void setMedicalNumber(String medicalNumber) {
        this.medicalNumber = medicalNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void addDoctorToList(Doctor d) {
        if (!hasDoctor(d))
            doctorList.add(d);
    }

    public void removeDoctorFromList(Doctor d) {
       for (Doctor doctor : doctorList)
           if (d.getId().equals(doctor.getId())) {
               doctorList.remove(doctor);
               break;
           }


    }

    public boolean hasDoctor(Doctor doctor) {
        System.out.println(doctorList);
        for (Doctor d : doctorList){
            System.out.println("CHECKER " + doctor.getId() + " " + d.getId());
            if (d.getId().equals(doctor.getId()))
                return true;
        }

        return false;
    }

    public ArrayList<Doctor> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(ArrayList<Doctor> doctorList) {
        this.doctorList = doctorList;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "User{" +
                "privateKey='" + privateKey + '\'' +
                ", publicKey='" + publicKey + '\'' +
                ", medicalNumber='" + medicalNumber + '\'' +
                ", password='" + password + '\'' +
                ", doctorList=" + doctorList +
                ", id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", phone='" + phone + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}