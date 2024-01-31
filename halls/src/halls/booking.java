package halls;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class booking {
      public static void book(int book[]){
        while(true){
            int o;
            Scanner scan=new Scanner(System.in);
            System.out.println("1.hall 1: from 7 Am to 2 Pm\n2.hall 1: from 3 Pm to 12 Am\n3.hall 2: from 7 Am to 2 Pm\n4.hall 2: from 3 Pm to 12 Am\n5.hall 3: from 7 Am to 2 Pm\n6.hall 3: from 3 Pm to 12 Am\n");
            o=scan.nextInt();
            if(o==1){
                if(book[0]==0){
                    book[0]=1;
                    System.out.println("Booked successfully");
                break;
                }
                else{
                    System.out.println("already booked");
                    break;
                }
            }
            if(o==2){
                if(book[1]==0){
                    book[1]=1;
                    System.out.println("Booked successfully");
                break;
                }
                else{
                    System.out.println("already booked");
                    break;
                }
            }
            if(o==3){
                if(book[2]==0){
                    book[2]=1;
                    System.out.println("Booked successfully");
                break;
                }
                else{
                    System.out.println("already booked");
                    break;
                }
            }            
            if(o==4){
                if(book[3]==0){
                    book[3]=1;
                    System.out.println("Booked successfully");
                break;
                }
                else{
                    System.out.println("already booked");
                    break;
                }
            }
            if(o==5){
                if(book[4]==0){
                    book[4]=1;
                    System.out.println("Booked successfully");
                break;
                }
                else{
                    System.out.println("already booked");
                    break;
                }
            }
            if(o==6){
                if(book[5]==0){
                    book[5]=1;
                    System.out.println("Booked successfully");
                break;
                }
               else{
                    System.out.println("already booked");
                    break;
                }
            }
            System.out.println("enter valid option");
        }
    }
    public static void save(int book[]) throws IOException{
        File f=new File("book.csv");
        FileWriter s = new FileWriter(f);
        s.write(book[0]+"\n"+book[1]+"\n"+book[2]+"\n"+book[3]+"\n"+book[4]+"\n"+book[5]);
        s.close();
    }
    public static void load(int book[]) throws FileNotFoundException, IOException{
        File f=new File("book.csv");
        BufferedReader reader = new BufferedReader(new FileReader("book.csv"));
        for(int i=0;i<6;i++){
            book[i]=Integer.parseInt(reader.readLine());
        }
    }
          public static void cancel(int book[],LinkedList m1,LinkedList m2,LinkedList m3,LinkedList m4,LinkedList m5,LinkedList m6) throws IOException{
        while(true){
            int o;
            Scanner scan=new Scanner(System.in);
            System.out.println("1.hall 1: from 7 Am to 2 Pm\n2.hall 1: from 3 Pm to 12 Am\n3.hall 2: from 7 Am to 2 Pm\n4.hall 2: from 3 Pm to 12 Am\n5.hall 3: from 7 Am to 2 Pm\n6.hall 3: from 3 Pm to 12 Am\n");
            o=scan.nextInt();
            if(o==1){
                if(book[0]==1){
                    book[0]=0;
                    System.out.println("canceled successfully");
                    person.del(o, m1, m2, m3, m4, m5, m6);
                break;
                }
                else{
                    System.out.println("No reservation to be canceled");
                    break;
                }
            }
            if(o==2){
                if(book[1]==1){
                    book[1]=0;
                    System.out.println("canceled successfully");
                    person.del(o, m1, m2, m3, m4, m5, m6);
                break;
                }
                else{
                    System.out.println("No reservation to be canceled");
                    break;
                }
            }
            if(o==3){
                if(book[2]==1){
                    book[2]=0;
                    System.out.println("canceled successfully");
                    person.del(o, m1, m2, m3, m4, m5, m6);
                break;
                }
                else{
                    System.out.println("No reservation to be canceled");
                    break;
                }
            }            
            if(o==4){
                if(book[3]==1){
                    book[3]=0;
                    System.out.println("canceled successfully");
                    person.del(o, m1, m2, m3, m4, m5, m6);
                break;
                }
                else{
                    System.out.println("No reservation to be canceled");
                    break;
                }
            }
            if(o==5){
                if(book[4]==1){
                    book[4]=0;
                    System.out.println("canceled successfully");
                    person.del(o, m1, m2, m3, m4, m5, m6);
                break;
                }
                else{
                    System.out.println("No reservation to be canceled");
                    break;
                }
            }
            if(o==6){
                if(book[5]==1){
                    book[5]=0;
                    System.out.println("canceled successfully");
                    person.del(o, m1, m2, m3, m4, m5, m6);
                break;
                }
                else{
                    System.out.println("No reservation to be canceled");
                    break;
                }
            }
            System.out.println("enter valid option");            
        }
    }
     }
      
