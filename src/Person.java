public class Person {
    private String name;
    private String surname;
    private int age;
    private int telNum;
    private Person[] people;


    void setName(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }

    void setSurname(String surname){
        this.surname = surname;
    }

    String getSurname() {
        return surname;
    }


    void setAge(int age) {
        this.age = age;
    }

    int getAge() {
        return age;
    }

    public void setTelNum(int telNum) {
        this.telNum = telNum;
    }

    public int getTelNum() {
        return telNum;
    }

    public void setPeople(Person[] people) {
        this.people = people;
    }

    public Person[] getPeople() {
        return people;
    }
}
