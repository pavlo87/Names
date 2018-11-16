package Kid;

import java.util.Objects;

public class Kid implements Comparable<Kid> {
    private String name;
    private Integer age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Kid)) return false;
        Kid kid = (Kid) o;
        return Objects.equals(getName(), kid.getName()) &&
                Objects.equals(getAge(), kid.getAge());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }

    public Kid(String name, int age){
        this.setName(name);
        this.setAge(age);

    }
    @Override
    public int compareTo (Kid n) {
        return  this.getAge()-n.getAge();

    }

    @Override
    public String toString() {
return "Name"+": "+getName() +" "+"age: "+ getAge();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}

