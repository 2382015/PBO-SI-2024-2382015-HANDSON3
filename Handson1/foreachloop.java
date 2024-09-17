package Handson1;

public class foreachloop {
    public static void main(String[] args) {
        String[] buah = {"Apel", "pisang", "Mangga", "jeruk"};

        // Menggunakan foreach loop
        System.out.println("\nMenggunakan foreach loop:");
        for (String b : buah) {
            System.out.println(b);
        }
    }
}