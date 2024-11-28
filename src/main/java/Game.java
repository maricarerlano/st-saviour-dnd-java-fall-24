import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Game {
    public static void main(String[] args) {

        // Create Scanner for collecting user input.
        Scanner scanner = new Scanner(System.in);

        

        // Collect character name from user.
        System.out.print("Name: ");
        String name = scanner.nextLine();

        String[] roles = {"Survivor", "Hunter", "Medic", "Scavenger", "Outlaw"};

        System.out.println("Choose your role (Survivor, Hunter, Medic, Scavenger, Outlaw): ");
        String role = scanner.nextLine();

        while (!role.equalsIgnoreCase("Survivor") && !role.equalsIgnoreCase("Hunter") && !role.equalsIgnoreCase("Medic") && !role.equalsIgnoreCase("Scavenger") && !role.equalsIgnoreCase("Outlaw")) {
            System.out.println("Invalid role. Please choose from the predefined list (Survivor, Hunter, Medic, Scavenger, Outlaw): ");
            role = scanner.nextLine();
        }
        System.out.println("--------------------");



        // TODO Create Tav instance with user input.
        Tav player = new Tav(name, role);
        player.printCharacterSheet();

        Ascii.drawTitle();

        printDramaticText("The world has been ravaged by a deadly fungal outbreak, where " + player.name + " the " + player.role + " must fight off hordes of infected to survive.");

        int successfulEncounters = 0;
        boolean gameOver = false;

        while (successfulEncounters < 3 && !gameOver) {
            int monsterDifficulty = generateMonster();

            System.out.print("Choose a buff for your roll (a for Advantage or g Guidance): ");
            String buff = scanner.nextLine();

            int rollResult = player.roll(buff);

            if (rollResult >= monsterDifficulty) {
                System.out.println("You are able to kill the infected!");
                successfulEncounters++;
            } else {
                printDramaticText("You were brutally killed by the infected..");
                gameOver = true;
            }
            
        }

        if (successfulEncounters == 3) {
            printDramaticText("CONGRATULATIONS! You've survived the horrors and made it through this fight. The world is a little safer... for now...");
        } else {
            System.out.println("GAME OVER");
            printDramaticText("The world has claimed another survivor...");
        }
    }
       
        // TODO Implement generateMonster()
        // TODO Collect buffs from user.
        // TODO Implement roll() method for Tav.
        // TODO Print Critical Success & Critical Failure.
        // TODO Check for 3 successful monster encounters.
        // TODO Print GAME OVER or winning message. 
        
    

    public static int generateMonster() {
    
        int monsterTypeRoll = (int)(Math.random() * 100) + 1;

        String monsterType = "";
        String monsterEmoji = "";
        int rollRequired = 0;
        String encounterMessage = "";
    
        if (monsterTypeRoll <= 50) {
            monsterType = "Runner";
            monsterEmoji = "🧟";
            rollRequired = 5; 
            encounterMessage = "You hear shuffling, followed by an unnatural breath... a Runner is nearby... ";
        } else if (monsterTypeRoll <= 83) {
            monsterType = "Clicker";
            monsterEmoji = "🦠";
            rollRequired = 9;
            encounterMessage = "A sudden clicking sound pierces the silence. A clicker is moving towards you, rapidly... ";
        } else {
            monsterType = "Bloater";
            monsterEmoji = "💀👹";
            rollRequired = 14;
            encounterMessage = "The ground shakes as you hear slow, heavy footsteps... a Bloater is approaching... ";
        }
    
        System.out.println("==================================================================================================");
        System.out.println("");
        printDramaticText(monsterEmoji + encounterMessage + monsterEmoji);
        System.out.println("Roll Required to beat " + monsterType + ": " + rollRequired);
        System.out.println("");
        System.out.println("==================================================================================================");

        return rollRequired;
    }
    

    public static void printDramaticText(String text) {
        // Delay milliseconds
        int delay = 100;

        for (char c : text.toCharArray()) {
            System.out.print(c);
            try {
                TimeUnit.MILLISECONDS.sleep(delay);
            } catch (InterruptedException e) {
                System.err.println("Interrupted: " + e.getMessage());
                Thread.currentThread().interrupt();
            }
        }
        System.out.println();
    }
}
