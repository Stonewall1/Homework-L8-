package task3;

import static task3.Voter.listOfVoters;

public class Main {
    public static void main(String[] args) {
        Candidate candidate1 = new Candidate("General Lee" , 60 , "Make America great again");
        Candidate candidate2 = new Candidate("A.Linkoln" , 60 , "Cleanse the south!");
        Candidate candidate3 = new Candidate("CookieMaker" , 30 , "Cookies to everyone!");
        Candidate.addToList(candidate1 , candidate2 , candidate3);
        candidate1.info();
        candidate2.info();
        candidate3.info();

        Voter voter1 = new Voter("Anna" , 25);
        Voter voter2 = new Voter("Julia" , 32);
        Voter voter3 = new Voter("Igor" , 21);
        Voter voter4 = new Voter("Ilya" , 24);
        Voter voter5 = new Voter("Anastasia" , 27);
        Voter voter6 = new Voter("Dmitry" , 29);
        Voter voter7 = new Voter("Anton" , 40);
        Voter voter8 = new Voter("Mark" , 69);
        Voter voter9 = new Voter("David" , 48);
        Voter voter10 = new Voter("Mike" , 34);
        Voter.addToList(voter1 , voter2 , voter3 , voter4 , voter5 ,voter6 ,voter7 ,voter8 ,voter9 ,voter10);
        System.out.println("Voters:");
        for(Voter voter : listOfVoters){
            voter.info();
        }
        for(Voter voter : listOfVoters){
             int randomVote = voter.vote();
             if(randomVote == 0){
                 candidate1.setPoints(candidate1.getPoints() + 1);
             }
             else if(randomVote == 1){
                 candidate2.setPoints(candidate2.getPoints() + 1);
             }
             else candidate3.setPoints(candidate3.getPoints() + 1);
        }
        candidate1.info();
        candidate2.info();
        candidate3.info();

        if(candidate1.getPoints() > candidate2.getPoints() && candidate1.getPoints() > candidate3.getPoints()){
            System.out.println(candidate1.isWon());
        }
        else if(candidate2.getPoints() > candidate1.getPoints() && candidate2.getPoints() > candidate3.getPoints()){
            System.out.println(candidate2.isWon());
        }
        else if(candidate3.getPoints() > candidate1.getPoints() && candidate3.getPoints() > candidate2.getPoints()){
            System.out.println(candidate3.isWon());
        }
        else System.out.println("Second tour is near");
    }
}
