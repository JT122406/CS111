/*************************************************************************
 *  Compilation:  javac HeartTransplant.java
 *  Execution:    java HeartTransplant < data.txt
 *
 *  @author:Joseph T. McQuigg
 *
 *************************************************************************/

public class HeartTransplant {

    /* ------ Instance variables  -------- */

    // Person array, each Person is read from the data file
    private Person[] listOfPatients;

    // SurvivabilityByAge array, each rate is read from data file
    private SurvivabilityByAge[] survivabilityByAge;

    // SurvivabilityByCause array, each rate is read from data file
    private SurvivabilityByCause[] survivabilityByCause;

    /* ------ Constructor  -------- */
    
    /*
     * Initializes all instance variables to null.
     */
    public HeartTransplant() {        
        // WRITE YOUR CODE HERE        
        this.listOfPatients = null; 
        this.survivabilityByAge = null;
        this.survivabilityByCause = null;
    }

    /* ------ Methods  -------- */

    /*
     * Inserts Person p into listOfPatients
     * 
     * Returns:  0 if successfully inserts p into array, 
     *          -1 if there is not enough space to insert p into array
     */
    public int addPerson(Person p, int arrayIndex) {

        // WRITE YOUR CODE HERE
       if(arrayIndex > listOfPatients.length -1){
           return -1;
       }
       else if(listOfPatients[arrayIndex] == null)
       {
           listOfPatients[arrayIndex] = p;
           return 0;
       }
       else
       {
           return -1;
       }
    }

    /*
     * 1) Creates the listOfPatients array with numberOfLines length.
     * 
     * 2) Reads from the command line data file.
     *    File Format: ID, Ethinicity, Gender, Age, Cause, Urgency, State of health
     *    Each line refers to one Person.
     * 
     * 3) Inserts each person from file into listOfPatients
     *    Hint: uses addPerson() method
     * 
     * Returns the number of patients read from file
     */
    public int readPersonsFromFile(int numberOfLines) {

        // WRITE YOUR CODE HERE
        this.listOfPatients = new Person[numberOfLines];
        for (int i = 0; i < numberOfLines; i++) {
            this.listOfPatients = new Person[numberOfLines];
            Person currentPerson;
            int id; int ethnicity; int gender; int age; int cause; int urgency; int stateOfHealth;
           
                
            id = StdIn.readInt();
            ethnicity = StdIn.readInt();
            gender = StdIn.readInt();
            age = StdIn.readInt();
            cause = StdIn.readInt();
            urgency = StdIn.readInt();
            stateOfHealth = StdIn.readInt(); 
            currentPerson = new Person( id,  ethnicity,  gender,  age, cause, urgency,  stateOfHealth);
            addPerson(currentPerson, i);
        }
        return numberOfLines;
    }
    /*
     * 1) Creates the survivabilityByAge array with numberOfLines length.
     * 
     * 2) Reads from the command line file.
     *    File Format: Age YearsPostTransplant Rate
     *    Each line refers to one survivability rate by age.
     * 
     * 3) Inserts each rate from file into the survivabilityByAge array
     * 
     * Returns the number of survivabilities rates read from file
     */
    public int readSurvivabilityRateByAgeFromFile (int numberOfLines) {

        // WRITE YOUR CODE HERE
        this.survivabilityByAge = new SurvivabilityByAge[numberOfLines];
        int age, years;
        double rate;
        for (int i = 0; i < numberOfLines; i++) {
            age = StdIn.readInt();
            years = StdIn.readInt();
            rate = StdIn.readDouble();
            SurvivabilityByAge currentSBA = new SurvivabilityByAge(age, years, rate);
            survivabilityByAge[i] = currentSBA;
        }
        return numberOfLines;
    }
    /*
     * 1) Creates the survivabilityByCause array with numberOfLines length.
     * 
     * 2) Reads from the command line file.
     *    File Format: Cause YearsPostTransplant Rate
     *    Each line refers to one survivability rate by cause.
     * 
     * 3) Inserts each rate from file into the survivabilityByCause array
     * 
     * Returns the number of survivabilities rates read from file
     */
    public int readSurvivabilityRateByCauseFromFile (int numberOfLines) {
        // WRITE YOUR CODE HERE
        this.survivabilityByCause = new SurvivabilityByCause[numberOfLines];
        int cause, years;
        double rate;
        for(int i = 0; i < numberOfLines; i++){
            cause = StdIn.readInt();
            years = StdIn.readInt();
            rate = StdIn.readDouble();
            SurvivabilityByCause currentSBC = new SurvivabilityByCause(cause, years, rate);
            survivabilityByCause[i] = currentSBC;
        }
        return numberOfLines;
    }
    
    /*
     * Returns listOfPatients
     */
    public Person[] getListOfPatients() {
        return listOfPatients;
    } 

    /*
     * Returns survivabilityByAge
     */
    public SurvivabilityByAge[] getSurvivabilityByAge() {
        return survivabilityByAge;
    }

    /*
     * Returns survivabilityByCause
     */
    public SurvivabilityByCause[] getSurvivabilityByCause() {
        return survivabilityByCause;
    }

