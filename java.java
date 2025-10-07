
class Main {
    public static void main(String[] args) {
        System.out.println(starPyramid(10));
        System.out.println(printChart(15));
        System.out.println("\n");
        System.out.println(armstrongNumbers(1000, 1000000));

    }

    public static String starPyramid(int input1) {
        int numStar = -2;
        String all = "";
        int numSpace = 0;

        for (int p = (input1 - 1); p >= 0; p--) {
            numSpace = p;
            numStar += 2;
            for (int c = 0; c <= numSpace; c++){
                all += " ";
            }
            for (int c = 0; c <= numStar; c++){
                all += "*";
            }
            all += "\n";
        }

        return "A star pyramid with " + input1 + " rows "+ "\n" +all;
    }
public static String printChart(int input1){
        String list  = "";
        int count = 1;
        for (int i = 0; i <= input1; i++){
            for (int c = 0; c <= i; c++){
                list += count + " ";
                count++;
                if (count == (input1 + 1)){
                    return "A number chart with " + input1 + " as the max number is: "+ "\n" + list;
                }
            }
            list += "\n";
           
        }
        return "A number chart with " + input1 + " as the max number is: "+ "\n" + list;
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


_____________________$$$
____________________$___$
_____________________$$$
_____________________$_$
_____________________$_$
___________________$$$_$$$
_________________$$__$$$__$$$
_______________$$__$$$$$$$___$
______________$_______________$
_____________$_________________$
_____________$_________________$
_____________$_____$$$$$$$$$$$$$$$
_____________$____$_______________$
_____________$____$___$$$$$$$$$$$$$
_____________$___$___$___________$$$
_____________$___$___$_$$$___$$$__$$
_____________$___$___$_$$$___$$$__$$
_____________$___$___$___________$$$
_____________$____$___$$$$$$$$$$$$$
_____________$_____$$$$$$$$$$$$$$
_____________$_________________$
_____________$____$$$$$$$$$$$$$$
_____________$___$__$__$__$__$
_____________$__$$$$$$$$$$$$$$
_____________$__$___$__$__$__$
_____________$___$$$$$$$$$$$$$$$
____________$$$_________________$$$
__________$$___$$$_________$$$$$___$$
________$$________$$$$$$$$$__________$$$
_______$__$$_____________________$$$$___$$
____$$$$$___$$$$$$$$______$$$$$$$_______$_$
__$______$$_________$$$$$$______________$_$$
_$____$____$____________________________$_$_$
_$_____$___$______________$$$$$$$$$$$___$_$_$$
_$$$____$___$__$$$$$$$$$$$$__________$___$_$_$$
$___$$$$____$__$_____________________$___$_$$_$
$$$____$___$$__$_____________________$$__$_$__$
$___$__$__$$___$______________________$__$$$__$
$_____$$_$$____$_______________$$$____$__$_$__$
