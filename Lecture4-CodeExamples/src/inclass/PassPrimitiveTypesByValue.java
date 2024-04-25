package inclass;

public class PassPrimitiveTypesByValue {
    public static void main(String[] args) {

        int x = 3;
        // invoke passMethod() with
        // x as argument
        int p = addTenToParam(x);
        // print x to see if its
        // value has changed
        System.out.println("After invoking passMethod, x = " + x);
        System.out.println("After invoking passMethod, p = " + p);
    }

    public static int addTenToParam(int p) {
        int number1 = 15;
        int num2 = 11;
        int num3 = num2 + number1;
        return (p + num3);
    }
}
