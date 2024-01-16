/**Note:spaces are given for the name[] array’s values to make billing look aligned.This java program is made with
a lot of effort to match to the user's convinience*/
import java.util.*;
class bakery
{
    /*Declaring and initialising all important variables.*/
    int ch, ch1;
    int no;
    int n=100;
    double cost=0.0;
    int z=0;
    int cho=0;
    double a[]=new double[10];
    String name[]=new String[n];
    double price[]=new double[n];
    int numb[]=new int[n];
    void main()	
    {
        Scanner in=new Scanner(System.in);
        double Billamt=0; //Initialising bill amount as zero
        String st; //Stops or exits the do while loop
        bakery ob=new bakery();
        System.out.println("            	                      WARRIOR BAKERY");
        System.out.println("");
        System.out.println("");
        System.out.println("An exceptional dining experience at the best bakery in Bangalore awaits you."); 
        System.out.println("From cookies, cakes, puffs and a wide rage of varieties of manchurians. Overlooking");
        System.out.println("the aquamarine blue pool, the all-day open bakery is the ideal setting for a");
        System.out.println("busy day from work, a place to unwind or to catch up with friends and colleagues.");
        System.out.println("Blending the best of culinary traditions with global plating and presentation");
        System.out.println("style, the restaurant serves modern sweets and savories.");
        System.out.println("");
        System.out.println("");
        do
        {
            System.out.println("         **************KINDLY PLACE YOUR ORDER***************");
            System.out.println("");
            System.out.println("");
            System.out.println("                   **********************************");
            System.out.println("                   *          MAIN MENU             *");
            System.out.println("                   *       1.PUFFS                  *");
            System.out.println("                   *       2.COOKIES                *");
            System.out.println("                   *       3.CAKES                  *");
            System.out.println("                   *       4.MANCHURIANS            *");
            System.out.println("                   *       5.OTHER                  *");
            System.out.println("                   **********************************");
            System.out.println("");
            System.out.println("");
            System.out.println("ENTER YOUR COUSINE CHOICE");
            cho=in.nextInt();
            switch(cho)
            {
                case 1:
                ob.puffs();
                break;
                case 2:
                ob.cookies();
                break;
                case 3:
                ob.cakes();
                break;
                case 4:
                ob.manchurians();
                break;
                case 5:
                ob.other1();
                break;
                default:
                System.out.println("INVALID ENTRY");
            }
            System.out.println("Please type 'stop' if you want to stop ordering");
            System.out.println("Type anything else if you want to continue ordering");
            st=in.next(); 
        }
        while(!(st.equalsIgnoreCase("stop"))); //computing and printing the bill
        System.out.println("");
        System.out.println("");
        System.out.println("***********************************************************************************");
        System.out.println("                                      YOUR BILL");
        System.out.println("***********************************************************************************");
        System.out.println("Sl.no           Item name                       Cost of the item    Num of items");
        for(int i=0;i<ob.z;i++)
        {
            System.out.println(i+1+"\t\t"+ob.name[i]+"\t\t\tRs"+ob.price[i]+"\t\t"+ob.numb[i]);
        }
        System.out.println("***********************************************************************************");
        Billamt =ob.cost+Billamt; //to compute the total bill amount.
        double scost;
        System.out.println("Total cost to be paid= Rs"+Billamt);
        System.out.println("cgst is 9%");//Calculating tax on bill amount.
        System.out.println("sgst is 9%");						
        scost=Billamt+18.0/100.0*Billamt;
        System.out.println("Total cost including gst is Rs."+scost);
        ob.payment();
    }

