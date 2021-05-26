package Memberinformation;
//@Emilia

import FileHandler.MemberManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

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
    }

    public String toString() {
        return name +";"+ age +";"+ activity.toString();
    }

    public Member (){}

    public double getMembershipFee(){//if member age 60+ && !passive = 25% discount
        if (this.age >= 60 && !this.activity.getActivity().equalsIgnoreCase("passive")){//Read up on
            return this.activity.getPrice() * 0.75;
        }
        else{
            return this.activity.getPrice();
        }
    }
    //Methods:
    //System.out.println("Press 1 to Show projected income");
    /*Read nop. of members from file
        Spilt file into:
        Junior
        Senior
        Passive

    Multiply each category no. of members w/ category price
    System.out.println(Result)*/
    public void showProjectedIncome() throws FileNotFoundException {
        MemberManager newManager = new MemberManager();
        ArrayList<Member> allMembers = newManager.getMemberlist();
        //Parse allMembers
        //Identify activity
        //get price
        //while (allMembers : allMembers){

    }

    //System.out.println("Press 3 to change prices");
    /*Read file
     * Show current prices
     * Take input to change prices from user*/

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

    public boolean compareTo(Member m){
        return m.toString().equals(this.toString());
    }
}