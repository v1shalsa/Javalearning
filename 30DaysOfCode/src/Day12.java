

class Person1{
    String firstName;
    String lastName;
    int id;
    Person1(String firstName,String lastName,int id){
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public void printPerson(){
        this.toString();
    }

    @Override
    public String toString() {
        return String.format("Name: %s, %s\nID: %s",lastName,firstName,id);
    }
}

public class Day12 {

    int[] arr = new int[5];

}
