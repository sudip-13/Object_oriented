import java.util.*;
class Library{
    int size ;
    String [] Books;
    int i;
    Library(){
        this.Books= new String[100];
        this.size=0;
    }
    Scanner sc=new Scanner(System.in);
    public void availableBooks(){
        System.out.println("Available Books are");
        if(size==0){
            System.out.println("No book available in Library");
        }
        else{
        for(int i=0;i<size;i++){
            System.out.print(Books[i]+"\t");
        }
        System.out.println();
        }
    }
    public void addBook(){
        System.out.println("Enter name which you want to add Library");
        String Boobs=sc.nextLine();
        this.Books[size]=Boobs;
        size+=1;
        }
    public void issueBook(){
        int flag=0;
        System.out.println("Enter the name of Book which you want to issue");
        String Boobs=sc.nextLine();
        for(i=0;i<size;i++){
            if(Boobs.equals(Books[i])){
                flag=1;
                break;
            }
        }
        if(flag==1){
            System.out.println("You'r Book is succesfully issued ");
            for(int j=i;j<size-1;j++){
                Books[j]=Books[j+1];
            }
            size-=1;
        }
        else{
            System.out.println("Book is not available");
        }
    }
    public void returnBook(){
        System.out.println("Enter which book you want to return");
        String Boobs=sc.nextLine();
        this.Books[size]=Boobs;
        size+=1;
        System.out.println("you'r Book is succesfully returned");
    }
}
public class OnlineLibary{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Library ob=new Library();
        while(true){
        System.out.println("Enter\n 1:for see Available Books\n 2:for issue Book\n 3:for return the Book\n 4:for add Book\n 5:for Exit");
        int c=sc.nextInt();
        switch(c){
            case 1:ob.availableBooks();
            break;
            case 2:ob.issueBook();
            break;
            case 3:ob.returnBook();
            break;
            case 4:ob.addBook();
            break;
            case 5:System.out.println("You have been exit from library");
            System.exit(0);
            }
        }   
    }
}