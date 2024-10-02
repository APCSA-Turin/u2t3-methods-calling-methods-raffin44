public class GameRunner {
    public static void main(String[] args) {
        Game game = new Game("Cricket", "Mominul891",8, 353);
        System.out.println("Game name: " + game.getgameName());
        System.out.println("Username: "+ game.getUsername()); // new getter method
        System.out.println("Players: " + game.getplayers());
        System.out.println("Score: " + game.getscore());
        System.out.println("Is game over? " + game.isgameover());
        System.out.println(game.status());  // new method caller

        System.out.println("----- UPDATING STATE OF GAME -----");
        game.addPlayer();
        game.addPlayer();
        game.addPlayer();
        game.increaseScore(140);
        game.increaseScore(241);
        System.out.println("Game name: " + game.getgameName());
        System.out.println("Username: "+ game.getUsername());
        System.out.println("Players: " + game.getplayers());
        System.out.println("Score: " + game.getscore());
        System.out.println("Avg score per player: " + game.averageScorePerPlayer());
        System.out.println("Is game over? " + game.isgameover());
        System.out.println(game.status());  // new method caller
    }
}
