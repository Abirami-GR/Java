public class VarArgs {
    public static void main(String[] args) {
        System.out.println(concatenate("Prashanth"));
        System.out.println(concatenate("Prashanth", "Jain"));
        System.out.println(concatenate( "Subscribe", "to", "KGCoding"));
    }

    public static String concatenate(String... strs){
        StringBuilder sb = new StringBuilder();
        for(String str : strs){
            sb.append(str).append(" ");
        }
        return sb.toString();
    }
}
