import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        String[] names={"Eles","Amina","Aijan","Aika"};
        System.out.println( name(names));
    }
    static boolean name(String [] name) {
        String b = "Amina";
        for (int i = 0; i < name.length; i++) {
            if (name[i].equals(b)) {
                return true;
            }
        }
return false;

    }}