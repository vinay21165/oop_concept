
 import java.util.Scanner;
 
 public class Abstract_Q3{
 
     public static void main(String[] args) {
         //Book new_novel=new Book(); This line prHMain.java:25: error: Book is abstract; cannot be instantiated
         Scanner sc = new Scanner(System.in);
         String title = sc.nextLine();
         MyBook new_novel = new MyBook();
         new_novel.setTitle(title);
         System.out.println("The title is: " + new_novel.getTitle());
         sc.close();
 
     }
 }
 
 abstract class Book {
     String title;
 
     String getTitle() {
         return title;
     }
 
     abstract void setTitle(String s);
 
 }
 
 class MyBook extends Book {
 
     void setTitle(String s) {
         title = s;
     }
 }
