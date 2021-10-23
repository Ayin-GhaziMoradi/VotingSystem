import java.util.ArrayList;


public class VotingSystem {
    private ArrayList<Voting> votingList;

    /**
     * constructor
     */
    public VotingSystem() {
        votingList = new ArrayList<>();
    }

    /**
     *
     * @param voteQuestion the question to be asked
     * @param type 0 for single choice an 1 for multiple choices
     * @param choiceList list of all choices
     */
    public void createVoting(String voteQuestion , int type , ArrayList<String> choiceList){
        Voting tempVoting = new Voting(type , voteQuestion);
        tempVoting.setChoices(choiceList);
        votingList.add(tempVoting);
    }

    /**
     *
     * @return the list of votings
     */
    public ArrayList<Voting> getVotingList() {
        return votingList;
    }

    /**
     *
     * @param i index of the wanted voting
     * @return list of voters
     */
    public ArrayList<Person> getVoters(int i){
        return this.votingList.get(i).getVoters();
    }

    /**
     *
     * @param votingIndex index of the wanted voting
     * @param voter voter who is currently voting
     * @param votedList list of current voter's wanted choices
     */
    public void vote(int votingIndex , Person voter , ArrayList<String> votedList , String date){
        votingList.get(votingIndex).vote(voter , votedList , date);
    }

    /**
     *
     * @param index index of the wanted voting
     */
    public void printResult(int index){
        ArrayList<String> result = new ArrayList<>();
        result = votingList.get(index).getChoices();
        for(String s : result){
            System.out.println(s + " : " + votingList.get(index).getPolls().get(s).size());
        }

    }
}
