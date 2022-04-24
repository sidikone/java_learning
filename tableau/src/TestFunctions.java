import java.util.Arrays;

public class TestFunctions {

    private int [] tab_1;
    private Integer [] tab_2;
    private double [] tab_3;

    public TestFunctions(){
        // double [] td = {4.5, 8.0, -1.2};
        double [] td2 = new double [] {4.5, 8.0, -1.2};

        tab_3 = Arrays.copyOf(td2, 3);
    }

    public void SetTab_1(int var){
        this.tab_1 = new int [var];
    }

    public void SetTab_2(int var){
        this.tab_2 = new Integer [var];
    }

    public void RangeTab1(){
        for (var i=0; i<this.tab_1.length; i++){
            this.tab_1[i] = i;
        }
    }

    public void RangeTab2(){
        for (var i=0; i<this.tab_2.length; i++){
            this.tab_2[i] = i;
        }
    }

    public void DisplayTab1(){
        for (var x:this.tab_1){
            System.out.print(x);
            System.out.print("\t");
        }
        System.out.println();
    }

    public void DisplayTab2(){
        for (Integer x:this.tab_1){
            System.out.print(x);
            System.out.print("\t");
        }
        System.out.println();

    }

    public void DisplayTab(){
        for (double x:this.tab_3){
            System.out.print(x);
            System.out.print("\t");
        }

    }
    
}
