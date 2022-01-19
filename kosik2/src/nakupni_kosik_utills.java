public class nakupni_kosik_utills {
    static String nakupni_kosik[] = new String[15];
    static Integer pozice = 1;

    public static void kosak_plus(String vyber) {

        nakupni_kosik[pozice] = vyber;
        pozice++;
    }

    // public static void kosak_minus(String vyber) {
//
    //    nakupni_kosik[pozice] = vyber;
    //    pozice++;
    // }

    public static void kosak_print() {

        for (int i = 1; i <= nakupni_kosik.length - 1; i++) {

            if (nakupni_kosik[i] != null) {
                System.out.println(nakupni_kosik[i]);
            } else {
            }

        }

    }


}
