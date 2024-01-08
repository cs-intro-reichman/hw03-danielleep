public class UniqueChars 
{
    public static void main(String[] args) 
    {
        String old= args[0];
        String unique ="";
        char ch='a';
        int counter=0;
        for(int i=0;i<old.length();i++)
        {
            ch=old.charAt(i);
            if (ch==' ')
            {
                System.out.print(" ");
            }
            for(int j=0;j<unique.length();j++)
            {
                if(unique.charAt(j)==ch)
                {
                    counter++;
                }
            }
            if (counter==0)
            {
                unique=unique+ch;
                System.out.print(ch);;
            }
            counter=0;   
        }
    }        
}
