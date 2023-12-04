package dndcharcreator;

import java.util.Random;

public class options {
    
    
    private String[] races = {"Human", "Elf", "Dwarf", "Halfling", "Orc"};
    private String[] classes = {"Barbarian", "Bard", "Cleric", "Druid", "Wizard"};
    private String[] backgrounds = {"Acolyte", "Sage", "Criminal", "Hermit", "Noble"};

    
        public String getRandomRace() {
         Random random = new Random();
         int index = random.nextInt(races.length);
         return races[index];
    }

        public String getRandomClass() {
         Random random = new Random();
         int index = random.nextInt(classes.length);
         return classes[index];
    }
        public String getRandomBackground() {
         Random random = new Random();
         int index = random.nextInt(backgrounds.length);
         return backgrounds[index];
    }


        public void createCharacter() {
         String characterRace = getRandomRace();
         String characterClass = getRandomClass();
         String characterBackground = getRandomBackground();
         

         System.out.println("Your character's race is: " + characterRace);
         System.out.println("Your character's class is: " + characterClass);
         System.out.println("Your character's background is: " + characterBackground);
         
    }
}



