public class Manager extends Person {
    //attribute
    private String Manager_ID, Manager_Password;

    public String getManager_ID() {
        return Manager_ID;
    }

    public void setManager_ID(String manager_ID) {
        Manager_ID = manager_ID;
    }

    public String getManager_Password() {
        return Manager_Password;
    }

    public void setManager_Password(String manager_Password) {
        Manager_Password = manager_Password;
    }

    //constructor
    public Manager(String Manager_ID, String Manager_Password, String Person_ID, String Person_Name, String Gender) {
        super(Person_ID, Person_Name, Gender);
        this.Manager_ID = Manager_ID;
        this.Manager_Password = Manager_Password;
        // this.Person_ID = Person_ID;
        // this.Person_Name = Person_Name;
        // this.Gender = Gender;
    }
}
