package Memberinformation;
//@Emilia

public abstract class Member{
    private String name;
    private int age;
    private boolean isOver60;
    private boolean isInArrears;
    private String activity;

    public static void member(String name, int age, String activity){
        name = name;
        age = age;
    }

    public double calculatePrice(){
        double totalPrice;
        if (this.age >= 60){
            totalPrice = totalPrice*0.75;
        }
        return totalPrice;
    }
}

