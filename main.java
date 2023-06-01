import java.util.Random;
import java.util.Scanner;

class frame {
    protected int randomNo ;
    Random rand = new Random();
    int guess=0 ,score =0;
    Scanner scan =new Scanner(System.in);

    // Fuction for easy level 
    void Easy(){
        randomNo =rand.nextInt(5)+1;
        System.out.println("You will be given 3 Attempts to Choose any one integer from 1 to 5");
        try {
            for(int i=3;i>0;i--){
                System.out.print("\tAttempt Left: "+i+"\nEnter: ");
                guess =scan.nextInt();
                if(guess == randomNo){
                    score=(i*30)+10;
                    break;
                }  
            }
            System.out.println("\nThe correct number was :"+randomNo+"\nYOUR SCORE: "+score+"/100");
            
        } catch (Exception e) {
            System.out.println(" Exited : Need to enter only numbers in defined");
        }
           
    }

    // Fuction for moderate level 
    void Moderate(){
        randomNo =rand.nextInt(10)+1;
        System.out.println(randomNo);
        System.out.println("You will be given 5 Attempts to Choose from 1 to 10");
        try {
            for(int i=5;i>0;i--){
                System.out.print("\tAttempt Left: "+i+"\nEnter: ");
                guess =scan.nextInt();
                if(guess == randomNo){
                    score=(i*20);
                    break;
                }  
            }
            System.out.println("\\nThe correct number was :"+randomNo+"\nYOUR SCORE: "+score+"/100"); 
            
        } catch (Exception e) {
            System.out.println(" Exited : Need to enter only numbers in defined");
        }
          
    }
    // Fuction for hard level
    void Hard(){
        randomNo =rand.nextInt(20)+1;
        System.out.println("You will be given 15 Attempts to Choose from 1 to 20");
        try {
            for(int i=20;i>0;i--){
                System.out.print("\tAttempt Left: "+i+"\nEnter: ");
                guess =scan.nextInt();
                if(guess == randomNo){
                    score=(i*5);
                    break;
                }  
            }
            System.out.println("\nThe correct number was :"+randomNo+"\nYOUR SCORE: "+score+"/100");
            
        } catch (Exception e) {
            System.out.println(" Exited : Need to enter only numbers in defined");
        }  
    }



}
public class game{
    public static void main(String args[]){
        int difficulty=-1;
        int quitt;
        Scanner scan =new Scanner(System.in);
        System.out.println("\n\n\t WELCOME TO GUESS GAME");
        do{
            do{
                System.out.println("\n\nChoose difficulty Level \nEnter 1 for Easy \nEnter 2 for Moderate \nEnter 3 for Hard");
                difficulty=scan.nextInt();
            }while((difficulty !=1) && (difficulty !=2)  && (difficulty !=3));
        
            frame fram =new frame();
            switch (difficulty){
                case 1:
                    fram.Easy();
                    break;
                case 2:
                    fram.Moderate();
                    break;
                case 3:
                    fram.Hard();
                    break;
            }
            System.out.println("Just Enter 0 to Continue the Game or Any number to exit");
            quitt =scan.nextInt();
        
        }while(quitt==0);
        scan.close();

      
    }
}
