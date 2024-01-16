import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class NumberPlayList {
//UC.1.3 create a number playlist and iterate and print each element
public static  void main(String[] args)
{
    //Create Sample Collection
    List<Integer> myNumberList=new ArrayList<Integer>();
    for(int i=0;i<5;i++) myNumberList.add(i);

    //Method transversing using iterator.
    Iterator<Integer> it=myNumberList.iterator();
    while(it.hasNext())
    {
        Integer i= it.next();
        System.out.println("Mth1: Iterator Value::"+i);
    }

    class MyConsumer implements Consumer<Integer> //Consumer interface it will accept single and return noresult
    {
        public  void accept(Integer integer)
        {
            System.out.println("Mth2 :Consumer Implementation Value::"+integer);
        }
    }
    MyConsumer action=new MyConsumer();
    myNumberList.forEach(action);

    //Method 3:-Transervsing with anonymous consumer interface implementation
myNumberList.forEach(new Consumer<Integer>()
    {
        public void accept(Integer t)
        {
            System.out.println("Mth3:foreach anonymous class value::"+t);
        }
    });
//Method 4: Explicit Lambda function
    Consumer<Integer>myListAction=n->
    {
        System.out.println("Mth4:foreach lambda impl Value ::"+n);
    };
    myNumberList.forEach(myListAction);

//Method 5:Implicit Lambda function
   myNumberList.forEach(n->{
       System.out.println("Mth5:foreach lambda impl value:"+n);
   });
   //UC1.4:- Method 6:-Implicit Lambda function to print double value
    Function<Integer,Double>toDoubleFunction=Integer::doubleValue; //:: lambda with a method refernce
    myNumberList.forEach(n->{
        System.out.println("Mth5: foreach lambda double value::"+toDoubleFunction.apply(n));
            });
    /* Another way to write method in a lambda experssion
   Function<Integer,Double> toDoubleFunction =n->n.dpubleValue; //Remaining code as it is
   */

    //UC1.5:-Iterate through list of number and print only if it is even.
    Predicate<Integer>isEvenFunction=n->n>0 && n%2==0;
    myNumberList.forEach(n->
    {
        System.out.println("Mth6: foreach value of:"+n+ "Check for even:"+isEvenFunction.test(n));;
    });
}
}

