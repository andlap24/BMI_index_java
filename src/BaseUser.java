public class BaseUser {
    private String firstName;
    private String lastName;
    private int age;
    private int height;
    private int weight;
    private double index;

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public int getHeight(){
        return height;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    public int getWeight(){
        return weight;
    }
    public void setIndex(double index){
        this.index = index;
    }
    public double getIndex(){
        return index;
    }
}
