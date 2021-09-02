import org.omg.PortableInterceptor.ServerRequestInfo;

abstract class Parent{
    private String title;
    private String author;

    Parent(String title,String author){
        this.title = title;
        this.author = author;
    }
    public abstract void display();
    @Override
    public String toString(){
        return String.format("Title: %s\nAuthor: %s\n",title,author);
    }
    public String getTitle(){
        return title;
    }
}

class Child extends Parent{

    int price;
    Child(String title, String author,int price) {
        super(title, author);
        this.price = price;
    }

    @Override
    public void display() {
        System.out.print(super.toString());
        //System.out.print();
        System.out.print("Price: "+price);
    }
}
public class Day13 {

    public static void main(String[] args){
        Child ch = new Child("Timepass","Anonymous",30);
        ch.display();
    }
}
