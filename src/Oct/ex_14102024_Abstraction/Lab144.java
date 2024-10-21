package Oct.ex_14102024_Abstraction;

public class Lab144 {
    public static void main(String[] args) {

        CHROMETC c = new CHROMETC();
        c.openBrowser("Chrome");
        c.closeBrowser("Chrome");
        // Abstraction
        c.takeScreenshot();// yoy don't know where this is present if yoy give only code.
        c.NoBodyKnowsWhereIamPresent();

        FIREFOXTC firefoxtc = new FIREFOXTC();
        firefoxtc.openBrowser("Firefox");
        firefoxtc.closeBrowser("Firefox");
    }
}
