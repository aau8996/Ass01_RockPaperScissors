import java.sql.SQLOutput;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in);
        String yNResponse = "";
        String playerA = "";
        String playerB = "";
        boolean done = false;
        boolean validA = false;
        boolean validB = false;

        do
        {
            // Code and control logic to play again or quit
            System.out.println("Do you want to play again [Y/N]: ");
            yNResponse = in.nextLine();
            if(yNResponse.equalsIgnoreCase("N"))
            {
                done = true;
            }
            else if (!yNResponse.equalsIgnoreCase("Y"))
            {
                System.out.println("Invalid Response;");
            }
            else if(yNResponse.equalsIgnoreCase("Y"))
            {
                do
                {
                    System.out.println("Player A, choose your move [R/P/S]: ");
                    playerA = in.nextLine();
                    if (playerA.equalsIgnoreCase("R") || playerA.equalsIgnoreCase("P") || playerA.equalsIgnoreCase("S"))
                    {
                        validA = true;
                    }
                    else
                    {
                        System.out.println("Invalid Choice, Try Again");
                    }
                }while(!validA);

                do
                {
                    System.out.println("Player B, choose your move [R/P/S]: ");
                    playerB = in.nextLine();
                    if (playerB.equalsIgnoreCase("R") || playerB.equalsIgnoreCase("P") || playerB.equalsIgnoreCase("S"))
                    {
                        validB = true;
                    }
                    else
                {
                    System.out.println("Invalid Choice, Try Again");
                }
                }while(!validB);

                if (playerA.equalsIgnoreCase("R"))
                {
                    if(playerB.equalsIgnoreCase("R"))
                    {
                        System.out.println("R x R; It's a tie!");
                    }
                    else if (playerB.equalsIgnoreCase("P"))
                    {
                        System.out.println("R x P; Paper beats Rock, Player B wins!");
                    }
                    else if (playerB.equalsIgnoreCase("S"))
                    {
                        System.out.println("R x S; Rock beats Scissors, Player A wins!");
                    }
                }
                else if (playerA.equalsIgnoreCase("P"))
                {
                    if(playerB.equalsIgnoreCase("R"))
                    {
                        System.out.println("P x R; Paper beats Rock, Player A wins!");
                    }
                    else if (playerB.equalsIgnoreCase("P"))
                    {
                        System.out.println("P x P; It's a tie!");
                    }
                    else if (playerB.equalsIgnoreCase("S"))
                    {
                        System.out.println("P x S; Scissors beats Paper, Player B wins!");
                    }
                }
                else if (playerA.equalsIgnoreCase("S"))
                {
                    if(playerB.equalsIgnoreCase("R"))
                    {
                        System.out.println("S x R; Rock beats Scissors, Player B wins!");
                    }
                    else if (playerB.equalsIgnoreCase("P"))
                    {
                        System.out.println("S x P; Scissors beats Paper, Player A wins!");
                    }
                    else if (playerB.equalsIgnoreCase("S"))
                    {
                        System.out.println("S x S; It's a tie!");
                    }
                }
            }
        } while (!done);
    }
}