public class VirtualPet {

    //instance variables
    private String name;
    private int nutrition;
    private int happiness;
    private int energy;



    //constructor
    public VirtualPet (String name, int nutrition, int happiness, int energy) {
        this.nutrition = nutrition;
        this.happiness = happiness;
        this.energy = energy;
        this.name = name;


    }


    //increase or decreasing needs
    public void alterNutrition(int n){ nutrition += n;}

    public void alterHappiness(int e){
        happiness += e;
    }

    public void alterEnergy(int f){
        energy += f;
    }


    //getters
    public String getName() {return name;}
    public int getHappiness() {return happiness;}
    public int getEnergy() {return energy;}
    public int getNutrition(){
        return nutrition;
    }



    //setters
    public void setBoredom(int boredom) {this.happiness = happiness;}
    public void setHunger(int hunger) {this.nutrition = nutrition;}
    public void setTiredness(int tiredness){this.energy = energy;}


    //ticker method
    public void tick() {
        nutrition += -3;
        happiness += -3;
        energy += -3;
    }
}




