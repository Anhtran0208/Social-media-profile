public class Profile {
    //Declare Properties
    String username;
    int followers;
    String school;
    int numFriends;

    //Constructor that sets the value of 4 properties
    public Profile(String username,int followers, String school, int numFriends){
        this.username = username;
        this.followers = followers;
        this.school = school;
        this.numFriends = numFriends;
    }
     
    //Getter for followers
    public int getFollowers(){
        return this.followers;
    }

    //Getter for username;
    public String getUsername(){
        return this.username;
    }

    //Getter for school;
    public String getSchool(){
        return this.school;
    }

    //Getter for numFriends;
    public int numFriends(){
        return this.numFriends;
    }

    //Setter for numFriends
    public void setnumFriends(int newNumFriends){
        this.numFriends = newNumFriends;
    }

    //Setter for followers
    public void setfollowers(int newFollowers){
        this.followers = newFollowers;
    }

    //Method that prints all of the current properties of an instance of the class 
    public void printProfile(){
        System.out.println("Your username: " + this.username);
        System.out.println("Your school: " + this.school);
        System.out.println("You have " + this.numFriends + " " + "friends");
        System.out.println(this.followers + " " + "people are following you");
    }

    //Main method 
    public static void main(String[] args){
        //Create an instance of the Profile class
        Profile Person1 = new Profile("Anna0208",100,"Mount Holyoke College",450);
        
        //Call the instance's instance method to display the profile
        Person1.printProfile();

        //Call any setter to change information in the profile
        Person1.setnumFriends(500);

        //Call the instance's instance method to display the updated profile
        Person1.printProfile();
    }
}

