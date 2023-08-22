public class Classroom {





    public static void main(String[] args) {
        Wilder wilder1 = new Wilder("Alberto", true);
        Wilder wilder2 = new Wilder("Carlo", false);
        Wilder wilder3 = new Wilder("Jules", true);
        Wilder wilder4 = new Wilder("Lucy", true);
        Wilder wilder5 = new Wilder("Melany", false);
        System.out.println("name " + wilder1.getName());
        System.out.println("Present: " + wilder1.isPresent());
        System.out.println(wilder1.whoAmI());
        System.out.println("name " + wilder2.getName());
        System.out.println("Present: " + wilder2.isPresent());
        System.out.println(wilder2.whoAmI());
        System.out.println("name " + wilder3.getName());
        System.out.println("Present: " + wilder3.isPresent());
        System.out.println(wilder3.whoAmI());
        System.out.println("name " + wilder4.getName());
        System.out.println("Present: " + wilder4.isPresent());
        System.out.println(wilder4.whoAmI());
        System.out.println("name " + wilder5.getName());
        System.out.println("Present: " + wilder5.isPresent());
        System.out.println(wilder5.whoAmI());
    }
}
