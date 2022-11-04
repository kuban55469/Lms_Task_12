import java.util.Arrays;

public class University {
    private String name;
    private String address;
    private String faculties;
    private University [] universities;

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

    public void setFaculties(String faculties) {
        this.faculties = faculties;
    }

    public String getFaculties() {
        return faculties;
    }

    public void setUniversities(University[] universities) {
        this.universities = universities;
    }

    public University[] getUniversities() {
        return universities;
    }
}
