package Oct.ex_09102024_Inheritance.Concept_HasA_Aggregation_HasA;

public class Car {
    // Car Has-A Engine , Tyre
    public void startCar(){
        new Engine().start();
        new Tyre().rolling();
    }
}
