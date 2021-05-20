package Memberinformation;
//@Emilia

public class Member{
//@Christian
    private String name;
    private int age;
    private boolean isOver60;
    private boolean isInArrears;
    private String activity;

    public static void member(){}

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

    public void setActivity(String activity) {
        this.activity = activity;
    }
    public String getActivity() {
        return activity;
    }
}