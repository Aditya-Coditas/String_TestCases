import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;
@RunWith(Parameterized.class)
public class TestStringOperations {
    public String s1;
    public String s2;
    public String s3;
    public String s4;
    public String s5;
    public String s6;
    public char   ch;
    public int    oc;
    static int ptc,ftc;
    static StringOprations so;
    static TestStringOperations tso;

    TestStringOperations(){

    }

    @BeforeClass
    public static void init()
    {
        so=new StringOprations();
        ptc=ftc=0;
    }

    public TestStringOperations(String s1, String s2, String s3, String s4, String s5, String s6, char ch,int oc) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.s4 = s4;
        this.s5 = s5;
        this.s6 = s6;
        this.ch = ch;
        this.oc = oc;
    }

    @Parameterized.Parameters
    public static Collection getInputs()
    {
        return Arrays.asList(new Object[][]{
                {"Aditya","Aditya","y","aytidA","Aditya,Botre",",",'a',1},
                {"Aditya","Adi","xxx","aytidA","Aditya,Botre",".",'a',2},
                {"Aditya","xz","xxx","ytidA","Aditya,Botre",",",'a',1}
        });
    }

    @Test
    public void spellCheck()
    {
        ftc++;
        assertTrue(so.spellCheck(s1,s2));
        System.out.println("Spelling is Correct !!! Pass");
        ptc++;
    }

    @Test
    public void isContain()
    {
        ftc++;
        assertTrue(so.isContain(s1,s2));
        System.out.println(s1+" Contains "+s2+" Pass !!!");
        ptc++;
    }

    @Test
    public void isReplace()
    {
        ftc++;
        assertNotNull(so.getReplaced(s1,s2,s3));
        System.out.println("The Replaced String is "+so.getReplaced(s1,s2,s3)+" Pass!!!");
        ptc++;
    }

    @Test
    public void isStringEmpty()
    {
        ftc++;
        assertTrue(s1.isEmpty());
        assertTrue(s2.isEmpty());
        assertTrue(s3.isEmpty());
        System.out.println("The String is Empty Pass!!!");
        ptc++;
    }

    @Test
    public void isStringNotEmpty()
    {
        ftc++;
        assertFalse(s1.isEmpty());
        assertFalse(s2.isEmpty());
        assertFalse(s3.isEmpty());
        System.out.println("The String is not empty Pass!!!");
        ptc++;
    }

    @Test
    public void reverse()
    {
        ftc++;
        assertEquals(so.reverse(s1),s4);
        System.out.println("Both String is matching Pass!!!");
        ptc++;
    }

    @Test
    public void charOccurance()
    {
        ftc++;
        assertEquals(oc,so.charOccurance(s1,ch));
        System.out.println("Character "+ch+" Occured "+oc+" Times Pass!!!");
        ptc++;
    }

    @Test
    public void checkSplit()
    {
        ftc++;
        String []str1={"Aditya","Botre"};
        assertArrayEquals(so.getSplit(s5,s6),str1);
        System.out.println("Split Running Sucessfully Pass!!!");
        ptc++;
    }

    @AfterClass
    public static void testCasesDetails()
    {
        System.out.println("=============================================================");
        System.out.println("Total Test Cases "+ftc);
        System.out.println("Pass  Test Cases "+ptc);
        System.out.println("Fail  Test Cases "+(ftc-ptc));
        System.out.println("=============================================================");
    }

}
