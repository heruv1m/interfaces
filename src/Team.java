package ru.gorshckov;

public class Team {

    private String nameTeam;
    private Animal [] members;


    public Team(String nameTeam, Animal[] animals) {
        this.nameTeam = nameTeam;
        this.members = animals;
    }

    public void showResult (){

        for (Animal al2 : members) {
            System.out.println(al2.getName() + " on distance " + al2.isOnDistance());
        }
    }

    public void showAllMembers(){
        System.out.println("Team name - "+ nameTeam);
        for (Animal a :members) {
            System.out.println(a.name);
        }
    }

}
