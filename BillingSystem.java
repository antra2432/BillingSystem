
import java.util.ArrayList;
import java.util.Scanner;


public class BillingSystem {
    static int sum=0;
    static ArrayList <String>al=new ArrayList<String>();
    static ArrayList  <Integer> al1=new ArrayList <Integer > ( ) ;
    static Scanner sc=new Scanner(System.in);
    static int num,quantity,qsum;
    public static void main(String[] args) {
        show();
        get();
//        add( );
        display();
    }

    static void show(){
        System.out.println("menu                                            price");
        System.out.println("1) black tea                                         150");
        System.out.println("2)green tea                                          210");
        System.out.println("3)rose tea                                           350");
        System.out.println("4)espresso                                           360");
        System.out.println("5)cappuccino                                         180");
        System.out.println("6)Americano                                          280");
        System.out.println("7)muffin                                              80   ");
        System.out.println("8)pancakes                                           140");
        System.out.println("9)apple pie                                          390");
        System.out.println("10) exit");
    }
    static void get(){
        System.out.println("enter your choice ");
        num=sc.nextInt( );

        do{
            switch(num){
                case 1: al.add("black tea");
                    System.out.println("enter quantity");
                    quantity =sc.nextInt( );
                    qsum=quantity *150;
                    al1.add(150);
                    break;

                case 2: al.add("green tea");
                    quantity =sc.nextInt( );
                    qsum=quantity *210;
                    al1.add(210);
                    break;

                case 3: al.add("rose tea");
                    System.out.println("enter quantity");

                    quantity =sc.nextInt( );
                    qsum=quantity *350;
                    al1.add(350);
                    break;

                case 4: al.add(" espresso");
                    System.out.println("enter quantity");

                    quantity =sc.nextInt( );
                    qsum=quantity *360;
                    al1.add(360);
                    break;

                case 5: al.add("cappuccino");
                    System.out.println("enter quantity");

                    quantity =sc.nextInt( );
                    qsum=quantity *180;
                    al1.add(180);
                    break;

                case 6: al.add("Americano");
                    System.out.println("enter quantity");

                    quantity =sc.nextInt( );
                    qsum=quantity *280;
                    al1.add(280);
                    break;

                case 7: al.add("muffins");
                    System.out.println("enter quantity");

                    quantity =sc.nextInt( );
                    qsum=quantity *80;
                    al1.add(80);
                    break;


                case 8:
                    al.add("pancakes");
                    System.out.println("enter quantity");

                    quantity =sc.nextInt( );
                    qsum=quantity *140;
                    al1.add(140);
                    break;


                case 9:
                    al.add("apple pie ");
                    System.out.println("enter quantity");

                    quantity =sc.nextInt( );
                    qsum=quantity *490;
                    al1.add(490);
                    break;

                case 10: display( );
                default: System.out.println("invalid input");

            }
            get( );
        }while(num==10);
//    get();
    }



    static void display( ){

        System.out.println("----------------------------------------BILL------------------------------------------");
        System.out.println("item         |           QTY      |      price     |     total");
        for(int i=0;i<al1.size( );i++){

            sum=(quantity*al1.get(i))+sum;
        }
        System.out.println("============================================================================");
        int CGST=(sum*7)/100;
        int SGST=(sum*5)/100;
        for(int i=0;i<al.size();i++){

            System.out.println(""+al.get(i)+"             "+quantity +"          "+al1.get(i)+""+"*"+quantity+"      "+al1.get(i)*quantity);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("total amount |  "+sum);
        System.out.println("CGST         |  "+CGST);
        System.out.println("SGST         |  "+SGST);
        sum=sum+(CGST+SGST);
        System.out.println("_________________________");
        System.out.println("bill:           "+sum+"/-");
        System.out.println("press 0 to exit ");
        int num2=sc.nextInt( );
        if(num2==0){
            System.exit(0);
        }
        else{
            get();
        }

    }


}


