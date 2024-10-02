public class Game{
    //instance variables 
    private String gameName;
    private int players; 
    private int score; 
    private String username;
    private int highscore = 0; 

    //constructor
    public Game(String gameName, String username, int players, int highscore){
        this.gameName = gameName; 
        this.username = username; 
        this.players = players; 
        this.highscore = highscore; 
        score = 0;  
    }

    // new method
    public String getUsername(){
        return username;
    }
    // getter method
    public String getgameName() {
        return gameName;
    }
    // getter method
    public int getplayers() {
        return players;
    } 
    // getter method
    public int getscore() {
        return score;
    }

    public void addPlayer(){
        players++; 
    }

    public void increaseScore(int increase){
        score+=increase;
    }

    public double averageScorePerPlayer(){
        double average = (double) score / players;
        return average; 
    }

    public boolean isgameover(){
        if(score>9){
            return true;
        } else {
            return false;
        }
    }

    public String status(){
        if (highscore<score){
            return "Youre a pro! You beat the initial high score of "+highscore; 
        } else {
            return "You did not beat the high score!"; 
        }
    }
}