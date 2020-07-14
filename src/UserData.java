import java.util.Scanner;

public class UserData {
    BaseUser user = new BaseUser();
    Scanner scan = new Scanner(System.in);

    public void intro(){
        System.out.println("Let's calculate your body mass index.");
        System.out.println("We need some information about you.");
    }
    public void UserName(){
        System.out.println("What is your name?");
        user.setFirstName(scan.nextLine());
        System.out.println("Your name is: " + user.getFirstName() + ".");
        System.out.println("Your last name is: ");
        user.setLastName(scan.nextLine());
    }
    public void UserAge(){
        System.out.println("Okay, now we need more information about your age, height and weight.");
        System.out.println("Your age is: ");
        user.setAge(scan.nextInt());
    }
    public void WeightAndHeight(){
        System.out.println("Your height is: ");
        user.setHeight(scan.nextInt());
        System.out.println("Your weight is: ");
        user.setWeight(scan.nextInt());
    }
    public void ConfirmForm(){
        System.out.println("Please confirm your information:");
        System.out.println("\nName: " + user.getFirstName() + "\nSurname: " + user.getLastName() + "\nAge: "
                + user.getAge() + "\nWeight: " + user.getWeight() + "\nHeight: " + user.getHeight() + ".");
        System.out.println("\nPress 'Y' if looks good and 'N' if something wrong: ");
        String answer = scan.nextLine();
        answer.toLowerCase();

        if(answer == "n"){
            UserAge();
            WeightAndHeight();
        }else{
            System.out.println("");
        }
    }
    public void SummaryResult(){

        var ind = user.getWeight() / (user.getHeight() / 100 * user.getHeight() / 100);
        user.setIndex(ind);

        boolean isLow = user.getIndex() <= 18.5;
        boolean isNormal = user.getIndex() > 18.5 && user.getIndex() <= 25;
        boolean isHy = user.getIndex() > 25 && user.getIndex() <= 30;

        if(isLow){
            System.out.println("Your BMI index is: " + user.getIndex() + ". Underweight.");
        }
        if(isNormal){
            System.out.println("Your BMI index is: " + user.getIndex() + ". Normal weight.");
        }
        if(isHy){
            System.out.println("Your BMI index is: " + user.getIndex() + ". Overweight.");
        }
        else{
            System.out.println("Your BMI index is: " + user.getIndex() + ". Obese.");
        }
    }

}
