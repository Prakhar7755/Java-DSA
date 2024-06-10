import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        var st = new HashSet<String>();

        st.add("James");
        st.add("Scott");
        st.add("James");
        System.out.println(st); /* [James, Scott] */

        System.out.println(st.contains("James")); // true
        System.out.println(st.size()); // 2

        st.remove("James");
        System.out.println(st); /* [Scott] */

        st.add("Mark");


        for(String s : st){
            System.out.println(s);// Mark, Scott
        }


    }
}