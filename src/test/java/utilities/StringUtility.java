package utilities;

public class StringUtility {

    public static void verifyEquals(String expected, String actual){
        if(expected.equalsIgnoreCase(actual)){
            System.out.println("PASS");

        }else{
            System.out.println("FAIL");
        }
        System.out.println("Expected Text: "+expected);
        System.out.println("Actual Text: "+actual);

    }
}
