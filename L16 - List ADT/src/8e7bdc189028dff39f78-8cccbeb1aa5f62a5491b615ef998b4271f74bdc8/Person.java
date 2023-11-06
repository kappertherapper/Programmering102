/**
 * Created by kraken on 21.01.2016.
 */
public class Person implements  Comparable<Person>{
    public String getName() {
        return name;
    }
    String name;
    public int getCourse() {
        return course;
    }

    int course;
    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }



    public void setName(String name) {
        this.name = name;
    }

    private int group;

    public Person(String name, int course){
        this.name=name;

        this.course=course;
    }
    public Person(String name){
        this.name=name;

        this.course=0;
    }

    @Override
    public String toString() {
        return
                name ;
    }

    @Override
    public int compareTo(Person o) {
        Person emp = (Person) o;
        return name.compareTo(emp.getName());
    }
}
