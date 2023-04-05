import java.time.LocalDateTime;
import java.util.*;
class Online_M{
    ArrayList<Object> book=new ArrayList<>();
    Scanner sc=new Scanner(System.in);
    LocalDateTime dt=LocalDateTime.now();
    void add_Book(){
        System.out.println("Enter which book you want to add");
        String Boobs=sc.nextLine();
        book.add(Boobs);
    }
    void available_Book(){
        if(book==null){
            System.out.println("No book is not available in libray");
        }
        else{
        for(Object str: book)
        System.out.println(str);
        }
    }
    void issued_book(){
        System.out.println("Enter Your name");
        String name=sc.nextLine();
        System.out.println("Enter which book you want to issue");
        String issu_book=sc.nextLine();
        System.out.println("Enter author name");
        String author=sc.nextLine();
        int flag=0;
        
        for(Object str: book){
            if(str.equals(issu_book)){
                flag=1;
                break;
            }
        }
        if(flag==1){
            book.remove(issu_book);
            System.out.println("Your book "+issu_book+" Author is "+author+" is sucessfully issued on "+dt+" Issued to "+name);
        }
        else{
            System.out.println("You searched book is not found in libray");
        }
    }
    void return_issued_Book(){
        System.out.println("Enter your name");
        String name=sc.nextLine();
        System.out.println("Enter which book you want to return");
        String return_book=sc.nextLine();
        System.out.println("Enter author name");
        String author=sc.nextLine();
        book.add(return_book);
        System.out.println(name+" return his/her "+return_book+ " Author is  "+author+" is suceesfully returned on "+dt+" Returned by "+name);
    }
}
public class OnlineLibrayMAnagament {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Online_M obj=new Online_M();
        while(true){
            System.out.println("Enter:\n  1:Add Book\n  2:To see available book\n  3:Issue book\n  4:return book");
            int c=sc.nextInt();
            switch(c){
                case 1:
                obj.add_Book();
                break;
                case 2:obj.available_Book();
                break;
                case 3:
                obj.issued_book();
                break;
                case 4:
                obj.return_issued_Book();
                break;
                case 5:System.out.println("You exit from Libray");
                System.exit(0);
                default:System.out.println("You'r choice is wrong");
                break;
            }
        }
    }
}
