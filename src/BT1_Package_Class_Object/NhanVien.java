package BT1_Package_Class_Object;

public class NhanVien {
    String name = "Tiến";
    int age = 23;
    String birthday = "17/06/2000";
    String homeTown = "Gia Lai";

    public NhanVien(){

    }

    public NhanVien(String name, int age, String homeTown){
        this.name = name;
        this.age = age;
        this.homeTown = homeTown;
    }

    public void getInfo(){
        System.out.println("Name: " +name);
        System.out.println("Age: " +age);
        System.out.println("Birthey: "+birthday);
        System.out.println("Home Town: " +homeTown);
    }
}