    void puffs()
    {
        Scanner in=new Scanner(System.in);    
        System.out.println("           ***********************************************");
        System.out.println("           *                    PUFFS                    *");
        System.out.println("           *   1.Plain Puff                  20/-plate   *");
        System.out.println("           *   2.Paneer Puff                 35/-plate   *");
        System.out.println("           *   3.Corn Puff                   25/-plate   *");
        System.out.println("           *   4.Aloo Puff                   30/-plate   *");
        System.out.println("           *   5.Mix Vegetable Puff          35/-plate   *");
        System.out.println("           ***********************************************");
        System.out.println("");
        System.out.println("");
        System.out.println("ENTER YOUR CHOICE");
        int ch=in.nextInt();
        System.out.println("");
        System.out.println("");
        if(ch==1)
        {
            System.out.println("Plain Puff will cost you Rs.20 per plate");
            System.out.println("\n Enter the number of plates");
            no=in.nextInt();
            name[z]="Plain Puff        ";
            price[z]=20;
            numb[z]=no;
            z++;
            cost=cost+20*no;
        }
        else if(ch==2)
        {
            System.out.println("Paneer Puff will cost you Rs.35 per plate");
            System.out.println("\n Enter the number of plates");
            no=in.nextInt();
            name[z]="Paneer Puff       ";
            price[z]=35;
            numb[z]=no;
            z++;
            cost=cost+35*no;
        }
        else if(ch==3)
        {
            System.out.println("Corn Puff kofta will cost you Rs.25 per plate");
            System.out.println("\n Enter the number of plates");
            no=in.nextInt();
            name[z]="Corn Puff         ";
            price[z]=25;
            numb[z]=no;
            z++;
            cost=cost+25*no;
        }
        else if(ch==4)
        {
            System.out.println("Aloo Puff will cost you Rs.30 per plate");
            System.out.println("\n Enter the number of plates");
            no=in.nextInt();
            name[z]="Aloo Puff          ";
            price[z]=30;
            numb[z]=no;
            z++;
            cost=cost+30*no;
        }
        else if(ch==5)
        {
            System.out.println("Mix vegetable puff will cost you Rs.35 per plate");
            System.out.println("\n Enter the number of plates");
            no=in.nextInt();
            name[z]="Mix vegetable puff ";
            price[z]=35;
            numb[z]=no; 
            z++;
            cost=cost+35*no;
        }
        else
            System.out.println("PLEASE CHECK YOUR INPUT");
    }

    void cookies()
    {
        Scanner in=new Scanner(System.in);

        System.out.println("           ***********************************************");
        System.out.println("           *                    COOKIES                  *");
        System.out.println("           *        1 plate contains 100 grams each      *");  
        System.out.println("           *   1.Butter cookies              40/-plate   *");
        System.out.println("           *   2.Choco-chip cookies          55/-plate   *");
        System.out.println("           *   3.Masala cookies              45/-plate   *");
        System.out.println("           *   4.Nutty Delight               50/-plate   *");
        System.out.println("           *   5.Oat Meal cookies            55/-plate   *");
        System.out.println("           ***********************************************");
        System.out.println("");
        System.out.println("");
        System.out.println("ENTER YOUR CHOICE");
        ch=in.nextInt();
        System.out.println("");
        System.out.println("");
        if(ch==1)
        {
            System.out.println("Butter Cookies will cost you Rs.40 per plate");
            System.out.println("\n Enter the number of plates");
            no=in.nextInt();
            name[z]="Butter Cookies    ";
            price[z]=40;
            numb[z]=no;
            z++;
            cost=cost+40*no;
        }
        else if(ch==2)
        {
            System.out.println("Choco-chip Cookies will cost you Rs.55");
            System.out.println("\n Enter the number of plates");
            no=in.nextInt();
            name[z]="Choco-chip Cookies ";
            price[z]=55;
            numb[z]=no;
            z++;
            cost=cost+55*no;
        }
        else if(ch==3)
        {
            System.out.println("Masala Cookies will cost you Rs.45 per plate");
            System.out.println("\n Enter the number of plates");
            no=in.nextInt();
            name[z]="Masala Cookies     ";
            price[z]=45;
            numb[z]=no;
            z++;
            cost=cost+45*no;
        }
        else if(ch==4)
        {
            System.out.println("Nutty Delight will cost you Rs.50 per plate");
            System.out.println("\n Enter the number of plates");
            no=in.nextInt();
            name[z]="Nutty Delight      ";
            price[z]=50;
            numb[z]=no;
            z++;
            cost=cost+50*no;
        }
        else if(ch==5)
        {
            System.out.println("Oat meal cookies will cost you Rs.55 per plate");
            System.out.println("\n Enter the number of plates");
            no=in.nextInt();
            name[z]="Oat meal cookies   ";
            price[z]=55;
            numb[z]=no;
            z++;
            cost=cost+55*no;
        }
        else
            System.out.println("PLEASE CHECK YOUR INPUT");    
    }

