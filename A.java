// class Hello{

//     int age=15;
//     void data(){
//         System.out.println(this);
//     }
//     public static void main(String[] args) {
//       Hello obj=new Hello();
//         obj.data();
//         System.out.println(obj);
//     }

// }
// class student{
//     int age;
//     student( int age){
//         this.age=age;
//     }
// void print(){
//     System.out.println(age);
// }
// class Main{
//     public static void main(String[] args) {
//         student obj=new student(16);
//         obj.print();
//     }
// }
// }
class Vehicle{
    void run(){
        System.out.println("can i drve");
    }

}
class Bike extends Vehicle{
    void run(){
        System.out.println("ye bhi chati haii");
    }
}
class Main{
    public static void main(String[] args) {
        Vehicle obj=new bike();
    }
}












