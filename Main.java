public class Main {
    public static void main(String[] args) {
            // create Letter object
        Letter myLetter = new Letter("Raffin");

            // write letters to various people
        myLetter.writeLetter("Amy");
        System.out.println();
        myLetter.writeLetter("Ethan");
        System.out.println();
        myLetter.writeLetter("Bonnie");
        System.out.println();
        myLetter.writeLetter("Scott");
    }
}