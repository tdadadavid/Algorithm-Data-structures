package solutions;

public class LC1108_DefangIPAddress {
    public static void main(String[] args){
        String IPAddress = "1.1.1.1";
        String IPAddress2 = "255.100.50.0";
        System.out.println(defangIP(IPAddress2));
    }

    private static String defangIP(String address){
        // instantiate a stringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        // iterate over the string
        for (int i = 0; i < address.length(); i++)
            // if the current char is equals to "." then append "[.]" in its place
            stringBuilder.append(address.charAt(i) == '.' ? "[.]" : address.charAt(i));

        return String.valueOf(stringBuilder);
    }
}
