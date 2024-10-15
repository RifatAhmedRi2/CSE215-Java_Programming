import java.util.Scanner;

public class ConvexPolygon

{
     public static void main(String args[])
     {
          Scanner input=new Scanner(System.in);
          double xCor[];
          double yCor[];
          double area=0;

          //Prompt the user to enter the number of points in a convex polygon
          System.out.print("Enter the number of the points: ");
          int noOfPoints=input.nextInt();

          //Create space to store points
          xCor=new double[noOfPoints];
          yCor=new double[noOfPoints];

          //Prompt the user to enter the points clockwise
          System.out.println("\nEnter the coordinates of the points:");
          for(int i=0;i<noOfPoints;i++)
          {
              xCor[i]=input.nextDouble();
              yCor[i]=input.nextDouble();
          }

          //calculate area of each triangle and add it to area.
          for(int i=1;i<noOfPoints-1;i++)
          {
              //Calculate area of the triangle using
              //Formula: area=|((x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2))/2|
              double temp=(xCor[0]*(yCor[i]-yCor[i+1])+xCor[i]*(yCor[i+1]-yCor[0])+xCor[i+1]*(yCor[0]-yCor[i]))/2;
              area+=Math.abs(temp);
          }

          System.out.printf("\nThe total area is %.3f\n",area);

     }
}

