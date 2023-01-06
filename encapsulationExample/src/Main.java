public class Main {
    public static void main(String[] args) {
        Data dataScan = new Data();
        System.out.println("Input data");
        System.out.print("User's name is: " );
        dataScan.setName();
        System.out.print("User's surname is: " );
        dataScan.setSurname();
        System.out.print("User's age is: " );
        dataScan.setAge();
        System.out.print("User's height is: " );
        dataScan.setHeight();
        System.out.print("User's place of birth is: " );
        dataScan.setCountry();
    }
}
