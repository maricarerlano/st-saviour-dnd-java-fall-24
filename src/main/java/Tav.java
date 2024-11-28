import java.util.Random;

public class Tav {
    public String name;
    public String role;

    public int strength;
    public int stamina;
    public int stealth;
    public int survival;
    public int combat;
    public int intelligence;

    public Tav(String name, String role) {
        this.name = name;
        this.role = role;

        int[] stats = new int[]{15, 14, 13, 12, 10, 8};
        shuffle(stats);

        this.strength = stats[0];
        this.stamina = stats[1];
        this.stealth = stats[2];
        this.survival = stats[3];
        this.combat = stats[4];
        this.intelligence = stats[5];
    }

    public void printCharacterSheet() {
        System.out.println("Name:  " + this.name);
        System.out.println("Role:  " + this.role);
        System.out.println("====================");
        System.out.println("Strength:     " + this.strength);
        System.out.println("Stamina:      " + this.stamina);
        System.out.println("Stealth:      " + this.stealth);
        System.out.println("Survival:     " + this.survival);
        System.out.println("Combat:       " + this.combat);
        System.out.println("Intelligence: " + this.intelligence);
        System.out.println("====================");

    }
    
    public int roll(String buff) {

    int d20 = (int)(Math.random() * 20) + 1;
    int result = d20;


    if (buff.equals("a")) {
        int secondRoll = (int)(Math.random() * 20) + 1;
        result = Math.max(d20, secondRoll); 

        Ascii.drawD20(result);
    }
    else if (buff.equals("g")) {
        int d4 = (int)(Math.random() * 4) + 1; 
        result = d20 + d4;
        Ascii.drawD20(d20); 
        Ascii.drawD4(d4);    
    }
    else {
        result = d20;
        Ascii.drawD20(result);
    }

 
    if (d20 == 20) {
        System.out.println("CRITICAL SUCCESS!");
    } else if (result == 1) {
        System.out.println("CRITICAL FAILURE!");
    }

    return result;
}
   

    // TODO - create Tav class here!

    // https://en.wikipedia.org/wiki/Fisher%E2%80%93Yates_shuffle
    private void shuffle(int[] array) {
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            
            // Swap elements
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
    }
    
}
