
@FunctionalInterface
    public interface IMathFunction {
        //FunctionalInterface is interface having only single method declaration.
        int calculate(int a,int b);  //Method declaration
    static void printResult(int a,int b,String  function,IMathFunction fobj)
    {
        System.out.println("Result of"+function+" is "+fobj.calculate(a, b));
    }
    }
    //Passing lambda expression as function parameter to print result using static function.






