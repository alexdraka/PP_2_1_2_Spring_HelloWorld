
public class Cat {
    private Long id;

    private String name;

    private Byte age;

    public Cat() {

    }

    public Cat(String name, Byte age) {
        this.name = name;
        this.age = age;
    }

    public Cat(long id, String name, byte age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
    }

}
