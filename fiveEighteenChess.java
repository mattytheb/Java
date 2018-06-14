public class fiveEighteenChess
{
      public static void main(String[] args)
      {
          int squares = Integer.parseInt(args[0]);
          double divs = 1.0/squares;
          int colour = 1;
          
          StdDraw.setXscale(-1.0, 1.0);
          StdDraw.setYscale(-1.0, 1.0);
          StdDraw.enableDoubleBuffering();
          

          for (int i=0; i<squares; i++)
                  {
          if(squares%2==0)
          {
          for (int j=0; j<squares; j++)
          {

                   if(colour%2!=0)
                   {
                   StdDraw.setPenColor(StdDraw.RED);
                   StdDraw.filledSquare((-0.8+(2*i*divs)),(-0.8+(2*j*divs)), divs);
                   StdDraw.show();
                   }
                   
                   else if(colour%2==0)
                   {
                   StdDraw.setPenColor(StdDraw.WHITE);
                   StdDraw.filledSquare((-0.8+(2*i*divs)),(-0.8+(2*j*divs)), divs);
                   StdDraw.show();
                   }
                   colour++;
                   }
          colour++;
          }
          
          else
          {
                    for (int j=0; j<squares; j++)
          {

                   if(colour%2!=0)
                   {
                   StdDraw.setPenColor(StdDraw.RED);
                   StdDraw.filledSquare((-0.8+(2*i*divs)),(-0.8+(2*j*divs)), divs);
                   StdDraw.show();
                   }
                   
                   else if(colour%2==0)
                   {
                   StdDraw.setPenColor(StdDraw.WHITE);
                   StdDraw.filledSquare((-0.8+(2*i*divs)),(-0.8+(2*j*divs)), divs);
                   StdDraw.show();
                   }
                   colour++;
                   }
          }
          }
      }
}