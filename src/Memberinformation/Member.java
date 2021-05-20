package Memberinformation;
//@Emilia

public class Member{
//@Christian
    private String name;
    private int age;
    private boolean isOver60;
    private boolean isInArrears;
    private Membership activity;

    public void member(String name, int age, Membership activity){
        this.name = name;
        this.age = age;
        this.activity = activity;
        setOver60();
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void setOver60() {
        if (age >= 60){
            isOver60 = true;
        }
        else {
            isOver60 = false;}
    }

    public void setInArrears(boolean inArrears) {
        isInArrears = inArrears;
    }

}