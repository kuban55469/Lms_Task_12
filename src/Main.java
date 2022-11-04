import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        University university = new University();
        university.setName("KNU");
        university.setAddress("Bishkek");
        university.setFaculties("IT");

        University university1 = new University();
        university1.setName("BGU");
        university1.setAddress("Osh");
        university1.setFaculties("History");

        University university2 = new University();
        university2.setName("Manas");
        university2.setAddress("Naryn");
        university2.setFaculties("Biology");
        University [] universities = {university,university1,university2};
        for (University u:universities) {
            System.out.print(u.getName()+" "+u.getAddress() + " "+u.getFaculties());
            System.out.println(" ");
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        School school = new School();
        school.setName("Lenin");
        school.setAddress("Ak-Ordo");
        school.setSchoolNum(24);

        School school1 = new School();
        school1.setName("Putin");
        school1.setAddress("Archa-Beshik");
        school1.setSchoolNum(76);

        School school2 = new School();
        school2.setName("Akaev");
        school2.setAddress("Ala-Too");
        school2.setSchoolNum(59);
        School [] schools = {school,school1,school2};
        for (School s:schools) {
            System.out.print(s.getName() + " " + s.getSchoolNum() + " " + s.getSchoolNum());
            System.out.println(" ");
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Person person = new Person();
        person.setName("Kuban");
        person.setSurname("Kelsinbekov");
        person.setAge(20);
        person.setTelNum(708281398);

        Person person1 = new Person();
        person1.setName("Chyngyz");
        person1.setSurname("Turusbekov");
        person1.setAge(22);
        person1.setTelNum(786745365);

        Person person2 = new Person();
        person2.setName("Aman");
        person2.setSurname("Tashtanov");
        person2.setAge(32);
        person2.setTelNum(990542876);

        Person person3 = new Person();
        person3.setName("Tolik");
        person3.setSurname("Kudaikulov");
        person3.setAge(16);
        person3.setTelNum(987657854);
        Person [] people = {person,person1,person2,person3};
        for (Person p:people) {
            System.out.print(p.getName() + " " + p.getSurname() + " " + p.getAge() + " " + p.getTelNum());
            System.out.println(" ");
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Car car = new Car();
        car.setBrand("Nissan");
        car.setName("skyline");
        car.setColor("Blue");
        car.setEngineVolume(3);

        Car car1 = new Car();
        car1.setBrand("Lada");
        car1.setName("Grand");
        car1.setColor("Red");
        car1.setEngineVolume(2);

        Car car2 = new Car();
        car2.setBrand("Tesla");
        car2.setName("Model 3");
        car2.setColor("Black");
        car2.setEngineVolume(4);
        Car [] cars = {car,car1,car2};
        for (Car c:cars) {
            System.out.print(c.getBrand() + " " + c.getName() + " " + c.getColor() + " " + c.getEngineVolume());
            System.out.println(" ");
        }



    }
}