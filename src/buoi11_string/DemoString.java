package buoi11_string;

public class DemoString {
    public static void main(String[] args) {
        String name = "    nGuyEn vaN a   ";
        
        // Xóa khoảng trắng: name.trim() -> nGuyEn vaN a
        // Viết thường toàn bộ: toLowerCase(); -> nguyen van a
        // split() -> [ "nguyen", "van", "a" ]
        // charAt(0) -> n
        
        String[] arr = name.trim().toLowerCase().split(" ");
        String result = "";
        for (String s: arr) {
            String firstChar = s.substring(0, 1).toUpperCase();
            String newName = firstChar + s.substring(1);
            result += " " + newName;
        }
        
        System.out.println( result.trim() );
        
        // Nguyen Van A

//        System.out.println( name.startsWith("N") ); // true
//        System.out.println( name.startsWith("A") ); // false
//        
//        
//        System.out.println( name.endsWith("N") ); // false
//        System.out.println( name.endsWith("Van A") ); // true
//        
//        System.out.println( name.indexOf("N") ); // 0
//        System.out.println( name.lastIndexOf("n") ); // 9

//        System.out.println( name.equals("Nguyen Van A") );
//        System.out.println( name.equals("nguyen van a") );
//        System.out.println( name.equalsIgnoreCase("nguyen van a") );

//        System.out.println( name.toLowerCase() );
//        System.out.println( name.toUpperCase() );
        
//        String s = "  nGuyen vAn a  ";
//        System.out.println( s );
//        System.out.println( s.trim() );
        
//        System.out.println( name.substring(7) );
//        System.out.println( name.substring(0, 7) );
        
//        String[] arr = name.split(" ");
//        for (String s: arr) {
//            System.out.println(s);
//        }
        
    }
}
