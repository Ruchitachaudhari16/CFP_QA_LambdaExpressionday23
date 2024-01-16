import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Consumer;

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
        System.out.println("Mat1: Iterator Value::"+i);
    }

    class MyConsumer implements Consumer<Integer> //Consumer interface it will accept single and return noresult
    {
        public  void accept(Integer integer)
        {
            System.out.println("Math2 :Consumer Implementation Value::"+integer);
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
}
}

