package Core_Java;

import java.util.Scanner;
import java.util.Stack;
import java.util.UUID;

class info {
    String id;
    String name;
    int age;
    String diseasename;
    int phoneno;
    int fee;
    
    public info(String id, String name, int age, String diseasename, int phoneno, int fee) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.diseasename = diseasename;
        this.phoneno = phoneno;
        this.fee = fee;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDiseasename() {
        return diseasename;
    }

    public void setDiseasename(String diseasename) {
        this.diseasename = diseasename;
    }

    public int getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(int phoneno) {
        this.phoneno = phoneno;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    
}
public class medical_Shop1 {
    static Stack<info> s = new Stack<>();

    public static info eInfo() {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        Scanner sc4 = new Scanner(System.in);
        Scanner sc5 = new Scanner(System.in);

        System.out.println("Enter the Details :- ");
        String id = UUID.randomUUID().toString();

        System.out.println("Enter Name : ");
        String name = sc1.nextLine();

        System.out.println("Enter Age : ");
        int age = sc2.nextInt();

        System.out.println("Enter Disease Name :");
        String diseasename = sc3.nextLine();

        System.out.println("Enter Phone no : ");
        int phoneno = sc4.nextInt();

        System.out.println("Enter Fee Amounrt : ");
        int fee = sc5.nextInt();

        info data = new info(id, name, age, diseasename, phoneno, fee);

        sc1.close();
        sc2.close();
        sc3.close();
        sc4.close();
        sc5.close();

        return data;
    }
    public static void main(String[] args) {
        info data = eInfo();
        s.push(data);

        s.forEach(e -> {
            System.out.println("Patient Infomation :- ");
            System.out.println("ID : " + e.getId());
            System.out.println("Name : " + e.getName());
            System.out.println("Age : " + e.getAge());
            System.out.println("Disease : " + e.getDiseasename());
            System.out.println("Phone Number : " + e.getPhoneno());
            System.out.println("Fee Amount : " + e.getFee());
        });
    }
}
