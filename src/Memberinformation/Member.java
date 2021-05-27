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
    } //@Christian

    public Member (){}

    public double getMembershipFee(){//if member age 60+ && !passive = 25% discount //@Christian
        if (this.age >= 60 && !this.activity.getActivity().equalsIgnoreCase("passive")){//Read up on
            return this.activity.getPrice() * 0.75;
        }
        else{
            return this.activity.getPrice();
        }
    }

    public static void showProjectedIncome() throws FileNotFoundException { //@Christian
        MemberManager newManager = new MemberManager();
        ArrayList<Member> allMembers = newManager.getMemberlist();
        double projectedIncomeJunior = 0;
        double projectedIncomeSenior = 0;
        double projectedIncomePassives = 0;
        //Parse allMembers
        for (int i = 0; i < allMembers.size(); i++) {
            Member currentMember = allMembers.get(i);
            switch(currentMember.getActivity().getActivity()){ //Identify activity
                case "Junior" -> projectedIncomeJunior = projectedIncomeJunior + currentMember.getMembershipFee();
                case "Senior" -> projectedIncomeSenior = projectedIncomeSenior + currentMember.getMembershipFee();
                case "Passive" -> projectedIncomePassives = projectedIncomePassives + currentMember.getMembershipFee();
            }
        }
        System.out.println("Total projected income from Junior members: " + projectedIncomeJunior);
        System.out.println("Total projected income from Senior members: " + projectedIncomeSenior);
        System.out.println("Total projected income from Passive members: " + projectedIncomePassives);
        System.out.println("Total projected income from all members: " + (projectedIncomePassives + projectedIncomeJunior + projectedIncomeSenior));
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

    public boolean compareTo(Member m){
        return m.toString().equals(this.toString());
    }
}