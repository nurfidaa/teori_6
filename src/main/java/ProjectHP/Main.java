package ProjectHP;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Catatan nama
        System.out.println("Program WahyuNurfida_2211103052_SI 6 B");

        // Pilih HP
        System.out.println("Pilih HP:");
        System.out.println("1. Samsung");
        System.out.println("2. iPhone");
        System.out.println("3. Oppo");
        System.out.println("4. Xiaomi");
        int pilihan = scanner.nextInt();

        // Buat objek HP
        Phone phone;
        switch (pilihan) {
            case 1:
                phone = new Xiaomi();
                break;
            case 2:
                phone = new Iphone();
                break;
            case 3:
                phone = new Samsung();
                break;
            case 4:
                phone = new Oppo();
                break;
            default:
                System.out.println("Pilihan tidak valid");
                return;
        }

        // Buat objek PhoneUser
        PhoneUser phoneUser = new PhoneUser(phone);

        // Mematikan dan menyalakan HP
        System.out.println("Apakah ingin mematikan HP? (y/n)");
        String input = scanner.next();
        if (input.equals("y")) {
            phoneUser.turnOffPhone();
        } else {
            phoneUser.turnOnPhone();
        }

        // Menaikkan dan menurunkan volume HP
        System.out.println("Apakah ingin menaikkan volume HP? (y/n)");
        input = scanner.next();
        if (input.equals("y")) {
            phoneUser.makePhoneLouder();
        } else {
            phoneUser.makePhoneSilent();
        }

        // Mendapatkan nilai volume
        System.out.println("Volume HP saat ini: " + phone.getVolume());
    }
}