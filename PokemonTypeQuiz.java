import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class PokemonTypeQuiz {
    public static void main(String[] args) {
        // Create lists of Pokemon and their types
        ArrayList<String> pokemonNames = new ArrayList<>();
        ArrayList<String> pokemonTypes = new ArrayList<>();
        
        // Add some Pokemon data
        pokemonNames.add("Pikachu");
        pokemonTypes.add("Electric");
        
        pokemonNames.add("Bulbasaur");
        pokemonTypes.add("Grass");
        
        pokemonNames.add("Charmander");
        pokemonTypes.add("Fire");
        
        pokemonNames.add("Squirtle");
        pokemonTypes.add("Water");
        
        pokemonNames.add("Mewtwo");
        pokemonTypes.add("Psychic");
        
        pokemonNames.add("Gengar");
        pokemonTypes.add("Ghost");
        
        pokemonNames.add("Gyarados");
        pokemonTypes.add("Water");
        
        pokemonNames.add("Jigglypuff");
        pokemonTypes.add("Fairy");
        
        pokemonNames.add("Machamp");
        pokemonTypes.add("Fighting");
        
        pokemonNames.add("Snorlax");
        pokemonTypes.add("Normal");
        
        // Get user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Pokemon Type Quiz!");
        System.out.print("How many questions would you like? ");
        int numQuestions = scanner.nextInt();
        scanner.nextLine(); // Clear buffer
        
        // Call our procedure with parameters
        int score = playPokemonQuiz(pokemonNames, pokemonTypes, numQuestions);
        
        // Output results
        System.out.println("Quiz complete! Your score: " + score + "/" + numQuestions);
        scanner.close();
    }
    
    // Our procedure with parameters
    public static int playPokemonQuiz(ArrayList<String> pokemon, ArrayList<String> types, int questions) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score = 0;
        
        // Iteration
        for (int i = 0; i < questions; i++) {
            // Randomly select a Pokemon
            int index = random.nextInt(pokemon.size());
            String currentPokemon = pokemon.get(index);
            String correctType = types.get(index);
            
            // Ask the question
            System.out.println("\nQuestion " + (i+1) + ":");
            System.out.println("What type is " + currentPokemon + "?");
            String userGuess = scanner.nextLine();
            
            // Selection (check if answer is correct)
            if (userGuess.equalsIgnoreCase(correctType)) {
                System.out.println("Correct! " + currentPokemon + " is a " + correctType + " type.");
                score++;
            } else {
                System.out.println("Incorrect. " + currentPokemon + " is a " + correctType + " type.");
            }
        }
        
        return score;
    }
}
