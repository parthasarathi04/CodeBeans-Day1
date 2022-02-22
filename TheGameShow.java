import java.util.Random;

/**
  *  Game class helps us to show the game simulation
  */
class Game{
      
    /**
      * returns an integer based on the fact that - 
      *    the player has switched his/her door
      * 
      * @param carDoor : int --> Door with the car behind it
      * @param choiceDoor : int --> Door that the player has chosen
      * @return : int ( 1 if the player wins the car, else 0 )
      *
      */
    private static int swap(int carDoor, int choiceDoor){
       /** 
         * If he has chosen the door with the car,
         *      switching it will make him loose the car
         * else if he hasn't chosen the door with the car,
         *      switching it will make him win the brand new car
         */
	    return carDoor == choiceDoor ? 0 : 1;
	}
	  
	  
    /**
      * returns an integer based on the fact that - 
      *    the player stays with his/her chosen door
      * 
      * @param carDoor : int --> Door with the car behind it
      * @param choiceDoor : int --> Door that the player has chosen
      * @return : integer ( 1 if the player wins the car, else 0 )
      *
      */
    private static int stay(int carDoor, int choiceDoor){
       /** 
         * If he has chosen the door with the car,
         *      staying with it will make him win the brand new car
         * else if he hasn't chosen the door with the car,
         *      staying with it will make him loose the car
         */
	    return carDoor == choiceDoor ? 1 : 0;
	}
	  
    /**
      * Method to start the game simulation
      * 
      * @param totalCase : int -> Number of times to play the game
      * @return : void
      *
      */
    public void play(int totalCase){
        
        Random random = new Random(); // Random object - to select random door with car and random door that the player gonna choose
        
        int staySuccess = 0; // Counts number of time player wins without switching
        int swapSuccess = 0; // Counts number of time player wins with switching
        
        
        // Simulation :
        for(int i = 1; i <= totalCase ; i++){
        	
        	int carDoor = random.nextInt(3); // Door with a brand new Car behind it
        	int choiceDoor = random.nextInt(3); // Door that the player has chosen
        	
        	swapSuccess += swap(carDoor, choiceDoor);
        	staySuccess += stay(carDoor, choiceDoor);
        }
        
        
        double staySuccessRate = (staySuccess * 100.0)/totalCase; // Rate of wins without switching
        
        double swapSuccessRate = (swapSuccess * 100.0)/totalCase; // Rate of wins with switching


        // Printing the Desired Output/Stats
        
        System.out.println("Number of Test Cases : " + totalCase);
        
        System.out.println("Stay : count " + staySuccess + " = " + staySuccessRate + "%");
        
        System.out.println("Switch : count " + swapSuccess + " = " + swapSuccessRate + "%");
        
    }
}


public class TheGameShow {
	public static void main(String[] args) {
        
        Game game = new Game(); // Creating an Game object for the game simulation

        int totalCase = 1000; // Number of times to play the game

        game.play(totalCase); // Starting the simulation 
    }
}
