public class Person {
   //attribute 
   private String Person_ID, Person_Name, Gender ;

public String getPerson_ID() {
    return Person_ID;
}

public void setPerson_ID(String person_ID) {
    Person_ID = person_ID;
}

public String getPerson_Name() {
    return Person_Name;
}

public void setPerson_Name(String person_Name) {
    Person_Name = person_Name;
}

public String getGender() {
    return Gender;
}

public void setGender(String gender) {
    Gender = gender;
}

//constructor
   public Person(String Person_ID, String Person_Name, String Gender){
        this.Person_ID = Person_ID;
        this.Person_Name = Person_Name;
        this.Gender = Gender;
   }
}
