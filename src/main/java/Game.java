import java.util.concurrent.TimeUnit;

public class Game {
    public static void main(String[] args) {

        // Create Scanner for collecting user input.
        Scanner scanner = new Scanner(System.in);

        // Collect character name from user.
        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.println("Role: ");
        String role = scanner.nextLine();

        Tav player = new Tav(name, role);
        player.printCharacterSheet();

        printDramaticText(player.name + " the " + player.role + " ");

        // TODO Create Tav instance with user input.
        // TODO Implement generateMonster()
        // TODO Collect buffs from user.
        // TODO Implement roll() method for Tav.
        // TODO Print Critical Success & Critical Failure.
        // TODO Check for 3 successful monster encounters.
        // TODO Print GAME OVER or winning message. 
        
    }

    public static int generateMonster() {
        int monsterType = (int)(math.random() + (100 - 1 + 1) + 1);

        if (monsterType <= 50) {
            System.out.println("You encounter a Stalker!");
            return 10;
        } else if (monsterType <= 83) {
            System.out.println("You encounter a Clicker!");
            return 15;
        } else {
            System.out.println("You encounter a Bloater!");
            return 20;
        }
    }

    public Sring collectBuff(){
        String buff = scanner.nextLine();
        r buff;

    }

    public int roll(String buff){
        int roll = (int)(math.random() + (20 -1 + 1) + 1);

       if (buff.equals(advantage))
        roll1 = (int)(math.random() + (20 -1 + 1) + 1);


        if (roll == 20){
            System.out.println("CRITICAL SUCCESS");
        } else if (roll == 1){
            System.out.println("CRITICAL FAILURE");
        }
        
    }

    public static void printDramaticText(String text) {
        // Delay in milliseconds
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
