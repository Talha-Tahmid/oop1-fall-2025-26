public class StringTasks {
    public static void main(String[] args) {

        String firstName = "Talha";
        String lastName = "Tahmid";
        String fullName = firstName + " " + lastName;
        System.out.println("Full Name: " + fullName);

        String productName = "Laptop";
        int productID = 105;
        String productCode = productName + "_" + productID;
        System.out.println("Product Code: " + productCode);

        String email = "talha@gmail.com";
        String username = email.substring(0, email.indexOf('@'));
        System.out.println("Username: " + username);

        String message = "Hello AIUB!";
        int length = message.length();
        System.out.println("Total characters: " + length);

        String sentence = "AIUB is my University";
        System.out.println("Uppercase: " + sentence.toUpperCase());
        System.out.println("Lowercase: " + sentence.toLowerCase());

        String text = "I love AIUB";
        String newText = text.replace("AIUB", "Programming");
        System.out.println(newText);
    }
}
