package ru.gorshckov;
public class Main {

    
    public static void main(String[] args) {

        Obstacle[] obstacles = {new Road(2), new Water(3), new Wall(3)};

        Animal[] animals1 = {new Cat(4, 3),
                             new Dog(5, 11, 2),
                             new Duck(6, 10)};

        Animal[] animals2 = {new Cat(40, 3),
                             new Cat(5, 100),
                              new Duck(60, 10)};


        Course course = new Course(obstacles,animals1);

        Team team1 = new Team("snow",animals1);

        Team team2 = new Team ("rain",animals2);

        team1.showAllMembers();
        course.doIt(team1);
        team1.showResult();

        System.out.println("========");

        team2.showAllMembers();
        course.doIt(team2);
        team2.showResult();



    }



}
