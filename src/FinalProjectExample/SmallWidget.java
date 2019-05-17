package FinalProjectExample;

public class SmallWidget {
    public static void main(String[] args) {

        Spring springA = new Spring("coil", 1, 2,
                "stainless steel", 3, 1);
        Spring springB = new Spring("coil", 1, 2,
                "stainless steel", 3, 1);

        System.out.println(springB.toString());
        System.out.println("springB = " + springB.type + springB.heigth);


    }
}
