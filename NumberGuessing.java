import java.util.*;
public class NumberGuessing
{
    public static void guessingNumber(){
        Scanner sc = new Scanner(System.in);
        //Generate a Number
        int min = 1, max = 100;
        Random random = new Random();
        int num = min + random.nextInt(max);
        System.out.println("Enter trials number");
        int trial = sc.nextInt();
        int guess_num, i;
        System.out.println("A number is choosen between 1 to 100." + "\n" + "Guess the number within " + trial + " trials");
        for(i = 0; i < trial; i++){
            System.out.println("Guess a number");
            guess_num = sc.nextInt();
            
            if(num == guess_num){
                System.out.println("Congrates! You guessed the number");
                break;
            }else if(num > guess_num){
                System.out.println("The number is greater than " + guess_num);
            }else if(num < guess_num){
                System.out.println("The number is smaller than " + guess_num);
            }
        }
        if(i == trial){
            System.out.println("You have finished your trials");
            System.out.println("The number was " + num);
        }
    }
	public static void main(String[] args) {
		guessingNumber();
	}
}
