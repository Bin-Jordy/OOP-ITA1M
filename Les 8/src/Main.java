import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ballen klaar? (ja/nee)");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (input.equals("ja")) {
            System.out.println("Rollen maar! \n");
            LottoMachine lottoMachine = new LottoMachine();

            try {
                lottoMachine.voerTrekkingUit();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
