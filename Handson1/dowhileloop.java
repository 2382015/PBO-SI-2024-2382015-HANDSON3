package Handson1;

public class dowhileloop {
    public static void main(String[] args) {
        String[] buah = {"Apel", "pisang", "Mangga", "jeruk"};

        // Menggunakan do-while loop
        System.out.println("\nMenggunakan do-while loop");
        int i = 0;
        do {
            System.out.println(buah[i]);
            i++;
        } while (i < buah.length);
    }
}
