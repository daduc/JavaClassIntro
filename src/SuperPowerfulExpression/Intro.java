package SuperPowerfulExpression;

public class Intro {
    public static void main(String[] args) {
        SomethingToDo(1);
        SomethingToDo(35);
        SomethingToDo(15);
        SomethingToDo(3);
        SomethingToDo(101);
        System.out.println(superPowerfulEx("ello Bobby"));
    }
        public static void SomethingToDo(int userInput){

            if (userInput > 0 && userInput < 30) {
                System.out.println("Is Greater Than Zero" + "But Less Than Thirty");

            }
            if (userInput > 30 || userInput > 100) {
                System.out.println("is greater Than 30 " + "but less than one hunt it");
            }


            }
     public static String superPowerfulEx(String name){
        return name;
     }
            }



