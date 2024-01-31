package halls;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;
public class person {
    public String name;
    private String id;
    public int number;
    private String gender;
    private int hall, time;

    person() {

    }

//    private void GenId() {
//        id = "";
//        switch (gender) {
//            case "male":
//                id += "1";
//                break;
//            case "female":
//                id += "2";
//                break;
//        }
//        switch (hall) {
//            case 1:
//                id += "1";
//                break;
//            case 2:
//                id += "2";
//                break;
//            case 3:
//                id += "3";
//                break;
//        }
//        id += Integer.toString(number);
//
//    }

//    public void setgender(String G) {
//        if ("male".equals(G)) {
//            gender = "male";
//        }
//        if ("female".equals(G)) {
//            gender = "female";
//        }
//    }
//
//    public void sethall(int h) {
//        switch (h) {
//            case 1:
//                hall = 1;
//                break;
//            case 2:
//                hall = 2;
//                break;
//            case 3:
//                hall = 3;
//                break;
//        }
//    }
//
//    public void settime(int i) {
//        switch (i) {
//            case 1:
//                time = 1;
//                break;
//            case 2:
//                time = 2;
//                break;
//        }
//
//    }
//
//    public int gettime() {
//        return time;
//    }

    public static void save(LinkedList m1,LinkedList m2,LinkedList m3,LinkedList m4,LinkedList m5,LinkedList m6) throws IOException {
        for(int x=0;x<6;x++){
            if(x==1){
                File users = new File("hall1_1");
                FileWriter writer = new FileWriter(users, true);
                for(int i=0;i<m1.size();i++){
                    writer.append((String)m1.get(i));
                    
                }
            }
            if(x==2){
                File users = new File("hall1_2");
                FileWriter writer = new FileWriter(users, true);
                for(int i=0;i<m2.size();i++){
                    writer.append((String)m2.get(i));
                    
                }
            }
            if(x==3){
                File users = new File("hall2_1");
                FileWriter writer = new FileWriter(users, true);
                for(int i=0;i<m3.size();i++){
                    writer.append((String)m3.get(i));
                    
                }
            }
            if(x==4){
                File users = new File("hall2_2");
                FileWriter writer = new FileWriter(users, true);
                for(int i=0;i<m4.size();i++){
                    writer.append((String)m4.get(i));
                    
                }
            }
            if(x==5){
                File users = new File("hall3_1");
                FileWriter writer = new FileWriter(users, true);
                for(int i=0;i<m5.size();i++){
                    writer.append((String)m5.get(i));
                    
                }
            }
            if(x==6){
                File users = new File("hall3_2");
                FileWriter writer = new FileWriter(users, true);
                for(int i=0;i<m6.size();i++){
                    writer.append((String)m6.get(i));
                    
                }
            }
        }
            
            
        

    }

    public static void load(int x, LinkedList m1) throws FileNotFoundException, IOException {
        if (x == 1) {
            BufferedReader reader = new BufferedReader(new FileReader("hall1_1"));
            while (true) {
                String t;
                t = reader.readLine();
                if (t != null) {
                    m1.add(t);
                } else {
                    break;
                }

            }
        }
        if (x == 2) {
            BufferedReader reader = new BufferedReader(new FileReader("hall1_2"));
            while (true) {
                String t;
                t = reader.readLine();
                if (t != null) {
                    m1.add(t);
                } else {
                    break;
                }

            }
            }
        if (x == 3) {
            BufferedReader reader = new BufferedReader(new FileReader("hall2_1"));
            while (true) {
                String t;
                t = reader.readLine();
                if (t != null) {
                    m1.add(t);
                } else {
                    break;
                }

            }
        }
        if (x == 4) {
            BufferedReader reader = new BufferedReader(new FileReader("hall2_2"));
            while (true) {
                                String t;
                t = reader.readLine();
                if (t != null) {
                    m1.add(t);
                } else {
                    break;
                }

            }
        }
        if (x == 5) {
            BufferedReader reader = new BufferedReader(new FileReader("hall3_1"));
            while (true) {
                String t;
                t = reader.readLine();
                if (t != null) {
                    m1.add(t);
                } else {
                    break;
                }

            }
        }
        if (x == 6) {
            BufferedReader reader = new BufferedReader(new FileReader("hall3_2"));
            while (true) {
                String t;
                t = reader.readLine();
                if (t != null) {
                    m1.add(t);
                } else {
                    break;
                }

            }
        }
    }

