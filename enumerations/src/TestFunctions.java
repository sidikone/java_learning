import java.util.Arrays;
import java.lang.Enum;

public class TestFunctions {

    private enum Volume {faible, moyen, fort};

    public TestFunctions(){
    }


    public void DisplayTab(){
        for (Volume x:Volume.values()){
            System.out.print(x);
            System.out.print("\t");
        }

    }
    
}
