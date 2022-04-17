class Main{

    public static void main(String[] args) {
        System.out.println("\n");
        int var = 10;
        TestFunctions test_1 = new TestFunctions();
        test_1.SetVar_1(var);
        test_1.SetVar_2(20.5f);
        System.out.println(test_1.GetVar2());
        System.out.println("\n");
    }
}