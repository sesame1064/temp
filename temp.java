import java.util.Scanner;

public class temp {

  public static void main(String[] args){
    Scanner in = new Scanner(System.in);

    String scale;
    String convert;
    int temp;
    double newTemp;
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
    
    if(scale = "F" || scale = 'f') {
        if(convert = "C"){
            newTemp = (temp - 32) * (5/9);
        }else if(convert = "K"){
            newTemp = ((temp -32)*(5/9)) + 273.15; 
        }    
        }else if("C"){
            if(convert = "F"){
                newTemp = (temp *(9/5)) + 32;
            }else{
                newTemp = temp + 273.15
            }
        }

        System.out.print(temp + "equals" + newTemp);
    }

  }

}


