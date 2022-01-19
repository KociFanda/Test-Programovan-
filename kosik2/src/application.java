import java.sql.SQLOutput;
import java.util.Scanner;

public class application {
        public static void start(){
            Scanner sc = new Scanner(System.in);

            Integer input_2;
            Integer input_1=0;


            System.out.println("Nákupní košík,\b");
            System.out.println("----------------------------------------------------");


            while(input_1 != 5) {
                System.out.println("Seznam produktů:");
                System.out.println("1.Rohlík-5kč");
                System.out.println("2.Brambory-30kč/kg");
                System.out.println("3.Kuře-80kč");
                System.out.println("4.Mléko-50kč/l");
                System.out.println("5.Zaplatit");
                System.out.println("-----------------------------------------------------");
                System.out.println("co si chcete koupit ? ");
                input_1 = sc.nextInt();

                switch (input_1) {
                    case 1:
                        System.out.println("Vybral jsi Rohlík");

                        System.out.println("1.Vložit do košíku");
                        System.out.println("2.odebrat z košíku");
                        input_2 = sc.nextInt();
                        if (input_2 == 1) {
                            nakupni_kosik_utills.kosak_plus("Rohlík");
                        } else if (input_2 == 2) {
                            //nakupni_kosik -Rohlik
                        } else {
                            System.out.println("Neplatná volba");
                        }

                        System.out.println("Ve vašem košíku je:");
                        nakupni_kosik_utills.kosak_print();

                        break;
                    case 2:
                        System.out.println("Vybral jsi Brambory");

                        System.out.println("1.Vložit do košíku");
                        System.out.println("2.odebrat z košíku");
                        input_2 = sc.nextInt();
                        if (input_2 == 1) {
                            nakupni_kosik_utills.kosak_plus("Brambory");
                        } else if (input_2 == 2) {
                            //nakupni_kosik - Brambory
                        } else {
                            System.out.println("Neplatná volba");
                        }

                        System.out.println("Ve vašem košíku je:");
                        nakupni_kosik_utills.kosak_print();

                }

            }

        }
    }


