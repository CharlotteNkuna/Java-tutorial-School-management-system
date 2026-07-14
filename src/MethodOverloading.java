public class MethodOverloading {
    //method
    int add(int a, int b){

        return a + b;

    }

    int add(int a, int b, int c){

        return a + b + c;

    }
    public static void main(String[] args) {

        MethodOverloading calculate = new MethodOverloading();

        System.out.println(calculate.add(5,3));
        System.out.println(calculate.add(5,3,2));

//        int a = 2;
//        int b = 3;
//        int c = 10;
//        System.out.println(calculate.add(a, b));
//        System.out.println(calculate.add(a, b, c));
    }
}
