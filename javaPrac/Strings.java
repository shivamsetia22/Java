import java.util.Scanner;

public class Strings {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();

        // System.out.println("Your name is : " + name);

        // String name = "Shivam";
        // String fullName = "Shivam Setia";

        // String firstName = "Tony";
        // String lastName = "Stark";
        // String fullName = firstName + " " + lastName;
        // System.out.println(fullName.length() );

        // for(int i=0; i<fullName.length(); i++){
        //     System.out.println(fullName.charAt(i));
        // }

        // String name1 = "Tony";
        // String name2 = "Tony";

        // if(name1.compareTo(name2) == 0){
        //     System.out.println("Equal");
        // } else {
        //     System.out.println("Not Equal");
        // }


        //StringBuilder


        StringBuilder sb = new StringBuilder("hello");
        System.out.println(sb);

        // System.out.println(sb.charAt(0));

        // sb.setCharAt(0, 'S');
        // System.out.println(sb);

        // sb.insert(2, 'n');
        // System.out.println(sb);

        // sb.delete(2, 3);
        // System.out.println(sb);

        // sb.append("o");
        // System.out.println(sb);

        sb.reverse();
        System.out.println(sb);
    }
}
