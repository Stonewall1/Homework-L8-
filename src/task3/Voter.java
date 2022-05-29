package task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Voter extends Person implements ElectoralCampaign {
    static ArrayList<Voter> listOfVoters = new ArrayList<>();

    public Voter(String name, int age) {
        super(name, age);
    }

    @Override
    public int vote() {
            Random random = new Random();
            return random.nextInt(3);
    }

    public static void addToList(Voter ... voters) {
        listOfVoters.addAll(Arrays.asList(voters));
    }

    public void info() {
        System.out.println(getName() + "," + getAge());
    }
}
