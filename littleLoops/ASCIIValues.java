public class ASCIIValues{
    public static void main(String[] args){

        for (char character = 'A'; character <= 'Z'; character++){
            int asciiValue = (int) character;
            System.out.println(character + " = " + asciiValue);
        }

    }
}