    void cakes()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("");
        System.out.println("");
        System.out.println("                                CAKES");
        System.out.println("");
        System.out.println("");
        System.out.println("                  ******************************");
        System.out.println("                  *           1.PLAIN          *");
        System.out.println("                  *           2.PASTERY        *");
        System.out.println("                  ******************************");
        System.out.println("");
        System.out.println("");
        System.out.println("ENTER YOUR CHOICE");
        int ch1=in.nextInt();
        switch(ch1)
        {
            case 1:
            System.out.println("           ***********************************************");
            System.out.println("           *                PLAIN CAKES                  *");
            System.out.println("           *   1.Dry Fruit Cake              60/-plate   *");
            System.out.println("           *   2.Carob Cake                  55/-plate   *");
            System.out.println("           *   3.Carrot  Cake                45/-plate   *");
            System.out.println("           *   4.Apple Cake                  50/-plate   *");
            System.out.println("           *   5.Plum Cakes                  50/-plate   *");
            System.out.println("           ***********************************************");
            System.out.println("");
            System.out.println("");
            System.out.println("ENTER YOUR CHOICE");
            ch=in.nextInt();
            System.out.println("");
            System.out.println("");
            if(ch==1)
            {
                System.out.println("Dry Fruit Cake will cost you Rs.60");
                System.out.println("\n Enter the number of plates");
                no=in.nextInt();
                name[z]="Dry fruit Cake     ";
                price[z]=60;
                numb[z]=no;
                z++;
                cost=cost+60*no;
            }
            else if(ch==2)
            {
                System.out.println("Carob Cake will cost you Rs.55");
                System.out.println("\n Enter the number of plates");
                no=in.nextInt();
                name[z]="Carob Cake         ";
                price[z]=55;
                numb[z]=no;
                z++;
                cost=cost+55*no;
            }
            else if(ch==3)
            {
                System.out.println("Carrot Cake will cost you Rs.45");
                System.out.println("\n Enter the number of plates");
                no=in.nextInt();
                name[z]="Carrot Cake        ";
                price[z]=45;
                numb[z]=no;
                z++;
                cost=cost+45*no;
            }
            else if(ch==4)
            {
                System.out.println("Apple Cake cost you Rs.50");
                System.out.println("\n Enter the number of plates");
                no=in.nextInt();
                name[z]="Apple Cake         ";
                price[z]=50;
                numb[z]=no;
                z++;
                cost=cost+50*no;
            }
            else if(ch==5)
            {
                System.out.println("Plum cakes will cost you Rs.50");
                System.out.println("\n Enter the number of plates");
                no=in.nextInt();
                name[z]="Apple Cake          ";
                price[z]=50;
                numb[z]=no;
                z++;
                cost=cost+50*no;
            }
            else
                System.out.println("PLEASE CHECK YOUR INPUT");
            break;
            case 2:
            System.out.println("");
            System.out.println("");
            System.out.println("           ***********************************************");
            System.out.println("           *                      PASTERY                *");
            System.out.println("           *   1.Pineapple gateaux           70/-plate   *");
            System.out.println("           *   2.Black Forest                85/-plate   *");
            System.out.println("           *   3.Strawberry pastery          75/-plate   *");
            System.out.println("           *   4.Butterscotch Delight        80/-plate   *");
            System.out.println("           *   5.Choco-Vanilla combo         80/-plate   *");
            System.out.println("           ***********************************************");
            System.out.println("");
            System.out.println("");
            System.out.println("ENTER YOUR CHOICE");
            ch=in.nextInt();
            if(ch==1)
            {
                System.out.println("Pineapple gateaux will cost you Rs.70");
                System.out.println("\n Enter the number of plates");
                no=in.nextInt();
                name[z]="Pineapple gateaux  ";
                price[z]=70;
                numb[z]=no;
                z++;
                cost=cost+70*no;
            }
            else if(ch==2)
            {
                System.out.println("Black forest will cost you Rs.85");
                System.out.println("\n Enter the number of plates");
                no=in.nextInt();
                name[z]="Black forest       ";
                price[z]=85;
                numb[z]=no;
                z++;
                cost=cost+85*no;
            }
            else if(ch==3)
            {
                System.out.println("Strawberry Pastery will cost you Rs.85");
                System.out.println("\n Enter the number of plates");
                no=in.nextInt();
                name[z]="Strawberry Pastery  ";
                price[z]=85;
                numb[z]=no;
                z++;
                cost=cost+85*no;
            }
            else if(ch==4)
            {
                System.out.println("Butterscotch Delight will cost you Rs.80");
                System.out.println("\n Enter the number of plates");
                no=in.nextInt();
                name[z]="Butterscotch Delight";
                price[z]=80;
                numb[z]=no;
                z++;
                cost=cost+80*no;
            }
            else if(ch==5)
            {
                System.out.println("Choco-Vanilla  combo will cost you Rs.80");
                System.out.println("\n Enter the number of plates");
                no=in.nextInt();
                name[z]="Choco-Vanilla combo";
                price[z]=80;
                numb[z]=no;
                z++;
                cost=cost+80*no;
            }
            else
                System.out.println("PLEASE CHECK YOUR INPUT");
            break;
            default:
            System.out.println("PLEASE CHECK YOUR INPUT");
        }
    }

    void manchurians() 
    {
        Scanner in=new Scanner(System.in);
        System.out.println("           ***********************************************");
        System.out.println("           *                   manchurians               *");
        System.out.println("           *   1.Gobi manchurian             40/-plate   *");
        System.out.println("           *   2.Paneer manchurian           45/-plate   *");
        System.out.println("           *   3.Baby corn manchurian        50/-plate   *");
        System.out.println("           *   4.Mushroom manchurian         50/-plate   *");
        System.out.println("           ***********************************************");
        System.out.println("");
        System.out.println("");
        System.out.println("ENTER YOUR CHOICE");
        ch=in.nextInt();
        System.out.println("");
        System.out.println("");
        if(ch==1)
        {
            System.out.println("Gobi manchurian will cost you Rs.40");
            System.out.println("\n Enter the number of plates");
            no=in.nextInt();
            name[z]="Gobi manchurian   ";
            price[z]=40;
            numb[z]=no;
            z++;
            cost=cost+40*no;
        }
        else if(ch==2)
        {
            System.out.println("Paneer manchurian will cost you Rs.45");
            System.out.println("\n Enter the number of plates");
            no=in.nextInt();
            name[z]="Paneer manchurian  ";
            price[z]=45;
            numb[z]=no;
            z++;
            cost=cost+45*no;
        }
        else if(ch==3)
        {
            System.out.println("Baby corn manchurian will cost you Rs.50");
            System.out.println("\n Enter the number of plates");
            no=in.nextInt();
            name[z]="Baby corn manchurian";
            price[z]=50;
            numb[z]=no;
            z++;
            cost=cost+50*no;
        }
        else if(ch==4)
        {
            System.out.println("Mushroom manchurian will cost you Rs.50");
            System.out.println("\n Enter the number of plates");
            no=in.nextInt();
            name[z]="Mushroom manchurian  ";
            price[z]=50;
            numb[z]=no;
            z++;
            cost=cost+50*no;
        }
        else
            System.out.println("PLEASE CHECK YOUR INPUT");
    }

    void other1() 
    {
        Scanner in=new Scanner(System.in);
        System.out.println("");
        System.out.println("");
        System.out.println("                                OTHER");
        System.out.println("");
        System.out.println("");
        System.out.println("                  ******************************");
        System.out.println("                  *           1.CHIPS          *");
        System.out.println("                  *           2.MIXTURES       *");
        System.out.println("                  ******************************");
        System.out.println("");
        System.out.println("");
        System.out.println("ENTER YOUR CHOICE");
        int ch1=in.nextInt();
        switch(ch1)
        {
            case 1:
            System.out.println("           ***********************************************");
            System.out.println("           *                      CHIPS                  *");
            System.out.println("           *   1.Tortilla crisps             40/-plate   *");
            System.out.println("           *   2.Salted Potato chips         45/-plate   *");
            System.out.println("           *   3.Potato chips(spiced)        50/-plate   *");
            System.out.println("           *   4.Tapioca chips               50/-plate   *");
            System.out.println("           ***********************************************");
            System.out.println("");
            System.out.println("");
            System.out.println("ENTER YOUR CHOICE");
            ch=in.nextInt();
            System.out.println("");
            System.out.println("");
            if(ch==1)
            {
                System.out.println("Tortilla crisps will cost you Rs.40");
                System.out.println("\n Enter the number of plates");
                no=in.nextInt();
                name[z]="Tortilla crisps      ";
                price[z]=40;
                numb[z]=no;
                z++;
                cost=cost+40*no;
            }
            else if(ch==2)
            {
                System.out.println("Salted Potato chips will cost you Rs.45");
                System.out.println("\n Enter the number of plates");
                no=in.nextInt();
                name[z]="Salted Potato chips  ";
                price[z]=45;
                numb[z]=no;
                z++;
                cost=cost+45*no;
            }
            else if(ch==3)
            {
                System.out.println("Potato chips(spiced) will cost you Rs.50");
                System.out.println("\n Enter the number of plates");
                no=in.nextInt();
                name[z]="Potato chips(spiced))";
                price[z]=50;
                numb[z]=no;
                z++;
                cost=cost+50*no;
            }
            else if(ch==4)
            {
                System.out.println("Tapioca chips will cost you Rs.50");
                System.out.println("\n Enter the number of plates");
                no=in.nextInt();
                name[z]="Tapioca chips      ";
                price[z]=50;
                numb[z]=no;
                z++;
                cost=cost+50*no;
            }
            else
                System.out.println("PLEASE CHECK YOUR INPUT");
            break;
            case 2:
            System.out.println("");
            System.out.println("");
            System.out.println("           ***********************************************");
            System.out.println("           *                      MIXTURES               *");
            System.out.println("           *   1.Khatta Meeta                70/-plate   *");
            System.out.println("           *   2.Navratan mixture            75/-plate   *");
            System.out.println("           *   3.Panchratan mixture          65/-plate   *");
            System.out.println("           *   4.Aloo bujia                  80/-plate   *");
            System.out.println("           *   5.Bujia sev                   85/-plate   *");
            System.out.println("           ***********************************************");
            System.out.println("");
            System.out.println("");
            System.out.println("ENTER YOUR CHOICE");
            ch=in.nextInt();
            if(ch==1)
            {
                System.out.println("Khatta Meeta will cost you Rs.70");
                System.out.println("\n Enter the number of plates");
                no=in.nextInt();
                name[z]="Khatta Meeta     ";
                price[z]=70;
                numb[z]=no;
                z++;
                cost=cost+70*no;
            }
            else if(ch==2)
            {
                System.out.println("Navratan mixture will cost you Rs.75");
                System.out.println("\n Enter the number of plates");
                no=in.nextInt();
                name[z]="Navratan mixture ";
                price[z]=75;
                numb[z]=no;
                z++;
                cost=cost+75*no;
            }
            else if(ch==3)
            {
                System.out.println("Panchratan mixture will cost you Rs.65");
                System.out.println("\n Enter the number of plates");
                no=in.nextInt();
                name[z]="Panchratan mixture";
                price[z]=65;
                numb[z]=no;
                z++;
                cost=cost+65*no;
            }
            else if(ch==4)
            {
                System.out.println("Aloo bujia will cost you Rs.80");
                System.out.println("\n Enter the number of plates");
                no=in.nextInt();
                name[z]="Aloo bujia        ";
                price[z]=80;
                numb[z]=no;
                z++;
                cost=cost+80*no;
            }
            else if(ch==5)
            {
                System.out.println("Bujia sev will cost you Rs.85");
                System.out.println("\n Enter the number of plates");
                no=in.nextInt();
                name[z]="Bujia sev          ";
                price[z]=85;
                numb[z]=no;
                z++;
                cost=cost+85*no;
            }
            else
                System.out.println("PLEASE CHECK YOUR INPUT");
            break;
            default:
            System.out.println("PLEASE CHECK YOUR INPUT");
        }
    }

    void thanks()
    {
        System.out.println("Thank you for visiting warrior bakery");
        System.out.println("Thank you visit again");
    }

    void payment()
    {   //payment type
        Scanner in=new Scanner(System.in);
        bakery ob=new bakery();
        System.out.println ( " Select the payement type");
        System.out.println ( " 1 - VISA ");
        System.out.println ( " 2 - MasterCard ");
        System.out.println ( " 3 - Cash");
        System.out.print ( " Enter the choice :");
        int credit = in.nextInt();
        //Accepting and checking various user inputs
        if ( credit == 3 )
        {
            System.out.println ( " 1 - YES I want to pay");
            System.out.println ( " 2 - NO I want to cancel the booking");
            System.out.print ( " enter the choice : " );
            int ch = in.nextInt(); //Take user input
            if (ch == 1 )
            {   
                System.out.println ( " Your booking has been done ..... safely  ");
                ob.thanks();
            }
            if ( ch == 2 )
            {   
                System.out.println ( "Your order has been Cancelled successfully	");
                ob.thanks();
            }
            ob.thanks();
        }
        else if ( credit > 3 || credit < 1 )
        {   System.out.println ( " Invalid choice ");
            System.out.println ( " Re - enter the data " );
            ob.payment();
        }
        else 
        {
            System.out.println ("\f");
            System.out.print ( " Enter the last 4 digits of your card :");
            int four = in.nextInt();
            if ( four < 1000 || four > 9999 )
            {   System.out.println ( " Invalid entry " );
                System.out.println ( " Please re-enter the data " );
                ob.payment();
            }
            System.out.print ( " Enter the 3-digit CVV number : ");
            int cvv = in.nextInt();
            if ( cvv < 100 || cvv > 999 )
            {   System.out.println ( " Invalid CVV " );
                System.out.println ( " Please re-enter the data " );
                ob.payment();
            }
            System.out.print ( " Enter the phone number :");
            Double phone = in.nextDouble();
            if ( phone < 1000000000 )
            {  System.out.println ( " Invalid Phone Number ");
                System.out.println ( " Re - enter the data " );
                ob.payment();
            }
            System.out.println ( "\f");
            System.out.println ( " Do u want to transfer the amount ? ");
            System.out.println ( " 1 - YES I want to pay");
            System.out.println ( " 2 - NO I want to cancel the booking");
            System.out.print ( " enter the choice : " );
            int ch = in.nextInt(); //Take user input
            if (ch == 1 )
            {   
                System.out.println ( " Your booking has been done ..... safely  ");
                ob.thanks();
            }
            if ( ch == 2 )
            {   
                System.out.println ( "Your order has been Cancelled successfully	");
                ob.thanks();
            }
            if ( ch == 3 )
            {
                System.out.println ( " Wrong entry ! Re-enter the data");
                ob.payment();
            }
        }
    }
}
