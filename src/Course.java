package ru.gorshckov;

public class Course {

    private Obstacle [] obstacles;
    protected Animal [] members;


    public Course(Obstacle[] obstacles, Animal[] members) {
        this.obstacles = obstacles;
        this.members = members;
    }

    public void doIt(Team team) {
        for (Obstacle o:obstacles) {
            for (Animal a:members) {
                o.doIt(a);
            }
        }
    }
}