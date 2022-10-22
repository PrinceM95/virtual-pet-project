import java.util.Scanner;

public class VirtualPetApp {
    public static void main(String[] args) {

        //user input
            int userInput;
            Scanner input = new Scanner(System.in);



        //pet info and properties
        VirtualPet pet = new VirtualPet("Henry", 50, 50, 50);
        System.out.println(pet.getName());
        System.out.println("Nutrition: " + pet.getNutrition());
        System.out.println("Happiness: " + pet.getHappiness());
        System.out.println("Energy: " + pet.getEnergy());
        System.out.println();

        do {
            System.out.println("What would you like to do with Henry?");
            System.out.println("1. Feed " + pet.getName());
            System.out.println("2. Give " + pet.getName() + " a nap ");
            System.out.println("3. Play with " + pet.getName() + "!");
            System.out.println("4. Nothing. Do you Henry.");
            System.out.println("5. I'm all done here. Good luck Henry! Exit game please.");
            userInput = input.nextInt();
            if (userInput > 5) {
                System.out.println("** Please select a number between 1 and 5. Try again, Henry's waiting: ");
                System.out.println();
                continue;
            }
            if (userInput == 5) {
                System.out.println();
                continue;

            } else if (userInput == 1) {
                if (pet.getNutrition() > 90 || pet.getNutrition() == 100) {
                    System.out.println("~~ Hunger levels are lookin' good! Peak satisfaction! ~~");
                    System.out.println();
                    continue;
                }
                System.out.println("~~ " + pet.getName() + " says thank you for the treat! ~~");
                System.out.println();
                pet.alterNutrition(+13);
                pet.alterHappiness(+8);
                pet.alterEnergy(-1);
                pet.tick();
                System.out.println("Nutrition: " + pet.getNutrition());
                System.out.println("Happiness: " + pet.getHappiness());
                System.out.println("Energy: " + pet.getEnergy());
                System.out.println();


            } else if (userInput == 2) {
                if (pet.getEnergy() > 90 || pet.getEnergy() == 100) {
                    System.out.println("~~ Energy bar looks good. Henry's wide awake! ~~");
                    System.out.println();
                    continue;
                }
                System.out.println("~~ " + pet.getName() + " says thank you for the nap ~~");
                System.out.println();
                pet.alterEnergy(+9);
                pet.alterNutrition(-1);
                pet.alterHappiness(-3);
                System.out.println("Nutrition: " + pet.getNutrition());
                System.out.println("Happiness: " + pet.getHappiness());
                System.out.println("Energy: " + pet.getEnergy());
                System.out.println();

            } else if (userInput == 3) {
                if (pet.getHappiness() > 90 || pet.getHappiness()  == 100) {
                    System.out.println("~~ Henry's in great spirits! ~~");
                    System.out.println();
                    continue;
                }
                System.out.println("~~ " + pet.getName() + " says thank you for taking them out for a run! ~~");
                System.out.println();
                pet.alterEnergy(-6);
                pet.alterHappiness(+9);
                pet.alterNutrition(-3);
                System.out.println("Nutrition: " + pet.getNutrition());
                System.out.println("Happiness: " + pet.getHappiness());
                System.out.println("Energy: " + pet.getEnergy());
                System.out.println();

            }  else if (userInput == 4) {
                System.out.println("~~ " + pet.getName() + " stares at you blankly. ~~");
                System.out.println();
                pet.alterEnergy(-2);
                pet.alterNutrition(+3);
                pet.alterHappiness(-5);
                System.out.println("Nutrition: " + pet.getNutrition());
                System.out.println("Happiness: " + pet.getHappiness());
                System.out.println("Energy: " + pet.getEnergy());
                System.out.println();
            }

        } while (userInput != 5);
                    System.out.println("~~ Henry thanks you for your time. He says bye; In horse. Get me out of here please. ~~");
            }
        }

