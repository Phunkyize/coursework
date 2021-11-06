
class Dec2Hex {

    public static int Arg1;

    public static void main(String[] args) {
        if (args.length != 0) {
            Arg1 = 0;
            try {
                Arg1 = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.out.println("Provided input is not a number");
                return;
            }
            ConvertDecimalToHex(Arg1);
        } else {
            throw new ArrayIndexOutOfBoundsException("No argument input provided");
        }
    }

    public static void ConvertDecimalToHex(int i) {
        char[] ch = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int rem, num;
        num = i;
        StringBuilder hexadecimal = new StringBuilder();
        System.out.println("Converting the Decimal Value " + num + " to Hex...");

        while (num != 0) {
            rem = num % 16;
            hexadecimal.insert(0, ch[rem]);
            num = num / 16;
        }

        System.out.println("Hexadecimal representation is: " + hexadecimal);

    }
}
