import java.util.Scanner;
class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many rows?");
        int rows = scanner.nextInt();
        System.out.println(starPyramid(rows));
        System.out.println("Max Number?");
        int max = scanner.nextInt();
        System.out.println(printChart(max));
        System.out.println("\n");
        System.out.println("First and second number?");
        int firstArm = scanner.nextInt();
        int secondArm = scanner.nextInt();
        System.out.println(armstrongNumbers(firstArm, secondArm));
    }

    public static String starPyramid(int input1) {
        int numStar = -2;
        String all = "";
        int numSpace = 0;

        for (int p = (input1 - 1); p >= 0; p--) {
            numSpace = p;
            numStar += 2;
            for (int c = 0; c <= numSpace; c++) {
                all += " ";
            }
            for (int c = 0; c <= numStar; c++) {
                all += "*";
            }
            all += "\n";
        }

        return "A star pyramid with " + input1 + " rows " + "\n" + all;
    }

    public static String printChart(int input1) {
        String list = "";
        int count = 1;
        for (int i = 0; i <= input1; i++) {
            for (int c = 0; c <= i; c++) {
                list += count + " ";
                count++;
                if (count == (input1 + 1)) {
                    return "A number chart with " + input1 + " as the max number is: " + "\n" + list;
                }
            }
            list += "\n";
        }
        return "A number chart with " + input1 + " as the max number is: " + "\n" + list;
    }

    public static String armstrongNumbers(int input1, int input2) {
        String all = "";

        for (int i = input1; i <= input2; i++) {
            String iS = Integer.toString(i);
            int sum = 0;
            int power = iS.length();

            for (int k = 0; k < iS.length(); k++) {
                char numS = iS.charAt(k);
                String charstr = String.valueOf(numS);
                int num = Integer.parseInt(charstr);

                sum += Math.pow(num, power);
            }

            if (sum == i) {
                all += i + "\n";
            }
        }

        return "The armstrong numbers between " + input1 + " and " + input2 + " is: " + "\n" + all;
    }
}
