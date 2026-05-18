public class Valid_bracket_cost {

    public static void main(String[] args) {

        String st = ")(";

        int a = 2;
        int b = 3;

        int open = 0;

        int cost = 0;

        for (int i = 0; i < st.length(); i++) {

            char ch = st.charAt(i);

            if (ch == '(') {

                open++;

            } else {

                if (open > 0) {

                    open--;

                } else {

                    cost += a;
                }
            }
        }

        cost += open * b;

        System.out.println(cost);
    }
}
