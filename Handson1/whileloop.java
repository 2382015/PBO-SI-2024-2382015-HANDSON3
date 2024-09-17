package Handson1;

public class whileloop {
    public static void main(String[] args) {
        String[] buah = {"Apel", "pisang", "Mangga", "jeruk"};

        // Menggunakan While loop
        System.out.println("\nMenggunakan while loop:");
        int i = 0;
        while (i < buah.length) {
            System.out.println(buah[i]);
            i++;
        }
    }
}
