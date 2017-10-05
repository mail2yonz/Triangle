import java.util.Scanner;

public class EqulateralCheck {

    //This program ditermines if a triangle is equilateral or right angle or not

    public static void main(String args[])
    {
        System.out.println("Please Enter the first side of the triangele");
        Scanner keyboard= new Scanner(System.in);
        int a= keyboard.nextInt();
        System.out.println("Please Enter the second side of the triangele");
        keyboard= new Scanner(System.in);
        int b= keyboard.nextInt();

        System.out.println("Please Enter the third side of the triangele");
         keyboard= new Scanner(System.in);
        int c = keyboard.nextInt();

       isEqulateral( a,b, c);
    }
    private static void  isEqulateral(int side,int hight,int hypo)

    {

        double sSqr = Math.pow(side, 2);
        double hSqr = Math.pow(hight, 2);
        double hySqr = Math.pow(hypo, 2);
        if (side == hight && hight == hypo) {
            System.out.println( "IS equlateral");
        }else if (hySqr == (hSqr + sSqr)) {
            System.out.println("Is Right TriAngle");
        } else {
            System.out.println("is not Right Angle or equlateral triangle");
        }


    }
}
