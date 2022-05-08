
package javaquizanswer5_29;

import java.util.Scanner;

public class JavaQuizAnswer5_29 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Write year: ");
        int year = input.nextInt();
        
        System.out.print("""
                         Write first day of the year number
                         0(Sunday) 1(Monday)...:  """);
        int first_day = input.nextInt();
        
        
        int number_of_month = 0;
        
        for(int month = 1; month <= 12; month++){
        switch (month) {

                case 1: System.out.print("\t   January\nSun  Mon  Tue  Wed  Thu  Fri  Sat\n");
                    number_of_month = 31;
                    
                    for(int start = 1; start <= (first_day*5)+1 ;start++){ // begining space
                        
                        System.out.print(" ");
                        }
                    
                    int i = 1; // first day number
                    
                    for(; i <= 7 - first_day;i++){ // first row
                        
                        System.out.print(i + "    ");
                    }
                    
                    System.out.println(""); System.out.print(" ");//second row's space
                    
                    for(int count = 1; i <= number_of_month; i++, count++){
                        
                        if (i<9) // one digits between distance
                            System.out.print(i + "    ");
                        
                        else     // two digits between distance
                            System.out.print(i + "   ");
                        
                        if (count %7 == 0)
                            System.out.print("\n");
                    }
                System.out.print("\n\n\n\n");
                    
                    break;
                case 2: System.out.print("\t\tFebruary\nSun  Mon  Tue  Wed  Thu  Fri  Sat\n");
                    if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
                        number_of_month = 29;
                    else
                        number_of_month = 28;

                    for(int start = 1; start <= (first_day*5)+1 ;start++){ // begining space
                        
                        System.out.print(" ");
                        }
                    
                    i = 1; // first day number
                    
                    for(; i <= 7 - first_day;i++){ // first row
                        
                        System.out.print(i + "    ");
                    }
                    
                    System.out.println(""); System.out.print(" ");//second row's space
                    
                    for(int count = 1; i <= number_of_month; i++, count++){
                        
                        if (i<9) // one digits between distance
                            System.out.print(i + "    ");
                        
                        else     // two digits between distance
                            System.out.print(i + "   ");
                        
                        if (count %7 == 0)
                            System.out.print("\n");
                    }
                System.out.print("\n\n\n\n");
                    
                    break;
                
                case 3: System.out.print("\t\tMarch\nSun  Mon  Tue  Wed  Thu  Fri  Sat\n");
                    number_of_month = 31;

                    for(int start = 1; start <= (first_day*5)+1 ;start++){ // begining space
                        
                        System.out.print(" ");
                        }
                    
                    i = 1; // first day number
                    
                    for(; i <= 7 - first_day;i++){ // first row
                        
                        System.out.print(i + "    ");
                    }
                    
                    System.out.println(""); System.out.print(" ");//second row's space
                    
                    for(int count = 1; i <= number_of_month; i++, count++){
                        
                        if (i<9) // one digits between distance
                            System.out.print(i + "    ");
                        
                        else     // two digits between distance
                            System.out.print(i + "   ");
                        
                        if (count %7 == 0)
                            System.out.print("\n");
                    }
                System.out.print("\n\n\n\n");
                    
                    break;
                
                case 4: System.out.print("\t\tApril\nSun  Mon  Tue  Wed  Thu  Fri  Sat\n");
                    number_of_month = 30;

                    for(int start = 1; start <= (first_day*5)+1 ;start++){ // begining space
                        
                        System.out.print(" ");
                        }
                    
                    i = 1; // first day number
                    
                    for(; i <= 7 - first_day;i++){ // first row
                        
                        System.out.print(i + "    ");
                    }
                    
                    System.out.println(""); System.out.print(" ");//second row's space
                    
                    for(int count = 1; i <= number_of_month; i++, count++){
                        
                        if (i<9) // one digits between distance
                            System.out.print(i + "    ");
                        
                        else     // two digits between distance
                            System.out.print(i + "   ");
                        
                        if (count %7 == 0)
                            System.out.print("\n");
                    }
                System.out.print("\n\n\n\n");
                    
                    break;
                
                case 5: System.out.print("\t\tMay\nSun  Mon  Tue  Wed  Thu  Fri  Sat\n");
                    number_of_month = 31;
                    
                    for(int start = 1; start <= (first_day*5)+1 ;start++){ // begining space
                        
                        System.out.print(" ");
                        }
                    
                    i = 1; // first day number
                    
                    for(; i <= 7 - first_day;i++){ // first row
                        
                        System.out.print(i + "    ");
                    }
                    
                    System.out.println(""); System.out.print(" ");//second row's space
                    
                    for(int count = 1; i <= number_of_month; i++, count++){
                        
                        if (i<9) // one digits between distance
                            System.out.print(i + "    ");
                        
                        else     // two digits between distance
                            System.out.print(i + "   ");
                        
                        if (count %7 == 0)
                            System.out.print("\n");
                    }
                System.out.print("\n\n\n\n");
                    
                    break;
                
                case 6: System.out.print("\t\tJune\nSun  Mon  Tue  Wed  Thu  Fri  Sat\n");
                    number_of_month = 30;
                    
                    for(int start = 1; start <= (first_day*5)+1 ;start++){ // begining space
                        
                        System.out.print(" ");
                        }
                    
                    i = 1; // first day number
                    
                    for(; i <= 7 - first_day;i++){ // first row
                        
                        System.out.print(i + "    ");
                    }
                    
                    System.out.println(""); System.out.print(" ");//second row's space
                    
                    for(int count = 1; i <= number_of_month; i++, count++){
                        
                        if (i<9) // one digits between distance
                            System.out.print(i + "    ");
                        
                        else     // two digits between distance
                            System.out.print(i + "   ");
                        
                        if (count %7 == 0)
                            System.out.print("\n");
                    }
                System.out.print("\n\n\n\n");
                    
                    break;
                
                case 7: System.out.print("\t\tJuly\nSun  Mon  Tue  Wed  Thu  Fri  Sat\n");
                    number_of_month = 31;
                    
                    for(int start = 1; start <= (first_day*5)+1 ;start++){ // begining space
                        
                        System.out.print(" ");
                        }
                    
                    i = 1; // first day number
                    
                    for(; i <= 7 - first_day;i++){ // first row
                        
                        System.out.print(i + "    ");
                    }
                    
                    System.out.println(""); System.out.print(" ");//second row's space
                    
                    for(int count = 1; i <= number_of_month; i++, count++){
                        
                        if (i<9) // one digits between distance
                            System.out.print(i + "    ");
                        
                        else     // two digits between distance
                            System.out.print(i + "   ");
                        
                        if (count %7 == 0)
                            System.out.print("\n");
                    }
                System.out.print("\n\n\n\n");
                    
                    break;
                
                case 8: System.out.print("\t\tAugust\nSun  Mon  Tue  Wed  Thu  Fri  Sat\n");
                    number_of_month = 31;
                    
                    for(int start = 1; start <= (first_day*5)+1 ;start++){ // begining space
                        
                        System.out.print(" ");
                        }
                    
                    i = 1; // first day number
                    
                    for(; i <= 7 - first_day;i++){ // first row
                        
                        System.out.print(i + "    ");
                    }
                    
                    System.out.println(""); System.out.print(" ");//second row's space
                    
                    for(int count = 1; i <= number_of_month; i++, count++){
                        
                        if (i<9) // one digits between distance
                            System.out.print(i + "    ");
                        
                        else     // two digits between distance
                            System.out.print(i + "   ");
                        
                        if (count %7 == 0)
                            System.out.print("\n");
                    }
                System.out.print("\n\n\n\n");
                    
                    break;
                    
                case 9: System.out.print("\t\tSeptember\nSun  Mon  Tue  Wed  Thu  Fri  Sat\n");
                    number_of_month = 30;
                    
                    for(int start = 1; start <= (first_day*5)+1 ;start++){ // begining space
                        
                        System.out.print(" ");
                        }
                    
                    i = 1; // first day number
                    
                    for(; i <= 7 - first_day;i++){ // first row
                        
                        System.out.print(i + "    ");
                    }
                    
                    System.out.println(""); System.out.print(" ");//second row's space
                    
                    for(int count = 1; i <= number_of_month; i++, count++){
                        
                        if (i<9) // one digits between distance
                            System.out.print(i + "    ");
                        
                        else     // two digits between distance
                            System.out.print(i + "   ");
                        
                        if (count %7 == 0)
                            System.out.print("\n");
                    }
                System.out.print("\n\n\n\n");
                    
                    break;
                    
                case 10: System.out.print("\t\tOctober\nSun  Mon  Tue  Wed  Thu  Fri  Sat\n");
                    number_of_month = 31;
                    
                    for(int start = 1; start <= (first_day*5)+1 ;start++){ // begining space
                        
                        System.out.print(" ");
                        }
                    
                    i = 1; // first day number
                    
                    for(; i <= 7 - first_day;i++){ // first row
                        
                        System.out.print(i + "    ");
                    }
                    
                    System.out.println(""); System.out.print(" ");//second row's space
                    
                    for(int count = 1; i <= number_of_month; i++, count++){
                        
                        if (i<9) // one digits between distance
                            System.out.print(i + "    ");
                        
                        else     // two digits between distance
                            System.out.print(i + "   ");
                        
                        if (count %7 == 0)
                            System.out.print("\n");
                    }
                System.out.print("\n\n\n\n");
                    
                    break;
                    
                case 11: System.out.print("\t\tNovember\nSun  Mon  Tue  Wed  Thu  Fri  Sat\n");
                    number_of_month = 30;
                    
                    for(int start = 1; start <= (first_day*5)+1 ;start++){ // begining space
                        
                        System.out.print(" ");
                        }
                    
                    i = 1; // first day number
                    
                    for(; i <= 7 - first_day;i++){ // first row
                        
                        System.out.print(i + "    ");
                    }
                    
                    System.out.println(""); System.out.print(" ");//second row's space
                    
                    for(int count = 1; i <= number_of_month; i++, count++){
                        
                        if (i<9) // one digits between distance
                            System.out.print(i + "    ");
                        
                        else     // two digits between distance
                            System.out.print(i + "   ");
                        
                        if (count %7 == 0)
                            System.out.print("\n");
                    }
                System.out.print("\n\n\n\n");
                    
                    break;
                    
                case 12: System.out.print("\t\tDecember\nSun  Mon  Tue  Wed  Thu  Fri  Sat\n");
                    number_of_month = 31;
                    
                    for(int start = 1; start <= (first_day*5)+1 ;start++){ // begining space
                        
                        System.out.print(" ");
                        }
                    
                    i = 1; // first day number
                    
                    for(; i <= 7 - first_day;i++){ // first row
                        
                        System.out.print(i + "    ");
                    }
                    
                    System.out.println(""); System.out.print(" ");//second row's space
                    
                    for(int count = 1; i <= number_of_month; i++, count++){
                        
                        if (i<9) // one digits between distance
                            System.out.print(i + "    ");
                        
                        else     // two digits between distance
                            System.out.print(i + "   ");
                        
                        if (count %7 == 0)
                            System.out.print("\n");
                    }
                System.out.print("\n\n\n\n");
                    
                    break;
            }



            // Get the start day for the next month
            first_day = (first_day + number_of_month) % 7;    
    
        }            

    }
}
