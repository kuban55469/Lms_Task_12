public class School {
    private String name;
    private String address;
    private int schoolNum;
    private School[] schools;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setSchoolNum(int schoolNum) {
        this.schoolNum = schoolNum;
    }

    public int getSchoolNum() {
        return schoolNum;
    }

    public void setSchools(School[] schools) {
        this.schools = schools;
    }

    public School[] getSchools() {
        return schools;
    }
}
