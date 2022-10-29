import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


class LetsJam {

    public void User(String name, String phone, String city, int age, String instrument, String influences, String genre,
    int experience) {
this.name = name;
this.phone = phone;
this.city = city;
this.age = age;
this.instrument = instrument;
this.influences = influences;
this.genre = genre;
this.experience = experience;
}
    
    String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    String phone;
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    String city;
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    int age;
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    String instrument;
    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    String influences;

    public String getInfluences() {
        return influences;
    }

    public void setInfluences(String influences) {
        this.influences = influences;
    }

    String genre;
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    int experience;
    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }


    public void start(String[] args) {

        List<String> userList = new ArrayList<String>();
        userList.add(name);

            System.out.println("======== Let's Jam App ========");

            Scanner sc = new Scanner(System.in); 
            System.out.println("Please enter your Name: ");
            String name = sc.next();

            System.out.println("Your City: ");
            String city = sc.next();

            System.out.println("Your phone: ");
            String phone = sc.next();

            System.out.println("Your instrument: ");
            String instrument = sc.next();

            System.out.println("Genres you like: ");
            String genre = sc.next();

            System.out.println("Years of experience: ");
            int experience = sc.nextInt();
    }
            public void showMenu() {
                    Scanner sc = new Scanner(System.in);

                    char option;
                    System.out.println("Hey " + name + " Welcome to Let's Jam");            
            
                    do {
                        System.out.println("================================================");
                        System.out.println("1. Search by instrument");
                        System.out.println("2. Show me musicians near me");
                        System.out.println("3. Search by Music Genres");
            
            
                        System.out.println("Please enter a choice : ");
                        option = sc.next().charAt(0);
                        System.out.println(); // Line Break;
            
            
                        switch(option) {
                            case '1' : 
                                System.out.println("================================================");
                                System.out.println(" Musicians who play " + this.instrument);
                                System.out.println("================================================");
                                System.out.println(); // Line Break
                                break;
            
                            case '2' : 
                            System.out.println("================================================");
                            System.out.println(" Musicians who live near " + this.city);
                            System.out.println("================================================");
                            System.out.println(); // Line Break
                            break;
            
                            case '3': 
                            System.out.println("================================================");
                            System.out.println(" Musicians who like this/these genres " + this.city);
                            System.out.println("================================================");
                            System.out.println(); // Line Break
                            sc.close();
                            break;
            
                            default: 
                                System.out.println("Invalid Option, Please enter a valid input");
            
                        }
            
            
                    } while(option != '4');
                    System.out.println();
                    System.out.println("Let's Jam! See you later");
            
                }
            }
