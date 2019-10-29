import java.util.Scanner;

public class temp {

  public static void main(String[] args){
    Scanner in = new Scanner(System.in);

    String scale;
    String convert;
    int temp;
    do{
        System.out.print("Enter an origin scale: ");
        scale = in.nextLine();
    
            if(scale == "F" || scale == "f" || scale == "C" || scale == "c"){
                
                do{
                    System.out.print("Enter a destination: ");
                    convert = in.nextLine();
                }while(scale == "F" || scale == "f" || scale == "C" || scale == "c");

                System.out.print("Enter a temperature: ");
                temp = in.nextInt();
            }
    }while(scale != "F" || scale != "f"|| scale != "C" || scale != "c");
    
    if(scale = "F") {
        if(convert = "C"){
            
        }
    }

  }

}


