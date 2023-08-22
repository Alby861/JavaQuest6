
public class Wilder {

    private String firstName;
    private boolean present;

    public Wilder(String firstName, boolean present) {
        this.firstName = firstName;
        this.present = present;
    }

    public String getName() {
        return this.firstName;
    }

    public boolean isPresent() {
        return present;
    }


        public String whoAmI() {
            String presentStatus = (present) ? "present" : "not present";
            return "My name is " + this.firstName + " and I am " + presentStatus;
        }

        public static void main(String[] args) {
            Wilder wilder = new Wilder("John", true);
            System.out.println("name " + wilder.getName());
            System.out.println("Present: " + wilder.isPresent());
            System.out.println(wilder.whoAmI());
        }
    }
