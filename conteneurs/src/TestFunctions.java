public class TestFunctions {

    private int var_1;
    private Integer var_2;

    public TestFunctions(){
    }

    public void SetVar_1(int var){
        this.var_1 = var;
    }

    public void SetVar_2(String var){
        this.var_2 = Integer.valueOf(var);
    }

    public int GetVar1(){
        return this.var_1;
    }

    public Integer GetVar2(){
        return this.var_2+1;
    }
    
}
