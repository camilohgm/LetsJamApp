public class User {
        
        String name;
        String phone;
        String city;
        int age;
        String instrument;
        String influences;
        String genre;
        int experience;
        
        public User(String name, String phone, String city, int age, String instrument, String influences, String genre,
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

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getInstrument() {
            return instrument;
        }

        public void setInstrument(String instrument) {
            this.instrument = instrument;
        }

        public String getInfluences() {
            return influences;
        }

        public void setInfluences(String influences) {
            this.influences = influences;
        }

        public String getGenre() {
            return genre;
        }

        public void setGenre(String genre) {
            this.genre = genre;
        }

        public int getExperience() {
            return experience;
        }

        public void setExperience(int experience) {
            this.experience = experience;
        }

    }
