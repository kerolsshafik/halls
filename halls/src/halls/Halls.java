package halls;
import java.io.IOException;
import static java.lang.System.exit;
import java.util.LinkedList;
import java.util.Scanner;
public class Halls {
    public static void main(String[] args) throws IOException {
       LinkedList m1,m2,m3,m4,m5,m6;
       m1=new LinkedList();
       m2=new LinkedList();
       m3=new LinkedList();
       m4=new LinkedList();
       m5=new LinkedList();
       m6=new LinkedList();
       int book[]=new int[6];
       booking.load(book);
       person.load(1, m1);
       person.load(2, m2);
       person.load(3, m3);
       person.load(4, m4);
       person.load(5, m5);
       person.load(6, m6);
       Scanner scan=new Scanner(System.in);
       boolean f=false;
       int o;
      while(f==false){
          System.out.println("1.show halls\n2.book\n3.add members\n4.show members\n5.cancel the reservation\n6.exit");
          boolean f1=false;
          while(f1==false){
              o=scan.nextInt();
              if(o==1){
                  System.out.println("1.hall 1 : 500 member\n2.hall 2 : 700 member\n3.hall 3 : 1000 member");
                  break;
              }
              if(o==2){
                  booking.book(book); 
                  booking.save(book);
                  break;
              }
              if(o==3){
                  person.addm(book, m1, m2, m3, m4, m5, m6);
                  person.save( m1, m2, m3, m4, m5, m6);
                  break;
              }
              if(o==4){
                  person.showm(book,m1, m2, m3, m4, m5, m6);
                  break;
              }
              if(o==5){
                  booking.cancel(book, m1, m2, m3, m4, m5, m6);
                  break;
              }
              if(o==6){
                  exit(0);
              }
              System.out.println("enter valid option");
          }
      }   
    }   
}