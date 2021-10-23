import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

public class Voting {
    //0 for single vote and 1 for multi-vote
    private int type;
    private String question;
    private ArrayList<Person> voters;
    private ArrayList<String> choices;
    //choice --> votes
    private HashMap<String , HashSet<Vote>> polls;


    /**
     * constructs t
     * @param type 0 for single vote and 1 for multi-vote
     * @param question the question to be asked from voters
     */
    public Voting(int type, String question) {
        this.type = type;
        this.question = question;
        voters = new ArrayList<>();
        polls = new HashMap<>();
        choices = new ArrayList<>();
    }

    /**
     *
     * @return get the vote question String
     */
    public String getQuestion() {
        return question;
    }

    /**
     *
     * @return choices list
     */
    public ArrayList<String> getChoices() {
        return choices;
    }

    /**
     *
     * @param choices enter every possible choice as a list
     */
    public void setChoices(ArrayList<String> choices) {
        this.choices = choices;
    }

    /**
     *
     * @param s the new choice string
     */
    public void createPoll(String s) {
        choices.add(s);
    }

    /**
     *
     * @param voter person object : voter
     * @param votes a list of voter's chosen ones
     */
    public void vote(Person voter , ArrayList<String> votes , String date){   // !!!!!!!!
        if(voters.contains(voter)){
            System.out.println("this person has already voted");
        }else {
            if(votes.size()>1 && this.type == 0){
                System.out.println("only one vote is permitted");
            }else {
                if(this.type == 0 && votes.get(0) == "Random"){   //////////////
                    Random r = new Random();
                    int index = r.nextInt(choices.size());
                    String s = choices.get(index);
                    HashSet<Vote> tempVotes = polls.get(s);
//                    String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
                    Vote tempVote = new Vote(voter, date);
                    tempVotes.add(tempVote);
                    polls.replace(s, tempVotes);
                    voters.add(voter);
                }else {
                    for (String s : votes) {
                        HashSet<Vote> tempVotes = new HashSet<>();
                        tempVotes = this.polls.get(s);
//                        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
                        Vote tempVote = new Vote(voter, date);
                        tempVotes.add(tempVote);
                        polls.replace(s, tempVotes);
                        voters.add(voter);
                    }
                }
            }
        }
    }

    /**
     * get the voters list
     * @return returns an ArrayList of Person objects
     */
    public ArrayList<Person> getVoters() {
        return voters;
    }

    /**
     * prints every voters first and last name
     */
    public void printVotes(){
        for(Person p : voters){
            System.out.println(p.toString());
        }
    }

    /**
     * returns polls as a hashmap
     * @return polls hashmap which stores every vote
     */
    public HashMap<String, HashSet<Vote>> getPolls() {
        return polls;
    }
}
