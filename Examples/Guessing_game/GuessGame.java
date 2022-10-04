public class GuessGame{

    // 3 instance variables for 3 player objects
    Player p1;
    Player p2;
    Player p3;

    public void startGame(){
        
        p1 = new player();
        p2 = new player();
        p3 = new player();

        // Variable to count number of guesses
        int guessP1 = 0;
        int guessP2 = 0;
        int guessP3 = 0;

        // 3 Variables to hold true/false based on their answers
        bollean p1IsRight = false;
        bollean p2IsRight = false;
        bollean p3IsRight = false;

        int targetNumber = (int) (Math.random() * 10); // Target number for players
        System.out.println("I'm thinking a number from 0 to 9");

        // Call Guess Method
        while (true) {
            p1.guess();
            p2.guess();
            p3.guess();

            guessP1 = p1.number;
            System.out.println("Number of guesses is: "  + guessP1);

            guessP2 = p2.number;
            System.out.println("Number of guesses is: "  + guessP2);

            guessP3 = p3.number;
            System.out.println("Number of guesses is: "  + guessP3);

            if (guessp1 == targetNumber){
                p1IsRight == true;
            }

            if (guessp2 == targetNumber){
                p2IsRight == true;
            }

            if (guessp3 == targetNumber){
                p3IsRight == true;
            }

            // OR..
            if (p1IsRight || p2IsRight || p3IsRight){
                System.out.println("We have a winner!");
                System.out.println("Player 1 got it right? " + p1IsRight);
                System.out.println("Player 2 got it right? " + p2IsRight);
                System.out.println("Player 3 got it right? " + p3IsRight);
                break; // Break out from the loop
            }

            else {
                System.out.println("Nobody got it! Let's continue");             
            }
        }
    }
}
