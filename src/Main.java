import com.sun.jdi.IntegerType;

import java.io.IOException;
import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {
        Roman II = new Roman();
        II.figure = 2;
        II.rome = "II";
        Roman I = new Roman();
        I.figure = 1;
        I.rome = "I";
        Roman III = new Roman();
        III.figure = 3;
        III.rome = "III";
        Roman IV = new Roman();
        IV.figure = 4;
        IV.rome = "IV";
        Roman V = new Roman();
        V.figure = 5;
        V.rome = "V";
        Roman VI = new Roman();
        VI.figure = 6;
        VI.rome = "VI";
        Roman VII = new Roman();
        VII.figure = 7;
        VII.rome = "VII";
        Roman VIII = new Roman();
        VIII.figure = 8;
        VIII.rome = "VIII";
        Roman IX = new Roman();
        IX.figure = 9;
        IX.rome = "IX";
        Roman X = new Roman();
        X.rome = "X";
        X.figure = 10;
        Scanner sc = new Scanner(in);
        out.println("Input:");
        String ex = sc.next();
        String ex1 = sc.next();
        String ex2 = sc.next();
        if (sc.nextLine().trim() != "") {
            try {
                throw new IOException();
            } catch (IOException e) {
                out.println("Please insert 2 numbers and 1 mathematical operator");
                exit(0);
            }
        }
        try {
            parseInt(ex);
            parseInt(ex2);
            int p = parseInt(ex);
            int k = parseInt(ex2);
            if (p > 10 || k > 10) {
                try {
                    throw new NumberFormatException();
                } catch (NumberFormatException e) {
                    out.println("Please enter the numbers less than or equal to 10");
                    exit(0);
                }
            }
            out.println("Output:");
            int g = 0;
            switch (ex1) {
                case "+" -> g = p + k;
                case "-" -> g = p - k;
                case "*" -> g = p * k;
                case "/" -> g = p / k;
            }
            out.println(g);
        } catch (NumberFormatException e) {
            try {parseInt(ex);
                 parseInt(ex2);
            }
                catch (NumberFormatException exception) {
                    out.println("Different number systems");
                    exit(0);
                }
            int r1 = 0;
            switch (ex) {
                case ("I"):
                    r1 = I.figure;
                    break;
                case ("II"):
                    r1 = II.figure;
                    break;
                case ("III"):
                    r1 = III.figure;
                    break;
                case ("IV"):
                    r1 = IV.figure;
                    break;
                case ("V"):
                    r1 = V.figure;
                    break;
                case ("VI"):
                    r1 = VI.figure;
                    break;
                case ("VII"):
                    r1 = VII.figure;
                    break;
                case ("VIII"):
                    r1 = VIII.figure;
                    break;
                case ("IX"):
                    r1 = IX.figure;
                    break;
                case ("X"):
                    r1 = X.figure;
                    break;
            }
            int r2 = 9999;
            switch (ex2) {
                case ("I"):
                    r2 = I.figure;
                    break;
                case ("II"):
                    r2 = II.figure;
                    break;
                case ("III"):
                    r2 = III.figure;
                    break;
                case ("IV"):
                    r2 = IV.figure;
                    break;
                case ("V"):
                    r2 = V.figure;
                    break;
                case ("VI"):
                    r2 = VI.figure;
                    break;
                case ("VII"):
                    r2 = VII.figure;
                    break;
                case ("VIII"):
                    r2 = VIII.figure;
                    break;
                case ("IX"):
                    r2 = IX.figure;
                    break;
                case ("X"):
                    r2 = X.figure;
                    break;
            }
            int r3 = 9999;
            if (r1 > 0) {
                switch (ex1) {
                    case "+" -> r3 = (r1 + r2);
                    case "-" -> r3 = (r1 - r2);
                    case "*" -> r3 = (r1 * r2);
                    case "/" -> r3 = (r1 / r2);
                }
            }
            int full = r3 / 10;
            int ost = r3 % 10;
            String L = "L";
            switch (ost) {
                case (0):
                    L = " ";
                    break;
                case (1):
                    L = "I";
                    break;
                case (2):
                    L = "II";
                    break;
                case (3):
                    L = "III";
                    break;
                case (4):
                    L = "IV";
                    break;
                case (6):
                    L = "VI";
                    break;
                case (5):
                    L = "V";
                    break;
                case (7):
                    L = "VII";
                    break;
                case (8):
                    L = "VIII";
                    break;
                case (9):
                    L = "IX";
                    break;
            }
            out.println("Output");
            if (r3 <= 0) {
                try {
                    throw new IOException();
                } catch (IOException exception) {
                    out.println("Result is not possible");
                }
            }
                if (r3 <= 10) {
                    switch (r3) {
                        case (1):
                            out.println(I.rome);
                            break;
                        case (2):
                            out.println(II.rome);
                            break;
                        case (3):
                            out.println(III.rome);
                            break;
                        case (4):
                            out.println(IV.rome);
                            break;
                        case (5):
                            out.println(V.rome);
                            break;
                        case (6):
                            out.println(VI.rome);
                            break;
                        case (7):
                            out.println(VII.rome);
                            break;
                        case (8):
                            out.println(VIII.rome);
                            break;
                        case (9):
                            out.println(IX.rome);
                            break;
                        case (10):
                            out.println(X.rome);
                            break;
                    }
                }

                if (r3 > 10 && r3 < 40) {
                    for (int i = 0; i < full; i++) {
                        out.print("X");
                    }
                    out.print(L);
                }
                if (r3 >= 40 && r3 < 50) {
                    out.print("XL");
                    out.print(L);
                }
                if (r3 >= 50 && r3 < 90) {
                    out.print("L");
                    for (int i = 0; i < full - 5; i++) {

                        out.print("X");
                    }
                    out.print(L);
                }
                if (r3 >= 90 && r3 < 100) {

                    out.print("XC");
                }
                if (r3 == 100) {

                    out.println("C");
                }

            }

        }
    }
    class Roman {
        int figure;
        String rome;

        int calculation() {
            int i = figure + 0;
            return i;
        }
    }





