import java.util.Scanner;

public class Ozlympic {
	static Scanner input=new Scanner(System.in);
	public static void main(String[] args) {
		String Input;
		do{
			printMenu();
			Input=input.nextLine();
			switch(Input){
			case "1": selectGame();
				break;
			case "2": predict();
				break;
			case "3":
				break;
			case "4":
				break;
			case "5":
				break;
			case "6":
				System.out.print("Exit Game!");
				break;
			default:
				System.out.println("Invalid number!Please input number from 1 to 6!");
			}
		}while(Input!="6");
		input.close();
		}
	
	private static void printMenu() 
	{
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("    Ozlympic	Game");
		System.out.println("=========================");
	    System.out.println(" 1.Select a game to run");
		System.out.println(" 2.Predict the winner of the game");
		System.out.println(" 3.Start the game ");
		System.out.println(" 4.Display the final results of all games");
		System.out.println(" 5.Display the points of all athlets");
		System.out.println(" 6.exit");
		System.out.println(" Enter an option: ");
	}
	
	private static void selectGame() 
	{
		String Option;
		do{
			printgameMenu();
			Option = input.nextLine();
			switch(Option){
			case "1": 
				System.out.print("Please predict before start the game!");
				break;
			
			case "2":
				break;
			case "3":
				break;
			case "4":
				printMenu();
				break;
			case "5":
				System.out.print("Exit Game!");
				break;
			default:
				System.out.println("Invaild number!Please input number from 1 to 5!");
		}
			}while(Option!="5");
			input.close();
		}
	
	
	private static void printgameMenu() 
	{
		System.out.println("");
		System.out.println("    Ozlympic	Game");
		System.out.println("=========================");
	    System.out.println(" 1.Swimming");
		System.out.println(" 2.Cycling");
		System.out.println(" 3.Running");
		System.out.println(" 4.Return back to main menu");
		System.out.println(" 5.Exit Game");
		System.out.println(" Select a game: ");
	}
	
	public static void predict(){
		int choose;
		do{
			printPredict();
			choose=input.nextInt();
			switch(choose){
			case 1: 
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				printMenu();
			default:
				System.out.println("Invaild number!Please input number from 1 to 4!");
		}
		}
		while(choose!=0);
		}
	

	public static void printPredict() 
	{
		System.out.println("    Ozlympic	Game");
		System.out.println("=========================");
	    System.out.println(" 1.Swimming");
		System.out.println(" 2.Cycling");
		System.out.println(" 3.Running");
		System.out.println(" 4.Return back to main menu");
		System.out.println(" Please select a game to predict: ");
	}
	
	}

