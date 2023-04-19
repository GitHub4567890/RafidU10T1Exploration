public class StringFun
{
    public static void main(String [] args)
    {
        System.out.println(mysteryString("xyzxyxy"));
    }

    public static int mysteryString(String str)
    {
        if (str.length() == 1)
        {
            if (str.substring(0, 1).equals("y"))
            {
                System.out.println("a");
                return 1;
            }
            else
            {
                System.out.println("b");
                return 0;
            }
        }
        else
        {
            if (str.substring(0, 1).equals("y"))
            {
                System.out.println("c");
                return 1 + mysteryString(str.substring(1));
            }
            else
            {
                System.out.println("d");
                return mysteryString(str.substring(1));
            }
        }
    }
}
