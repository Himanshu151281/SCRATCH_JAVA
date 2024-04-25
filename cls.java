public class cls {
    private String name;
    private  int age;

    public cls(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void show(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }

    public static void main(String args[]){
    cls obj = new cls("Aga", 20);
    obj.show();
}
}


