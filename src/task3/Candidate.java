package task3;

import java.util.ArrayList;
import java.util.Arrays;

public class Candidate extends Person {
    private String promise;
    private int points = 0;
    static ArrayList<Candidate> listOfCandidates = new ArrayList<>();

    public Candidate(String name, int age , String promise) {
        super(name, age);
        this.promise = promise;
    }

    public String getPromise() {
        return promise;
    }

    public void setPromise(String promise) {
        this.promise = promise;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
    public void info() {
        System.out.println(getName() + "," + getAge() + " have " + this.points + " points.");
    }
    public static void addToList(Candidate ... candidates) {
        listOfCandidates.addAll(Arrays.asList(candidates));
    }
    public String isWon(){
        return "Candidate " + getName() + " won!";
    }


}
