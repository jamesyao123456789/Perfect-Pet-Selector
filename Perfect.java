import java.util.Scanner;

public class Perfect{

    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter your name: "); 
        String name = myObj.nextLine().toLowerCase();

    if ("abcdefghijklmnopqrstuvwxyz".indexOf(name.substring(0, 1)) == -1) {
    System.out.println("Invalid name");            //this is a letter
}

    System.out.println("Enter your favorite color (Either red, blue or green): ");  
    String color = myObj.nextLine();
    color = color.toLowerCase();

    while (!color.equals("red") && !color.equals("blue") && !color.equals("green")) {
        System.out.println("Invalid color. Try again: ");
        color = myObj.nextLine().toLowerCase();
}

    System.out.println("Enter your favorite season (winter, spring, summer, fall): "); 
    String season = myObj.nextLine();
    season = season.toLowerCase();

    while (!season.equals("winter") && !season.equals("spring") && !season.equals("summer") && !season.equals("fall")) {
    System.out.println("Invalid season. Try again:");
    season = myObj.nextLine().toLowerCase();
}


    if (color.equals("blue") && season.equals("fall")) {
        System.out.println( "Your Animal is a Alligator");
    }
    else if (season.equals("spring") && color.equals("blue")) {
        System.out.println( "Your Animal is a Ostrich");
    }
    else if (("aeiou".indexOf(name.substring(0,1)) == -1) && season.equals("winter") && color.equals("green") ) {
        System.out.println( "Your Animal is a Giraffe");
    }
    else if (!season.equals ("fall") && color.equals("green") ){
        System.out.println( "Your Animal is a Dog");
    }
    else if ((color.equals("red")) && ("aeiou".indexOf(name.substring(0,1)) == -1)){
        System.out.println("Your Animal is a Panda");
    }    
    else if (color.equals("red")){
        System.out.println("Your Animal is a Procupine");
    }
    else if (season.equals("summer")) {
        System.out.println("Your Animal is a Ponie ");
    }
    else if (("aeiou".indexOf(name.substring(0,1)) == -1) && (color.equals("blue")) && (!season.equals("summer")) && (!season.equals("fall"))) {
        System.out.println("Your Animal is a Axolotl");
    }
    else {
        System.out.println("Your Animal is a Pet Rock");
    }

    
    }
}
