import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        VotingSystem vs = new VotingSystem();
        ArrayList<String> ch = new ArrayList<>();
        ch.add("choice 1");
        ch.add("choice 2");
        ch.add("choice 3");
        vs.createVoting("which one is your choice ? " , 1 , ch);
        Person voter1 = new Person("firstName1" , "lastName1");
        ArrayList<String> voter1Choices = new ArrayList<>();
        voter1Choices.add("choice 1");
        voter1Choices.add("choice 2");
        voter1Choices.add("choice 3");
        vs.vote(0 , voter1 , voter1Choices , "1399 3 31" );

        Person voter2 = new Person("firstName2" , "lastName2");
        ArrayList<String> voter2Choices = new ArrayList<>();
        voter1Choices.add("choice 1");
        voter1Choices.add("choice 2");
        vs.vote(0 , voter2 , voter2Choices , "1399 4 3");

        vs.printResult(0);
    }
}
