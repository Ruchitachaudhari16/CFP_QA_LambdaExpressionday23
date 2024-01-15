public class MathOperation implements IMathFunction{
    public static  void main(String[] args)
    {
        /* UC1.1 Develop Math Operation App to perform Math Functions Addition,
Subtraction and Division - Use Lambda Expression to perform Math Operation*/

        IMathFuction addition=(a,b)-> (a+b);
        IMathFuction multiply =(a,b)-> (a*b);
        IMathFuction divide=(a,b)->(a/b);
            //Divide is lamba expression that takes  a,b (as parametres) & returns a/b;

            System.out.println("Addition is"+addition.calculate(100,200));
            System.out.println("division  is:"+divide.calculate(200,5));
            System.out.println("Mutliplication  is:"+multiply.calculate(10,20));
        }

    }


