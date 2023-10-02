
package Common;

import java.util.Scanner;


public class Validation {
    public String getString(String prompt){
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        String s =sc.nextLine();
        while(s.isEmpty()){
            System.out.print("Enter again(Can not blank): ");
            s = sc.nextLine();
        }
        return s;
    }
    
    public float getFloat(String prompt){
        Scanner sc = new Scanner(System.in);
        float i = 0;
        boolean isValid = false;
        while (isValid == false){
            System.out.print(prompt);
            if (sc.hasNextInt()){
                i = sc.nextFloat();
                isValid = true;
        } 
        else{
            System.out.println("Error! Invalid integer value. Try again.");
            }
            sc.nextLine();
        }
            return i;
    }
    public float getFloat(String prompt,int min, int max){
       float i = 0;
       boolean isValid = false;
       while (isValid == false){
           i= getFloat(prompt);
           if (i<min)
               System.out.println("Error! Number must be greater than " + min + ".");
           else if(i> max){
               System.out.println("Error! Number must be less than " + max + ".");
           }
           else 
               isValid = true;
       }
          return i;
    }
    
    public int getInt(String prompt){
        Scanner sc = new Scanner(System.in);
        int i = 0;
        boolean isValid = false;
        while (isValid == false){
            System.out.print(prompt);
            if (sc.hasNextInt()){
                i = sc.nextInt();
                isValid = true;
        } 
        else{
            System.out.println("Error! Invalid integer value. Try again.");
            }
            sc.nextLine();
        }
            return i;
    }
    public int getInt(String prompt,int min, int max){
       int i = 0;
       boolean isValid = false;
       while (isValid == false){
           i= getInt(prompt);
           if (i<min)
               System.out.println("Error! Number must be greater than " + min + ".");
           else if(i> max){
               System.out.println("Error! Number must be less than " + max + ".");
           }
           else 
               isValid = true;
       }
          return i;
    }
}
