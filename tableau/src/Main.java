class Main{

    public static void main(String[] args) {
        System.out.println("\n");
        // int var = 10;
        TestFunctions test_1 = new TestFunctions();
        test_1.SetTab_1(10);
        test_1.SetTab_2(5);

        test_1.RangeTab1();
        test_1.RangeTab2();

        test_1.DisplayTab1();
        test_1.DisplayTab2();
        test_1.DisplayTab();

        System.out.println("\n");
    }
}