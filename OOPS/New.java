
public class New{

    public static void main(String args[]){

        Beer b = new Beer();
        b.eatMeats();
        b.eatPlants();

    }
}

interface Hervivore{

    void eatPlants();

}


interface Carnivore{

    void eatMeats();

}

class Beer implements Hervivore, Carnivore {
    public void eatPlants(){
        System.out.println("Eats plants ");

    }


    public void eatMeats(){
        System.out.println("Eats meats only");
    }
}