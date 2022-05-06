package Core_Java;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.UUID;

public class medical_Shop {
        static Queue<details> q = new ArrayDeque<>();

        public static details inputDetails() {
            Scanner sc1 = new Scanner(System.in);
            Scanner sc2 = new Scanner(System.in);
            Scanner sc3 = new Scanner(System.in);
            Scanner sc4 = new Scanner(System.in);
            Scanner sc5 = new Scanner(System.in);

            String id = UUID.randomUUID().toString();

            System.out.println("Enter Name : ");
            String name = sc1.nextLine();

            System.out.println("Enter age : ");
            int age = sc2.nextInt();

            System.out.println("Enter Disease Name : ");
            String diseasename = sc3.nextLine();

            System.out.println("Enter Phone Number ");
            int phoneno = sc4.nextInt();

            details d = new details(id, name, age, diseasename, phoneno);

            sc1.close();
            sc2.close();
            sc3.close();
            sc4.close();
            return d;
        }
        public static void main(String[] args) {
            details d = inputDetails();

            q.add(d);

            q.forEach(e -> {
                System.out.println("Patient Details :-");
                System.out.println("ID : " + e.getId());
                System.out.println("Name : " + e.getName());
                System.out.println("Disease : " + e.getDiseasename());
                System.out.println("Phone no : " + e.getPhoneno());
            });
        }
}

class details {
    String id;
    String name;
    int age;
    String diseasename;
    int phoneno;

    public details(String id, String name, int age, String diseasename, int phoneno) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.diseasename = diseasename;
        this.phoneno = phoneno;
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
}