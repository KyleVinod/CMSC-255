package Lab8;

public class Array {

    public static void main(String [] args) {
        String[] tokens = args[0].split(",");
        String[] customerName = new String[8];
        for (int i = 0; i <= 5; i++) {
            customerName[i] = tokens[i];
        }
        displayNames(customerName);
        customerName[6] = customerName[4];
        customerName[7] = customerName[5];
        customerName[4] = "Rick";
        customerName[5] = "Jessica";
        System.out.println(" ");
        displayNames(customerName);
        customerName = reverseNames(customerName);
        System.out.println(" ");
        displayNames(customerName);
        reverseNames2(customerName);
        System.out.println(" ");
        displayNames(customerName);
        rickGone(customerName, "Rick");
        System.out.println(" ");
        displayNames(customerName);
    }
    public static void displayNames(String[] names){
        for(String i : names) {
            System.out.println(i);
        }
    }
    public static String[] reverseNames(String[] names) {
        String[] newChange = new String[names.length];
        int i = 1;
        for (String x : names) {
            newChange[names.length - i] = x;
            i++;
        }
        return newChange;
    }
    public static void reverseNames2(String[] names) {
        for (int i = 7; i < names.length - 1; i--) {
            names[i] = names[names.length - 1 - i];
        }
    }
    public static void rickGone(String[] names, String name) {
        for (int i = 4; i < names.length; i++) {
            if (names[i] != null && names[i].equals(name)) {
                names[i] = null;
                int x = i + 1;
                while (x < names.length) {
                    String bop = names[x];
                    names[x] = names[x - 1];
                    names[x - 1] = bop;
                    x++;
                }
                i--;
            }
        }
    }
}
