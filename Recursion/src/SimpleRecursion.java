
class MyExample{

    public void print(int n){
        if(n>0){
            print(n-1);
            System.out.println("Invoking recursion :- "+n);
        }
    }
}
public class SimpleRecursion {
    //Understanding recursion
    public static void main(String[] args){
        MyExample ex = new MyExample();
        ex.print(5);
    }
}
