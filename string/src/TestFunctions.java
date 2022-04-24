public class TestFunctions {

    private String var_1;
    private StringBuilder var_2;

    public TestFunctions(){

        this.var_1 = "my value can't be change";
    }

    public void SetVar_1(String var){
        this.var_1 = var;
    }

    public void SetVar_2(String var){
        this.var_2 = new StringBuilder(var);
    }

    public void AddWord(String var){
        this.var_2.append(var);

    }

    public String GetVar1(){
        return this.var_1;
    }

    public StringBuilder GetVar2(){
        return this.var_2;
    }
    
}
