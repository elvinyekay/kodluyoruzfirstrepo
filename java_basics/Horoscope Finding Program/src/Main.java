import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int month, day;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter month number: ");
        month = input.nextInt();

        System.out.println("Enter day number: ");
        day = input.nextInt();

        if (month == 1) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    System.out.println("Capricorn");
                } else {
                    System.out.println("Aquarius");
                }
            } else {
                System.out.println("Invalid day");
            }
        } else if (month == 2) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    System.out.println("Aquarius");
                } else {
                    System.out.println("Pisces");
                }
            } else {
                System.out.println("Invalid day");
            }
        } else if (month == 3) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    System.out.println("Pisces");
                } else {
                    System.out.println("Aries");
                }
            } else {
                System.out.println("Invalid day");
            }
        } else if (month == 4) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    System.out.println("Aries");
                } else {
                    System.out.println("Taurus");
                }
            }else {
                System.out.println("Invalid day");
            }
        } else if (month == 5) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    System.out.println("Taurus");
                } else {
                    System.out.println("Gemini");
                }
            }else {
                System.out.println("Invalid day");
            }
        } else if (month == 6) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    System.out.println("Gemini");
                } else {
                    System.out.println("Cancer");
                }
            }else {
                System.out.println("Invalid day");
            }
        } else if (month == 7) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    System.out.println("Cancer");
                } else {
                    System.out.println("Leo");
                }
            }else {
                System.out.println("Invalid day");
            }
        } else if (month == 8) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    System.out.println("Leo");
                } else {
                    System.out.println("Virgo");
                }
            }else {
                System.out.println("Invalid day");
            }
        } else if (month == 9) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    System.out.println("Virgo");
                } else {
                    System.out.println("Libra");
                }
            }else {
                System.out.println("Invalid day");
            }
        } else if (month == 10) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    System.out.println("Libra");
                } else {
                    System.out.println("Scorpio");
                }
            }else {
                System.out.println("Invalid day");
            }
        } else if (month == 11) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    System.out.println("Scorpio");
                } else {
                    System.out.println("Sagittarius");
                }
            }else {
                System.out.println("Invalid day");
            }
        } else if (month == 12) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    System.out.println("Sagittarius");
                } else {
                    System.out.println("Capricorn");
                }
            }else {
                System.out.println("Invalid day");
            }
        }else{
            System.out.println("Invalid month");
        }
    }
}