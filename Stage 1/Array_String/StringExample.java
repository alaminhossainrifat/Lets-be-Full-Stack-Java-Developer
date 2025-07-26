public class StringExample {
    public static void main(String[] args) {

        String s1 = "Rifat"; // Method 1
        String s2 = new String("Hossain"); // Method 2

        System.out.println("S1: " + s1);
        System.out.println("S2: " + s2);

        char[] s3 = {'r', 'i', 'f', 'a', 't'};
        System.out.println(s3);
        String s4 = new String(s3); // Convert char array to String
        System.out.println("S3: " + s4);

        int length = s1.length();
        System.out.println(length);

        if (s1.equals(s4)) {
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal!!");
        }

        String s5 = "121";
        StringBuffer sb = new StringBuffer(s5);
        String s6 = sb.reverse().toString();
        if (s5.equals(s6)) {
            System.out.print("Palindrome");
        }
        else{
            System.out.print("Not Palindrome");
        }
        System.out.println();

        //Primitive to String
        int i = 100;
        String s = Integer.toString(i);
        System.out.println("Primitive to String: "+s);

        double j = 200;
        String st2 = Double.toString(j);
        System.out.println(st2);

        boolean b = true;
        String st3 = Boolean.toString(b);
        System.out.println(st3);

        //String to Primitive
        String st4 = "32";
        int int4 = Integer.parseInt(st4);
        System.out.println(int4);

        String st5 = "50";
        int int5 = Integer.valueOf(int4);
        System.out.println(int5);
    }
}
