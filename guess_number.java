import java.util.Random;
import java.util.*;
class Number{
    int flag=0,i=0;
    int num,n,cha;
    public  Number(){
    Random rn=new Random();
    num=rn.nextInt(0,100);
    }
    public void takeUserinput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("guess a number in between 0 to 100");
        n=sc.nextInt();
    }
    public void setNoofguess(int chance){
        cha=chance;
    }
    public int getNoofguess(){
        return cha-i;
    }
    public void iscorrect(){
        // Number obj=new Number();
        while(i<cha){
            System.out.println("You have "+getNoofguess()+" chances");
            takeUserinput();
            if(num==n){
                flag=1;
                System.out.println("you guesed in "+(i+1)+" no of step");
                break;
            }
            else if(num<n){
                System.out.println("Enter small number");
            }
            else{
                System.out.println("Enter greater number");
            }
            i+=1;
        }
    }
}
public class guess_number {
    public static void main(String[] args) {
        Number obj=new Number();
        obj.setNoofguess(10);
        obj.iscorrect();
    }
}