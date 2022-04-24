class Main{

    public static void main(String[] args) {
        System.out.println("\n");
        // int var = 10;
        TestFunctions test_1 = new TestFunctions();
        test_1.SetVar_1("I try to change");
        test_1.SetVar_2("With StringBuilder");
        System.out.println(test_1.GetVar1());

        test_1.AddWord(" I try to make it");
        System.out.println(test_1.GetVar2());

        System.out.println("\n");
    }
}