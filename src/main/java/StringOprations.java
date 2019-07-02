public class StringOprations {

    public boolean isContain(String s1,String s2)
    {
         if(s1.contains(s2))
             return true;
         else
             return false;
    }

    public boolean spellCheck(String s1,String s2)
    {
        if(s1.equalsIgnoreCase(s2))
            return true;
        else
            return false;
    }

    public String getReplaced(String s1,String s2,String s3)
    {
        String s4=s1.replace(s2,s3);
        if(s4.equals(s1))
            return null;
        else
            return s4;
    }

    public String reverse(String s1)
    {
        String str="";
         for(int i=s1.length()-1;i>=0;i--)
         {
             str=str+s1.charAt(i);
         }
         return str;
    }

    public int charOccurance(String s1,char ch)
    {
        int c=0;
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)==ch)
                c++;
        }
        return c;
    }

   public String[] getSplit(String s1,String s2)
   {
       String str[]=s1.split(s2);
       return str;
   }
}
