package Oct.ex_14102024_Abstraction;

// GrandBaseClass -> BaseClass -> Chrome,Firefox testcase

abstract  class GrandBaseClass {
    // take screenshot
    abstract void takeScreenshot();

    // void takeScreenshot(){
    //     System.out.println("Do?")
    // }
    // it will use when it will remove from baseclass

    void NoBodyKnowsWhereIamPresent(){
        System.out.println("Do?");
    }
}
