import java.util.Scanner;

public class EVC {
    static double balance = 500;
    static Scanner input = new Scanner(System.in);
    static int coorectpin = 1234;

    public static void main(String[] args) {

        System.out.println("GELI Codka *770#");
        String CODE = input.nextLine();

        if (!CODE.equals("*770#")) {
            System.out.println("invalid");
            return;
        } else {
            System.out.println("sucesful");
        }

        int chance = 3;

        while (chance > 0) {
            System.out.print("Enter your PIN: ");
            int enterPin = input.nextInt();

            if (enterPin == coorectpin) {
                System.out.println("Gudaha ayaad u gashay");
                break;
            } else {
                chance--;
                if (chance > 0) {
                    System.out.println("PIN-ka waa qalad");
                    System.out.println("Fursadaha haray: " + chance);
                } else {
                    System.out.println("3 jeer ayaad qaladday.");
                    System.out.println("Account-ka waa la xannibay.");
                    System.exit(0);
                }
            }
        }

        while (true) {
            String[] menu = {
                    "1. itus haraaga",
                    "2. kaarka hadalka",
                    "3. bixi biil",
                    "4. u wareeji EVC Plus",
                    "5. warbixin kooban",
                    "6. salaam bank",
                    "7. mareynta",
                    "8. bill payment",
                    "9. EXIT"
            };
            System.out.println("EVC PLUS");
            for (String item : menu) {
                System.out.println(item);
            }

            System.out.println("Dooro");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    showBlance();
                    break;
                case 2:
                    airtimeMenu();
                    break;
                case 3:
                    bixibiil();
                    break;
                case 4:
                    wareejiEvc();
                    break;
                case 5:
                    warbixin();
                    break;
                case 6:
                    salaamBank();
                    break;
                case 7:
                    maareynta();
                    break;
                case 8:
                    Billpayment();
                    break;
                case 9:
                    System.out.println("Mahadsanid");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Doorashadada Wee khaldanthy");
            }
        }
    }

    public static void showBlance() {
        System.out.println("fadlan geli pin");
        int pink = input.nextInt();
        if (pink == coorectpin) {
            System.out.println("succesful");
            System.out.println("Haraagagu waa $" + balance);
        } else {
            System.out.println("pink wa qalad");
        }
    }

    public static void airtimeMenu() {
        String[] airtimeMenu = {
                "1. ku shubo airtime",
                "2. ugu shub airtime",
                "3. MIFI packages",
                "4. ku shubo internet",
                "5. ugu shub qof kale",
                "6. EXIT"
        };
        System.out.println("airtimeMenu");
        for (String item : airtimeMenu) {
            System.out.println(item);
        }

        System.out.print("Doorashadaada: ");
        int optoin = input.nextInt();

        if (optoin == 1) {
            System.out.print("Fadlan geli lacagta: ");
            double amount = input.nextDouble();
            if (amount <= 0) {
                System.out.println("lacagta wa iney ka weynata 0");
                return;
            }
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Ku shubashadu waa successful. Haraagaaga cusub: $" + balance);
            } else {
                System.out.println("Haraagagu kuguma filna!");
            }

        } else if (optoin == 2) {
            System.out.println("fadlan geli mobilka");
            String mobile = input.next();
            if (!mobile.startsWith("61") || mobile.length() != 9) {
                System.out.println("numberka wu qaldanyahay");
                return;
            }
            System.out.println("fadlan geli lacagta");
            int money = input.nextInt();
            if (money <= 0) {
                System.out.println("lacagta wa iney ka weynata 0");
                return;
            }
            System.out.println("fadlan geli pin");
            int pin = input.nextInt();
            if (pin != coorectpin) {
                System.out.println("pink wa qalad");
                return;
            }
            System.out.println("ma hubta ina ugu shubtid " + mobile);
            System.out.println("1. haa");
            System.out.println("2. maya");
            int confirm = input.nextInt();
            if (confirm == 1) {
                balance -= money;
                System.out.println("ku shubashada wa la aqbalay. Haraagaaga cusub: $" + balance);
            } else if (confirm == 2) {
                System.out.println("howlgalka laguma guleysan");
            } else {
                System.out.println("mahadsanid");
            }

        } else if (optoin == 3) {
            System.out.println("internet bundle recharge");
            System.out.println("1. isbuucle");
            System.out.println("2. maalinle");
            System.out.println("3. bille");
            System.out.println("4. EXIT");
            System.out.print("Doorashadaada: ");
            int number = input.nextInt();

            double cost = 0;
            int gb = 0;

            if (number == 1) {
                System.out.println("1. $5 = 10GB");
                System.out.println("2. $10 = 25GB");
                int bundle = input.nextInt();
                if (bundle == 1) { cost = 5; gb = 10; }
                else if (bundle == 2) { cost = 10; gb = 25; }
                else { System.out.println("doorashada waa qalad");
                    return; }

            } else if (number == 2) {
                System.out.println("1. $1 = 2GB");
                System.out.println("2. $2 = 5GB");
                int bundle = input.nextInt();
                if (bundle == 1) { cost = 1; gb = 2; }
                else if (bundle == 2) { cost = 2; gb = 5; }
                else { System.out.println("doorashada waa qalad");
                    return; }

            } else if (number == 3) {
                System.out.println("1. $20 = 40GB");
                System.out.println("2. $40 = 85GB");
                System.out.println("3. $60 = 150GB");
                System.out.println("4. $25 = monthly unlimited");
                int bundle = input.nextInt();
                if (bundle == 1) { cost = 20; gb = 40; }
                else if (bundle == 2) { cost = 40; gb = 85; }
                else if (bundle == 3) { cost = 60; gb = 150; }
                else if (bundle == 4) { cost = 25; gb = 0; }
                else { System.out.println("doorashada waa qalad");
                    return; }
            } else {
                System.out.println("doorashada waa qalad");
                return;
            }

            if (balance < cost) {
                System.out.println("Haraagagu kuguma filna!");
                return;
            }
            System.out.println("fadlan geli MIFI user");
            String num = input.next();
            if (num.startsWith("61") && num.length()==9) {
                System.out.println("MIFI userka wa qalad");
                return;
            }
            System.out.println("1. haa");
            System.out.println("2. maya");
            int confirm = input.nextInt();
            if (confirm == 1) {
                balance -= cost;
                if (gb == 0) {
                    System.out.println("monthly unlimited bundle si guul ah ayaa loo iibsaday. Haraagaaga cusub: $" + balance);
                } else {
                    System.out.println(gb + "GB bundle si guul ah ayaa loo iibsaday. Haraagaaga cusub: $" + balance);
                }
            } else {
                System.out.println("howlgalka laguma guleysan");
            }

        } else if (optoin == 4) {
            System.out.println("fadlan geli lacagta");
            int money = input.nextInt();
            if (money <= 0) {
                System.out.println("lacagta waa iney ka weynata 0");
                return;
            }
            if (money <= balance) {
                balance -= money;
                System.out.println("waxa ku shubatay " + money + " haragaga cusub waa: $" + balance);
            } else {
                System.out.println("haragagu kuguma filno");
            }

        } else if (optoin == 5) {
            System.out.println("fadlan geli mobilka qofka lacagta loo diri doono");
            String mobile = input.next();
            if (!mobile.startsWith("61") || mobile.length() != 9) {
                System.out.println("numberka wu qaldanyahay");
                return;
            }
            System.out.println("fadlan geli lacagta aad ugu shubi doonto");
            double amount = input.nextDouble();
            if (amount <= 0) {
                System.out.println("lacagta wa iney ka weynata 0");
                return;
            }
            if (amount > balance) {
                System.out.println("Haraagagu kuguma filna");
                return;
            }
            System.out.println("fadlan geli pin");
            int pin = input.nextInt();
            if (pin != coorectpin) {
                System.out.println("pink wa qalad");
                return;
            }
            System.out.println("ma hubta inaad $" + amount + " ugu shubeyso " + mobile);
            System.out.println("1. haa");
            System.out.println("2. maya");
            int confirm = input.nextInt();
            if (confirm == 1) {
                balance -= amount;
                System.out.println("$" + amount + " si guul ah ayaa ugu shubay " + mobile + ". Haraagaaga cusub: $" + balance);
            } else if (confirm == 2) {
                System.out.println("howlgalka laguma guleysan");
            } else {
                System.out.println("mahadsanid");
            }
        }
    }

    public static void bixibiil() {
        System.out.println("bixi biil");
        System.out.println("1. post paid");
        System.out.println("2. ku iibso");
        System.out.println("3. EXIT");
        System.out.println("doorosho");
        int option = input.nextInt();

        if (option == 1) {
            System.out.println("1. ogow biilka");
            System.out.println("2. bixi biil");
            System.out.println("3. ka bixi biil");
            int choice = input.nextInt();

            if (choice == 1) {
                System.out.println("error occured , please try again");

            } else if (choice == 2) {
                System.out.println("fadlan geli lacagta");
                int amount = input.nextInt();
                if (amount <= 0) {
                    System.out.println("lacagta waa iney ka weynata 0");
                    return;
                }
                if (amount > balance) {
                    System.out.println("haragaga kuguma filno");
                    return;
                }
                System.out.println("ma hubtaa inaa bixisid biil lacagtiisu tahay $" + amount);
                System.out.println("1. haa");
                System.out.println("2. maya");
                int confirm = input.nextInt();
                if (confirm == 1) {
                    balance -= amount;
                    System.out.println("waxa bixisay billka $" + amount + " haraagaga cusub waa: $" + balance);
                } else if (confirm == 2) {
                    System.out.println("waa mahadsanthy");
                } else {
                    System.out.println("choice qaldan");
                }

            } else if (choice == 3) {
                System.out.println("fadlan geli mobile");
                String mobile = input.next();
                if (!mobile.startsWith("61") || mobile.length() != 9) {
                    System.out.println("numberka wu qaldanyahay");
                    return;
                }
                System.out.println("fadlan geli lacagta");
                int amounts = input.nextInt();
                if (amounts <= 0) {
                    System.out.println("lacagta kama yaran karto 0");
                    return;
                }
                if (amounts > balance) {
                    System.out.println("haragagu kuguma filno");
                    return;
                }
                System.out.println("ma hubta inaa ka bixisid biil lacagtiisu tahay $" + amounts + " oo laga rabo " + mobile);
                System.out.println("1. haa");
                System.out.println("2. maya");
                int options = input.nextInt();
                if (options == 1) {
                    balance -= amounts;
                    System.out.println("waxa bixisay $" + amounts + " haraagaga cusub waa: $" + balance);
                } else if (options == 2) {
                    System.out.println("waa mahadsantahy");
                } else {
                    System.out.println("choice qaldan");
                }
            }
        }if (option==2){
            System.out.println("geli aqqonsiga");
            int aqonsi=input.nextInt();
            if (aqonsi<0){
                System.out.println("aqoonsi wuu qaldanyahay");
            } else {
                System.out.println("waa lagu aqonsaday");

            }
        }
    }

    public static void wareejiEvc() {
        System.out.println("Fadlan geli mobileka");
        String mobile = input.next();
        if (!mobile.startsWith("61") || mobile.length() != 9) {
            System.out.println("numberka wu qaldanyahay");
            return;
        }
        System.out.println("fadlan geli lacagta");
        int amount = input.nextInt();
        if (amount <= 0) {
            System.out.println("lacagta waa iney ka weynata 0");
            return;
        }
        if (amount > balance) {
            System.out.println("haraagagu kuguma filno");
            return;
        }
        System.out.println("ma hubta inaad $" + amount + " u warejineysid " + mobile);
        System.out.println("1. haa");
        System.out.println("2. maya");
        System.out.println("3. EXIT");
        int confirm = input.nextInt();
        if (confirm == 1) {
            balance -= amount;
            System.out.println("$" + amount + " waxaa uwarejisa " + mobile + ". Haraagaaga cusub: $" + balance);
        } else if (confirm == 2) {
            System.out.println("howlgalka laguma guleysan");
        } else {
            System.out.println("mahadsanid");
        }
    }

    public static void warbixin() {
        System.out.println("warbixin kooban");
        System.out.println("1. last action");
        System.out.println("2. wareejinta udanbesay");
        System.out.println("3. iibsashadi udanbeysay");
        System.out.println("4. last 3 actions");
        System.out.println("5. email me my activity");
        System.out.println("6. EXIT");
        System.out.println("dorosho");
        int option = input.nextInt();

        if (option == 1) {
            System.out.println("$5 ayaad u warejisay 25261******, tariikda 25/06/26");

        } else if (option == 2) {
            System.out.println("1. u dirat");
            System.out.println("2. ka heshay");
            int number = input.nextInt();
            if (number == 1) {
                System.out.println("fadlan geli mobileka");
                String mobile = input.next();
                if (!mobile.startsWith("61") || mobile.length() != 9) {
                    System.out.println("numberka wu qaldanyahay");
                    return;
                }
                System.out.println("waxa ka udirtay 10$ " + mobile);
            } else {
                System.out.println("waxa ka heshay 10$");
            }

        } else if (option == 3) {
            System.out.println("fadlan gali aqoonsigada");
            int aqoonsi = input.nextInt();
            System.out.println("walugu guleystay aqoonsiga: " + aqoonsi);

        } else if (option == 4) {
            System.out.println("your mini statement has been sent as sms to your registered mobile no");

        } else if (option == 5) {
            System.out.println("fadlan gali emailkaaga");
            String gmail = input.next();
            if (!gmail.contains("@gmail") || !gmail.contains(".com")) {
                System.out.println("gmail wu qaldanyahy");
                return;
            }
            System.out.println("fadlan geli tarikhdi hore : malin|bisha|sanad");
            int day = input.nextInt();
            int month = input.nextInt();
            int year = input.nextInt();
            if (year < 2000 || year > 2026) { System.out.println("sanadka waa qalad");
                return; }
            if (month < 1 || month > 12) { System.out.println("bishaa waa qalad");
                return; }
            if (day < 1 || day > 31) { System.out.println("malinta waa qalad");
                return; }
            System.out.println(day + "/" + month + "/" + year);

            System.out.println("fadlan geli tarikhdi dambe : malin|bisha|sanad");
            int day1 = input.nextInt();
            int month2 = input.nextInt();
            int year3 = input.nextInt();
            if (year3 < 2000 || year3 > 2026) { System.out.println("sanadka waa qalad");
                return; }
            if (month2 < 1 || month2 > 12) { System.out.println("bishaa waa qalad");
                return; }
            if (day1 < 1 || day1 > 31) { System.out.println("malinta waa qalad");
                return; }
            System.out.println(day1 + "/" + month2 + "/" + year3);
            System.out.println("your request is being processed and activity will be emailed to " + gmail);
        }
    }

    public static void salaamBank() {
        while (true) {
            System.out.println("SALAAM BANK ");
            System.out.println("1. Itus haraagaga");
            System.out.println("2. Lacag dhigasho");
            System.out.println("3. Lacag qaadasho");
            System.out.println("4. Ka wareeji EVC Plus");
            System.out.println("5. U wareeji Account");
            System.out.println("6. Hubi wareejinta");
            System.out.println("7. Maareynta bankiga");
            System.out.println("8. Kala bax");
            System.out.println("9. Exit");
            System.out.print("Dooro: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Geli PIN-kaaga: ");
                    int pin1 = input.nextInt();
                    if (pin1 == coorectpin) {
                        System.out.println("Haraagaaga waa: $" + balance);
                    } else {
                        System.out.println("PIN-ka waa qaldan yahay.");
                    }
                    break;

                case 2:
                    System.out.print("Geli PIN-kaaga: ");
                    int pin2 = input.nextInt();
                    if (pin2 == coorectpin) {
                        System.out.print("Geli lacagta: ");
                        double deposit = input.nextDouble();
                        if (deposit <= 0) {
                            System.out.println("Qiimaha waa iney ka weynata 0.");
                        } else {
                            balance += deposit;
                            System.out.println("Waad dhigtay lacag. Haraagaaga hadda waa: $" + balance);
                        }
                    } else {
                        System.out.println("PIN-ka waa qaldan yahay.");
                    }
                    break;

                case 3:
                    System.out.print("Geli PIN-kaaga: ");
                    int pin3 = input.nextInt();
                    if (pin3 == coorectpin) {
                        System.out.print("Geli lacagta: ");
                        double withdraw = input.nextDouble();
                        if (withdraw <= 0) {
                            System.out.println("Qiimaha waa inu ka weynada 0");
                        } else if (withdraw > balance) {
                            System.out.println("Haraaga kuma filna.");
                        } else {
                            balance -= withdraw;
                            System.out.println("Waad qaaday lacagta. Haraagaaga hadda waa: $" + balance);
                        }
                    } else {
                        System.out.println("PIN-ka waa qaldan yahay.");
                    }
                    break;

                case 4:
                    System.out.print("Soo geli numberka (9 digits): ");
                    String evcNumber = input.next();
                    if (!evcNumber.matches("[679]\\d{8}")) {
                        System.out.println("Numberka waa qaldan yahay.");
                        break;
                    }
                    System.out.print("Geli lacagta: ");
                    double amt4 = input.nextDouble();
                    if (amt4 <= 0) {
                        System.out.println("Qiimaha wuu inu ka weynada 0");
                        break;
                    }
                    if (amt4 > balance) {
                        System.out.println("Haraaga kuma filna.");
                        break;
                    }
                    System.out.print("Geli PIN-kaaga: ");
                    int pin4 = input.nextInt();
                    if (pin4 == coorectpin) {
                        balance -= amt4;
                        System.out.println("Lacagta waa la wareejiyay EVC: " + evcNumber);
                        System.out.println("Haraagaaga hadda waa: $" + balance);
                    } else {
                        System.out.println("PIN-ka waa qaldan yahay.");
                    }
                    break;

                case 5:
                    System.out.print("Soo geli account-ka (10-16 digits): ");
                    String account = input.next();
                    if (!account.matches("\\d{10,16}")) {
                        System.out.println("Account number waa qaldan yahay.");
                        break;
                    }
                    System.out.print("Geli lacagta: ");
                    double amt5 = input.nextDouble();
                    if (amt5 <= 0) {
                        System.out.println("Qiimaha wuu inu ka weynada 0.");
                        break;
                    }
                    if (amt5 > balance) {
                        System.out.println("Haraaga kuma filna.");
                        break;
                    }
                    System.out.print("Geli PIN-kaaga: ");
                    int pin5 = input.nextInt();
                    if (pin5 == coorectpin) {
                        balance -= amt5;
                        System.out.println("Lacagta waa la wareejiyay account: " + account);
                        System.out.println("Haraagaaga hadda waa: $" + balance);
                    } else {
                        System.out.println("PIN-ka waa qaldan yahay.");
                    }
                    break;

                case 6:
                    System.out.print("Geli numberka (9 digits): ");
                    String verifyNumber = input.next();
                    if (!verifyNumber.matches("[679]\\d{8}")) {
                        System.out.println("Numberka waa qaldan yahay.");
                        break;
                    }
                    System.out.print("Fadlan geli OTP: ");
                    int otp = input.nextInt();
                    if (otp != 1234) {
                        System.out.println("OTP-gaaga waa qaldan yahay.");
                        break;
                    }
                    System.out.print("Geli PIN-kaaga: ");
                    int pin6 = input.nextInt();
                    if (pin6 == coorectpin) {
                        System.out.println("Lacagta waxaa loo wareejiyay: " + verifyNumber);
                    } else {
                        System.out.println("PIN-ka waa qaldan yahay.");
                    }
                    break;

                case 7:
                    System.out.println("Maareynta Bankiga");
                    System.out.println("1. Beddel PIN-ka");
                    System.out.println("2. Beddel Password-ka E-Banking");
                    System.out.print("Dooro: ");
                    int opt7 = input.nextInt();
                    if (opt7 == 1) {
                        System.out.print("Geli PIN-kaagii hore: ");
                        int oldPin = input.nextInt();
                        if (oldPin == coorectpin) {
                            System.out.print("Geli PIN-ka cusub: ");
                            int newPin = input.nextInt();
                            if (newPin<0){
                                System.out.println("pink kama yaran karo 0");
                                return;
                            } else if (newPin>4) {
                                System.out.println("pink kama weynan karo 4 digit kama neh yaran karo");
                                return;

                            }

                            if (newPin == oldPin) {
                                System.out.println("PIN-ka cusub ma lamid noqon karo PIN-kii hore.");
                                break;
                            }
                            coorectpin = newPin;
                            System.out.println("PIN-ka waa la beddelay.");
                        } else {
                            System.out.println("PIN-kii hore waa qalad.");
                        }
                    } else if (opt7 == 2) {
                        System.out.print("Geli PIN-kaaga si aad u xaqiijiso: ");
                        int pin = input.nextInt();
                        if (pin == coorectpin) {
                            System.out.print("Geli password-ka cusub: ");
                            String newPassword = input.next();
                            System.out.println("Password-ka waa la beddelay.");
                        } else {
                            System.out.println("PIN-ka waa qaldan yahay.");
                        }
                    }
                    break;

                case 8:
                    System.out.print("Fadlan geli aqoonsigaaga: ");
                    String aqoonsi = input.next();
                    if (!aqoonsi.isEmpty()) {
                        System.out.println("Waad ka baxday Salaam Bank.");
                        return;
                    }
                    break;

                case 9:
                    System.out.println("Waad ka baxday Salaam Bank.");
                    return;

                default:
                    System.out.println("Dooro lambar sax ah (1-9).");
            }
        }
    }

    public static void maareynta() {
        System.out.println("Maareynta");
        System.out.println("1. baddel lambarka sirta ah");
        System.out.println("2. badel luqada");
        System.out.println("3. wareeji mobile lumay");
        System.out.println("4. lacag xirasho");
        System.out.println("5. uceli lacag qaldantay");
        System.out.println("6. EXIT");
        System.out.println("doorosho");
        int option = input.nextInt();

        if (option == 1) {
            System.out.println("soo gali pinka hore");
            int oldpin = input.nextInt();
            if (oldpin != coorectpin) {
                System.out.println("pink wa qalad");
                return;
            }
            System.out.println("soo gali pinka cusub");
            int newpin = input.nextInt();
            if (newpin <= 0) {
                System.out.println("pink ma shaqeyso");
                return;
            }
            if (newpin>4){
                System.out.println("4 digit kama badan karo pinka kama neh yaran karo");
                return;
            }
            if (newpin == coorectpin) {
                System.out.println("pink cusub ma la mid noqon karo pink hore");
                return;
            }
            coorectpin = newpin;
            System.out.println("pink si guul ah ayaa loo badalay");

        } else if (option == 2) {
            System.out.println("fadlan dooro luqada");
            System.out.println("1. English");
            System.out.println("2. Somali");
            int num = input.nextInt();
            if (num == 1) {
                System.out.println("you have sucessfully changed your language");
            } else {
                System.out.println("waxa ku guleysatay ina badasho luqada");
            }

        } else if (option == 3) {
            System.out.println("fadlan gali mobilka lumay");
            String mobile = input.next();
            if (mobile.startsWith("61") && mobile.length() == 9) {
                System.out.println("fadlan geli pink");
                int pink = input.nextInt();
                if (pink == coorectpin) {
                    System.out.println("howsha wa lagu guleystay");
                } else {
                    System.out.println("pink wa qaldanyahy");
                }
            } else {
                System.out.println("numberka wa qaldanyahay");
            }

        } else if (option == 4) {
            System.out.println("fadlan gali mobilka lambarka lacagta ku qaladay");
            String mobile = input.next();
            if (!mobile.startsWith("61") || mobile.length() != 9) {
                System.out.println("numberka wu qaldanyahay");
                return;
            }
            System.out.println("fadlan gali lacagta aad xireyso");
            double amount = input.nextDouble();
            if (amount <= 0) {
                System.out.println("lacagta wa iney ka weynata 0");
                return;
            }
            if (amount > balance) {
                System.out.println("Haraagagu kuguma filna!");
                return;
            }
            System.out.println("fadlan geli pin");
            int pin = input.nextInt();
            if (pin != coorectpin) {
                System.out.println("pink wa qalad");
                return;
            }
            balance -= amount;
            System.out.println("$" + amount + " si guul ah ayaa lagu xiray " + mobile + ". Haraagaaga cusub: $" + balance);

        } else if (option == 5) {
            System.out.println("fadlan gali aqoonsiga lacag dirida");
            int aqoonsi = input.nextInt();
            if (aqoonsi < 0) {
                System.out.println("aqoonsiga kama yaran karo 0");
                return;
            }
            System.out.println("aqonsiga waa " + aqoonsi);
        }
    }

    public static void Billpayment() {
        System.out.println("bill payment");
        System.out.println("1. ituss haraga billka");
        System.out.println("2. wada bixi billka");
        System.out.println("3. qayb bixi billka");
        System.out.println("4. EXIT");
        System.out.println("doorosho");
        int option = input.nextInt();

        if (option == 1) {
            System.out.println("fadlan gali bill reference number");
            int ref = input.nextInt();
            System.out.println("Bill reference: " + ref + " | Lacagta haray: $" + balance);

        } else if (option == 2) {
            System.out.println("fadlan geli lacagta oo dhan");
            double amount = input.nextDouble();
            if (amount <= 0) {
                System.out.println("lacagta waa iney ka weynata 0");
                return;
            }
            if (amount > balance) {
                System.out.println("haraagagu kuguma filna");
                return;
            }
            System.out.println("fadlan geli pin");
            int pin = input.nextInt();
            if (pin != coorectpin) {
                System.out.println("pink wa qalad");
                return;
            }
            balance -= amount;
            System.out.println("billka oo dhan $" + amount + " si guul ah ayaa lagu bixiyay. Haraagaaga cusub: $" + balance);

        } else if (option == 3) {
            System.out.println("fadlan geli qaybtaada");
            double amount = input.nextDouble();
            if (amount <= 0) {
                System.out.println("lacagta waa iney ka weynata 0");
                return;
            }
            if (amount > balance) {
                System.out.println("haraagagu kuguma filna");
                return;
            }
            System.out.println("fadlan geli pin");
            int pin = input.nextInt();
            if (pin != coorectpin) {
                System.out.println("pink wa qalad");
                return;

            }
            balance -= amount;
            System.out.println("qayb $" + amount + " si guul ah ayaa lagu bixiyay. Haraagaaga cusub: $" + balance);
        }
    }
}
