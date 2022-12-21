public class Hospital {
    private String Name;
    private String Address;
    private String PhoneNumber;
    List<Doctor> doctorList = new ArrayList<Doctor>();
    List<Patient> patientList = new ArrayList<Patient>();

    // constructor
    public Hospital(String Name, String Address, String PhoneNumber) {
        this.Name = Name;
        this.Address = Address;
        this.PhoneNumber = PhoneNumber;
    }

    public String getName() {
        return Name;
    }

    public String setName(String Name) {
        this.Name = Name;
        return Name;
    }

    public String getAddress() {
        return Address;
    }

    public String setAddress(String Address) {
        this.Address = Address;
        return Address;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public String setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
        return PhoneNumber;
    }

    // other functions
    void addDoctor(Doctor o)
    {
        doctorList.add(o);

    }
    void addPatient(Patient o)
    {
        patientList.add(o);
    }
    public List<Doctor> showDoctors()
    {
        return doctorList;
    }
    public List<Patient> showPatients()
    {
        return patientList;
    }
}
