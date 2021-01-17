package feri.pora.datalib;

import java.util.ArrayList;

public class Diagnosis {
    private String id;
    private String name;
    private String description;
    private ArrayList<Therapy> therapyList;
    private String doctorId;
    private String timestamp;

    public Diagnosis(String id, String name, String description, String doctorId,
                     String timestamp) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.doctorId = doctorId;
        this.timestamp = timestamp;
        therapyList = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void addTherapyToList(Therapy t) {
        if(! therapyList.contains(t))
            therapyList.add(t);
    }

    public void removeFromTherapyList(Therapy t) {
        if(therapyList.contains(t))
            therapyList.remove(t);
    }

    public ArrayList<Therapy> getTherapyList() {
        return therapyList;
    }

    public void setTherapyList(ArrayList<Therapy> therapyList) {
        this.therapyList = therapyList;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getDoctorFullname(User user){
        for(Doctor doctor : user.getDoctorList()){
            if (doctor.getId().equals(doctorId))
                return doctor.getFullName();
        }
        return "Unknown doctor";
    }
}