    /*
     * Returns a Person array in which with every Person that has 
     * age above the parameter age from the listOfPatients array.
     * 
     * The return array has to be completely full with no empty
     * spots, that is the array size should be equal to the number
     * of persons with age above the parameter age.
     * 
     * Return null if there is no Person with age above the 
     * parameter age.
     */ 
    public Person[] getPatientsWithAgeAbove(int age) {

        // WRITE YOUR CODE HERE
        Person[] ages =  new Person[this.listOfPatients.length-1];
        int j = 0;
        for(int i = 0; i < ages.length; i++){
           if(this.listOfPatients[i].getAge() <= age){
               j++;
           }
           else if(this.listOfPatients[i].getAge() > age){
               ages[i] = this.listOfPatients[i];
              
           }
        
       }
       int n = 0;
       for(int i = 0; i < ages.length; i++){
        if(ages[i] == null){
            n = i;
            break;
        }
    }
        Person[] newvar1 = new Person[n];
        for(int i = 0; i < n; i++){
            newvar1[i] = ages[i];
        }
       

        return newvar1;
        
    }
    
    /*
     * Returns a Person array with every Person that has the state of health 
     * equal to the parameter state from the listOfPatients array.
     * 
     * The return array has to be completely full with no empty
     * spots, that is the array size should be equal to the number
     * of persons with the state of health equal to the parameter state.
     * 
     * Return null if there is no Person with the state of health 
     * equal to the parameter state.
     */ 
    public Person[] getPatientsByStateOfHealth(int state) {

        // WRITE YOUR CODE HERE
        Person[] currenthealthy =  new Person[this.listOfPatients.length-1];
        int j = 0;
        for(int i = 0; i < currenthealthy.length; i++){
           if(this.listOfPatients[i].getStateOfHealth() <= state){
               j++;
           }
           else if(this.listOfPatients[i].getStateOfHealth() > state){
               
               currenthealthy[i] = this.listOfPatients[i];
           }
        
       }

       int n = 0;
       for(int i = 0; i < currenthealthy.length; i++){
        if(currenthealthy[i] == null){
            n = i;
            break;
        }
    }
        Person[] newvar1 = new Person[n];
        for(int i = 0; i < n; i++){
            newvar1[i] = currenthealthy[i];
        }

           return newvar1;
        
    }

    /*
     * Returns a Person array with every person that has the heart 
     * condition cause equal to the parameter cause from the listOfPatients array.
     * 
     * The return array has to be completely full with no empty
     * spots, that is the array size should be equal to the number
     * of persons with the heart condition cause equal to the parameter cause.
     * 
     * Return null if there is no Person with the heart condition cause 
     * equal to the parameter cause.
     */ 
    public Person[] getPatientsByHeartConditionCause(int cause) {

        // WRITE YOUR CODE HERE
        Person[] Condition =  new Person[this.listOfPatients.length-1];
            int j = 0;
        for(int i = 0; i < Condition.length; i++){
           if(this.listOfPatients[i].getCause() <= cause){
               j++;
           }
           else if(this.listOfPatients[i].getCause() > cause){
               
               Condition[i] = this.listOfPatients[i];
           }
        
       }
       int n = 0;
       for(int i = 0; i < Condition.length; i++){
        if(Condition[i] == null){
            n = i;
            break;
        }
    }
        Person[] newvar1 = new Person[n];
        for(int i = 0; i < n; i++){
            newvar1[i] = Condition[i];
        }

           return newvar1;
        
    }

    /*
     * Assume there are numberOfHearts available for transplantation surgery.
     * Also assume that the hearts are of the same blood type as the
     * persons on the listOfPatients.
     * This method finds a set of persons to be the recepients of these
     * hearts.
     * 
     * The method returns a Person array from the listOfPatients
     * array that have the highest potential for survivability after
     * the transplant. The array size is numberOfHearts.
     * 
     * If numberOfHeartsAvailable is greater than listOfPatients
     * array size all Persons will receive a transplant.
     * 
     * If numberOfHeartsAvailable is smaller than listOfPatients
     * array size find the set of people with the highest
     * potential for survivability.
     * 
     * There is no correct solution, you may come up with any set of
     * persons from the listOfPatients array.
     */ 
    public Person[] match(int numberOfHearts) {

        // WRITE YOUR CODE HERE
        Person heartgave[] = new Person[numberOfHearts];
        int numofpaitents = listOfPatients.length;
        int heartsgiven = 0;
        for(int i = 0; i < numofpaitents; i++){
            if(numberOfHearts < heartsgiven){
                if((listOfPatients[i].getAge() < 35) && (listOfPatients[i].getStateOfHealth() >= 6)){
                    heartgave[i] = listOfPatients[i];
                    heartsgiven++;
                }
            }
            else
            break;
        }

        return heartgave;

    }

    /*
     * Client to test the methods you write
     */
    public static void main (String[] args) {

        HeartTransplant ht = new HeartTransplant();

        // read persons from file
        int numberOfLines = StdIn.readInt();
        int numberOfReadings = ht.readPersonsFromFile(numberOfLines);
        StdOut.println(numberOfReadings + " patients read from file.");
 
        // read survivability by age from file
        numberOfLines = StdIn.readInt();
        numberOfReadings = ht.readSurvivabilityRateByAgeFromFile(numberOfLines);
        StdOut.println(numberOfReadings + " survivability rates by age lines read from file.");

        // read survivability by heart condition cause from file        
        numberOfLines = StdIn.readInt();
        numberOfReadings = ht.readSurvivabilityRateByCauseFromFile(numberOfLines);
        StdOut.println(numberOfReadings + " survivability rates by cause lines read from file.");

        // list all patients
        for (Person p : ht.getListOfPatients()) {
            StdOut.println(p);
        }

        // list survivability by age rates
        for (SurvivabilityByAge rate : ht.getSurvivabilityByAge()) {
            StdOut.println(rate);
        }

        // list survivability by cause rates
        for (SurvivabilityByCause rate : ht.getSurvivabilityByCause()) {
            StdOut.println(rate);
        }

    }
}
