import simple_wrappers.Simple_wrappers;
import StringBuilder.StringBuilder;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception{

        StringBuilder str_b_no_cap = new StringBuilder(10);
        System.out.println(str_b_no_cap.capacity);
        str_b_no_cap.append('d');
        str_b_no_cap.append('a');
        str_b_no_cap.append("ada");
        System.out.println((char[]) str_b_no_cap.getStringBuilder());




    }
        
}
