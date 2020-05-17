import java.util.Scanner;

public class MainClass
{
  public static void main(String[] args)
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt(),k=in.nextInt();
    int answer=0;
    int page=1;

    for(int chapter=1;chapter<=n;chapter++)
    {
      int problems=in.nextInt();
      for(int index=1;index<=problems;index++)
      {
        if(index==page)
        {
          answer++;
        }
        if(index==problems||index%k==0)
        {
          page++;
        }
      }
    }

    System.out.println(answer);
  }


}
