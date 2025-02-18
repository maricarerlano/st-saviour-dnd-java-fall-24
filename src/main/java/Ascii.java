
public class Ascii {
    
    public static void drawD20(int value) {
        if(value > 9) {
            String d20 = String.format("            ,:::,\r\n" + //
                      "       ,,,:;  :  ;:,,, \r\n" + //
                      "   ,,,:       :       :,,, \r\n" + //
                      ",,;...........:...........;,,\r\n" + //
                      "; ;          ;';          ; ;\r\n" + //
                      ";  ;        ;   ;        ;  ;\r\n" + //
                      ";   ;      ;     ;      ;   ;\r\n" + //
                      ";    ;    ;       ;    ;    ;\r\n" + //
                      ";     ;  ;   %s    ;  ;     ;\r\n" + //
                      ";      ;:...........:;      ;\r\n" + //
                      ";     , ;           ; ,     ;\r\n" + //
                      ";   ,'   ;         ;   ',   ;\r\n" + //
                      "'';'      ;       ;      ';''\r\n" + //
                      "   ''';    ;     ;    ;'''         \r\n" + //
                      "       ''':;;   ;;:'''\r\n" + //
                      "            ':::'", value);
                      
            System.out.println(d20);
        } else {
            String d20 = String.format("            ,:::,\r\n" + //
                      "       ,,,:;  :  ;:,,, \r\n" + //
                      "   ,,,:       :       :,,, \r\n" + //
                      ",,;...........:...........;,,\r\n" + //
                      "; ;          ;';          ; ;\r\n" + //
                      ";  ;        ;   ;        ;  ;\r\n" + //
                      ";   ;      ;     ;      ;   ;\r\n" + //
                      ";    ;    ;       ;    ;    ;\r\n" + //
                      ";     ;  ;    %s    ;  ;     ;\r\n" + //
                      ";      ;:...........:;      ;\r\n" + //
                      ";     , ;           ; ,     ;\r\n" + //
                      ";   ,'   ;         ;   ',   ;\r\n" + //
                      "'';'      ;       ;      ';''\r\n" + //
                      "   ''';    ;     ;    ;'''         \r\n" + //
                      "       ''':;;   ;;:'''\r\n" + //
                      "            ':::'", value);

        System.out.println(d20);
        }   
    }

    public static void drawD6(int value) {
        String d6 = String.format(" ::::::::::::::\r\n" + //
                        " ::          ::  \r\n" + //
                        " ::          ::\r\n" + //
                        " ::    %s     ::\r\n" + //
                        " ::          ::\r\n" + //
                        " ::          ::                \r\n" + //
                        " :::::::::::::: ", value);
        System.out.println(d6);
    }

    public static void drawD4(int value) {
        String d4 = String.format("          ;;\r\n" + //
                        "        ,;  ;,\r\n" + //
                        "       ,;    ;,\r\n" + //
                        "      ,;      ;,\r\n" + //
                        "     ,;        ;,\r\n" + //
                        "    ,;          ;, \r\n" + //
                        "   ,;     %s      ;,\r\n" + //
                        "  ,;              ;,\r\n" + //
                        " ,;                ;, \r\n" + //
                        ",;                  ;,\r\n" + //
                        "::::::::::::::::::::::", value);
        System.out.println(d4);
    }
   
    public static void drawTitle() {
        String Title =
            "______________ ______________ .____       _____    ___________________ ________ ___________  ____ ___ _________\n" +
            "\\__    ___/   |   \\_   _____/ |    |     /  _  \\  /   _____\\__    ___/ \\_____  \\\\_   _____/ |    |   /   _____/\n" +
            "  |    | /    ~    |    __)_  |    |    /  /_\\  \\ \\_____  \\  |    |     /   |   \\|    __)   |    |   \\_____  \\ \n" +
            "  |    | \\    Y    |        \\ |    |___/    |    \\/        \\ |    |    /    |    |     \\    |    |  //        \\\n" +
            "  |____|  \\___|_  /_______  / |_______ \\____|__  /_______  / |____|    \\_______  \\___  /    |______//_______  /\n" +
            "                \\/        \\/          \\/       \\/        \\/                    \\/    \\/                     \\/  \n";

        System.out.println(Title);
    }
    

}
