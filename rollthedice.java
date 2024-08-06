import java.util.*;//Random class belong to util package 
class Dice{
    public static void main(String[]
    args) 
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Roll The Dice Game");
        
        
        Random r=new Random();//random class is used to generate random number    

            System.out.print("Player 1 Name: ");
            String Player1= sc.next();
    
            System.out.print("Player 2 Name: ");
            String  Player2= sc.next();
    
            System.out.println(" Dice is rolled");
            int num1= r.nextInt(6);// the maximum number in dice is 6
            if(num1>0)
            System.out.println(Player1+" dice score "+num1);
    
            int num2= r.nextInt(6);// the maximum number in dice is 6
            if(num2>0)
            System.out.println(Player2+" dice score :"+num2);

            if(num1>num2)
            System.out.println("Congraluations! "+Player1+" you won the dice game");

            else if(num2>num1)
            System.out.println("Congraluations! "+Player2+" you won the dice game");
    
            else if(num1==num2)
            System.out.println(Player1+" and "+Player2+" have same score dice game");

        sc.close();
    }
     
    }
