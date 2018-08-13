public class CountMovieSpaces {
    public static void mai(String[] args)
    {
        String aString = "There's no place like home.";
        int numSpaces = 0;
        int StringLengh = aString.length();
        for (int i = 0; i < StringLengh; i++)
        {
            char ch = aString.charAt(i);
            if (ch == ' ')
            {
                numSpaces++;
            }
        }
        System.out.println("The number of spaces is " + numSpaces);
    }
}
