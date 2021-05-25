package Memberinformation;
//@Emilia

public class Member{
//@Christian
    private String name;
    private int age;
    private boolean isOver60;
    private boolean isInArrears;
    private Membership activity;

    public Member(String name, int age){
        this.name = name;
        this.age = age;
        setOver60();
    }

    //TODO: MemberToString
        //Return member name + age + activity
    public String toString() {
        return name +";"+ age +";"+ activity +";"+ getMembershipFee() + activity.getPrice();
    }

    public Member (){}

    public double getMembershipFee(){//if member age 60+ && !passive = price * 0,75
        //this.age
        //this.activity
        System.out.println(activity.getPrice());
        if (this.age >= 60 && !this.activity.getActivity().equalsIgnoreCase("passive")){//Read up on
            return this.activity.getPrice() * 0.75;
        }
        else{
            return this.activity.getPrice();
        }
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

    }
    public boolean getOver60(){
        return isOver60;
    }

    public void setInArrears(boolean inArrears) {
        isInArrears = inArrears;
    }

    public void setActivity(Membership activity) {
        this.activity = activity;
    }
    public Membership getActivity() {
        return activity;
    }
}