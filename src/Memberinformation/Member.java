package Memberinformation;
//@Emilia

public abstract class Member{
    private String name;
    private int age;
    private boolean isOver60;
    private boolean isInArrears;

    public static void member(String name, int age, boolean isOver60, boolean isInArrears){
        name = name;
        age = age;
        isInArrears = false;
        isOver60 = false;
        if (age >= 60){
            isOver60 = true;
        }

    }

    public abstract double calculatePrice();

}
