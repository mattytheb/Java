//Write a program that takes as command-line arguments an interger n and a floating-point number p (0-1), 
//plots n equally spaced points on the circmference of a circle, and then with probability p for each pair of points, 
//draws a line connecting them
//18th, June 2018

public class PlotLinesInCircle
{
      public static void main(String[] args)
      {
          int n = Integer.parseInt(args[0]);
          double angle= 360.00/n;
          float p =Float.parseFloat(args[1]);
                    
          StdDraw.setXscale(-1.0, 1.0);
          StdDraw.setYscale(-1.0, 1.0);
          StdDraw.enableDoubleBuffering();
          
         //set array of points
          double [][]points=new double[n][2];
          
          //fill the array of points
          double a=0.0;
          for (int i=0; i<n;i++)
          {             
              points[i][0]= 0.0 + 0.5*Math.cos(a);
              points[i][1] = 0.0 + 0.5*Math.sin(a);
              a+=angle;
          }
         
          //draw points from array
          for(int i=0;i<n; i++)
          {
              StdDraw.point(points[i][0],points[i][1]);
              StdDraw.show();
          }
          
          //iterate over each point and draw lines if its within probability
          for(int i=0;i<n;i++)
              {
               for(int j=0;j<n;j++)
               {
                if (Math.random()<=p)
                {
                   StdDraw.line(points[i][0],points[i][1],points[j][0],points[j][1]);
                   StdDraw.show();
                }
               }
          }
          

          
      }
}
