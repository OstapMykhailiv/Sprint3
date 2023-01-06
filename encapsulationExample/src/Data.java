import java.util.*;

public class Data {

    private String name;
    public String getName(){
        return name;
    }
    public void setName(){
        Scanner input = new Scanner(System.in);
        this.name=input.next();
    }

    private String surname;
    public String getSurname(){
        return surname;
    }
    public void setSurname()
    {
        Scanner input = new Scanner(System.in);
        this.surname=input.next();
    }

    private int age;
    public int getAge(){
        return age;
    }
    public void setAge(){
        Scanner input = new Scanner(System.in);
        this.age= input.nextInt();
    }
    private int height;
    public int getHeight(){
        return height;
    }
    public void setHeight(){
        Scanner input = new Scanner(System.in);
        this.height= input.nextInt();
    }

    private String country;
    public String getCountry(){
        return country;
    }
    public void setCountry(){
        Scanner input = new Scanner(System.in);
        String country = input.nextLine();
    }

}
