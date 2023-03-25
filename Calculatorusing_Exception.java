import java.util.*;
class invalidinput extends Exception{
    public  String invalidinput_Ex(){
        return "invalid input";
    }
}
class cannotdivide extends Exception{
    public String invalidinput_Ex1(){
        return "cannot divide by 0";
    }
}
class maxinput extends Exception{
    public  String invalidinput_Ex2(){
        return "input must be less than 10000";
    }
}
class multiplier extends Exception{
    public  String invalidinput_Ex3(){
        return "multiplier must be less than 7000";
    }
}
public class Calculatorusing_Exception {
    public static void addition(int a,int b) throws invalidinput,maxinput{
        double Res=0;
        if(a==8 && b==9){
            invalidinput obj=new invalidinput();
            System.out.println(obj.invalidinput_Ex());
            throw new invalidinput();
        }
        else if(a>10000 || b>10000){
            maxinput obj=new maxinput();
            System.out.println(obj.invalidinput_Ex2());
            throw new maxinput();
        }
        Res=(double)a+(double)b;
        System.out.println(Res);
    }
    public static void Subtraction(int a,int b) throws invalidinput,maxinput{
        double Res=0;
        if(a==8 && b==9){
            invalidinput obj=new invalidinput();
            System.out.println(obj.invalidinput_Ex());
            throw new invalidinput();
        }
        else if(a>10000 || b>10000){
            maxinput obj=new maxinput();
            System.out.println(obj.invalidinput_Ex2());
            throw new maxinput();
        }
        Res=(double)a-(double)b;
        System.out.println(Res);
    }
    public static void multiplication(int a,int b) throws invalidinput,maxinput, multiplier{
        double Res=0;
        if(a==8 && b==9){
            invalidinput obj=new invalidinput();
            System.out.println(obj.invalidinput_Ex());
            throw new invalidinput();
        }
        else if(a>10000 || b>10000){
            maxinput obj=new maxinput();
            System.out.println(obj.invalidinput_Ex2());
            throw new maxinput();
        }
        else if(a>7000 || b>7000){
            multiplier obj=new multiplier();
            System.out.println(obj.invalidinput_Ex3());
            throw new multiplier();
        }
        Res=(double)a*(double)b;
        System.out.println(Res);
    }
    public static void division(int a,int b) throws invalidinput,cannotdivide,maxinput{
        double Res=0;
        if(a==8 && b==9){
            invalidinput obj=new invalidinput();
            System.out.println(obj.invalidinput_Ex());
            throw new invalidinput();
        }
        else if(b==0){
            cannotdivide obj=new cannotdivide();
            System.out.println(obj.invalidinput_Ex1());
            throw new cannotdivide();
        }
        else if(a>10000 || b>10000){
            maxinput obj=new maxinput();
            System.out.println(obj.invalidinput_Ex2());
            throw new maxinput();
        }
        Res=(double)a/(double)b;
        System.out.println(Res);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("Enter :\n 1: for addition\n 2:for Subtraction \n 3: for multiplication \n 4: for division");
            int c=sc.nextInt();
            double Res=0;
            int a,b;
            switch(c){
                case 1: System.out.println("Enter first integer");
                a=sc.nextInt();
                System.out.println("Enter second integer");
                b=sc.nextInt();
                try{
                    addition(a,b);
                }
                catch(Exception e){
                    System.out.println(e);
                }
                break;
                case 2:System.out.println("Enter first integer");
                a=sc.nextInt();
                System.out.println("Enter second integer");
                b=sc.nextInt();
                try{
                    Subtraction(a, b);
                }
                catch(Exception e){
                    System.out.println(e);
                }
                break;
                case 3:System.out.println("Enter first integer");
                a=sc.nextInt();
                System.out.println("Enter second integer");
                b=sc.nextInt();
                try{
                    multiplication(a, b);
                }
                catch(Exception e){
                    System.out.println(e);
                }
                break;
                case 4:System.out.println("Enter first integer");
                a=sc.nextInt();
                System.out.println("Enter second integer");
                b=sc.nextInt();
                try{
                    division(a, b);
                }
                catch(Exception e){
                    System.out.println(e);
                }
                break;
                case 5:System.out.println("Programm End");
                System.exit(0);
                default:System.out.println("Wrong choice");
                break;
            }
        }
    }
}
