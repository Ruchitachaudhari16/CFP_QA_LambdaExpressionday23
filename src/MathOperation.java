public class MathOperation {
    public static void main(String[] args) {
        /* UC1.1 Develop Math Operation App to perform Math Functions Addition,
Subtraction and Division - Use Lambda Expression to perform Math Operation*/

        IMathFunction addition = (a, b) -> (a + b);
        IMathFunction subtraction =(a,b) -> (a - b);
        IMathFunction multiply = (a, b) -> (a * b);
        IMathFunction divide = (a, b) -> (a / b);
        //Divide is lamba expression that takes  a,b (as parametres) & returns a/b;
//UC1.1:- Add and multiply using lambda expression
        System.out.println("Addition is" + addition.calculate(100, 200));
        System.out.println("division  is:" + divide.calculate(200, 5));
        System.out.println("Mutliplication  is:" + multiply.calculate(10,20));
        System.out.println("Subtraction is:" +subtraction.calculate(1000,500));


        //UC.1.2:-Passig lambda expression as a function to print result using static function
        IMathFunction.printResult(100, 200, "Addition", addition);
        //IMathFunction.printResult(220,100,"Subtraction",subtract);
        IMathFunction.printResult(500, 200, "Division",divide);
        IMathFunction.printResult(100, 200, "Multiply",multiply);

    }
}