    public static void showm(int b[],LinkedList m1,LinkedList m2,LinkedList m3,LinkedList m4,LinkedList m5,LinkedList m6){
        Scanner scan=new Scanner(System.in);
        while(true){
            int x;
            System.out.println("1.hall 1: from 7 Am to 2 Pm\n2.hall 1: from 3 Pm to 12 Am\n3.hall 2: from 7 Am to 2 Pm\n4.hall 2: from 3 Pm to 12 Am\n5.hall 3: from 7 Am to 2 Pm\n6.hall 3: from 3 Pm to 12 Am\n");
            x=scan.nextInt();
            if(x==1&&b[0]==1){
                for(int i=0;i<m1.size();i++){
                    System.out.println(m1.get(i));
                }
                break;
            }
            if(x==2&&b[1]==1){
                for(int i=0;i<m2.size();i++){
                    System.out.println(m2.get(i));
                }
                break;
            }
            if(x==3&&b[2]==1){
                for(int i=0;i<m3.size();i++){
                    System.out.println(m3.get(i));
                }
                break;
            }
            if(x==4&&b[3]==1){
                for(int i=0;i<m4.size();i++){
                    System.out.println(m4.get(i));
                }
                break;
            }
            if(x==5&&b[4]==1){
                for(int i=0;i<m5.size();i++){
                    System.out.println(m5.get(i));
                }
                break;
            }
            if(x==6&&b[5]==1){
                for(int i=0;i<m6.size();i++){
                    System.out.println(m6.get(i));
                }
                break;
            }
            System.out.println("wrong input please make sure to enter a valid option");
        }
    }
    public static void addm(int b[],LinkedList m1,LinkedList m2,LinkedList m3,LinkedList m4,LinkedList m5,LinkedList m6){
        Scanner scan=new Scanner(System.in);
        while(true){
            int x;
            System.out.println("1.hall 1: from 7 Am to 2 Pm\n2.hall 1: from 3 Pm to 12 Am\n3.hall 2: from 7 Am to 2 Pm\n4.hall 2: from 3 Pm to 12 Am\n5.hall 3: from 7 Am to 2 Pm\n6.hall 3: from 3 Pm to 12 Am\n");
            x=scan.nextInt();
            if(x==1&&b[0]==1){
                System.out.println("enter member's name");
                m1.add(scan.next());
                break;
            }
            if(x==2&&b[1]==1){
                System.out.println("enter member's name");
                m1.add(scan.next());
                break;
            }
            if(x==3&&b[2]==1){
                System.out.println("enter member's name");
                m1.add(scan.next());
                break;
            }
            if(x==4&&b[3]==1){
                System.out.println("enter member's name");
                m1.add(scan.next());
                break;
            }
            if(x==5&&b[4]==1){
                System.out.println("enter member's name");
                m1.add(scan.next());
                break;
            }
            if(x==6&&b[5]==1){
                System.out.println("enter member's name");
                m1.add(scan.next());
                break;
            }
            System.out.println("wrong input please make sure to enter a valid option");
        }
    }
    public static void del(int x,LinkedList m1,LinkedList m2,LinkedList m3,LinkedList m4,LinkedList m5,LinkedList m6) throws FileNotFoundException, IOException{
        if(x==1){
            m1.clear();
            File f=new File("hall1_1");
            BufferedWriter w = new BufferedWriter(new FileWriter("hall1_1"));
            w.write("");
            w.close();
        }
        if(x==2){
            m2.clear();
            File f=new File("hall1_2");
            BufferedWriter w = new BufferedWriter(new FileWriter("hall1_2"));
            w.write("");
            w.close();
        }
        if(x==3){
            m3.clear();
            File f=new File("hall2_1");
            BufferedWriter w = new BufferedWriter(new FileWriter("hall2_1"));
            w.write("");
            w.close();
        }
        if(x==4){
            m4.clear();
            File f=new File("hall2_2");
            BufferedWriter w = new BufferedWriter(new FileWriter("hall2_2"));
            w.write("");
            w.close();
        }
        if(x==5){
            m5.clear();
            File f=new File("hall3_1");
            BufferedWriter w = new BufferedWriter(new FileWriter("hall3_1"));
            w.write("");
            w.close();
        }
        if(x==6){
            m6.clear();
            File f=new File("hall3_2");
            BufferedWriter w = new BufferedWriter(new FileWriter("hall3_2"));
            w.write("");
            w.close();
        }
    }
}
