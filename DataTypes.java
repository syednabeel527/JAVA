public class DataTypes {
    public static void main (String [] args){
        
        //numeric DataTypes

        byte num1 =100;
        System.out.println(num1);
        short num2 = 500;
        System.out.println(num2);
        int num3 =50000;
        System.out.println(num3);
        long num4 = 50000000;
        System.out.println(num4);

        //Floating DataTypes

        float num5 = 3.142525f;
        System.out.println(num5);

        double num6 = 3.1458976;
        System.out.println(num6);


        //Non-numeric DataTypes

        boolean eligibleToVote = true;
        System.out.println(eligibleToVote);

        char firstCharacter = 'a';
        System.out.println(firstCharacter + (firstCharacter+2));
        System.out.println((char)(firstCharacter+2));
    }
}