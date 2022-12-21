public class RemoveCharacter{
  public static void main(String[] args)
  {
    String inputString = "My name is Sakshi";
    char ch = 'm';
    String result = removeCharacter(inputString,ch);
    System.out.println("After removing character '"+ch+"' from the input String"+inputString+"' the result will be \n"+result);
  }
  public static String removeCharacter(String str, char ch)
  {
    String result = str.replace(ch+"","");
    return result;
  }
}
