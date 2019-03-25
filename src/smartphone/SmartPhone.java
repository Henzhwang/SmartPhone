package smartphone;

import java.util.*;

public class SmartPhone {

    //Declaring varibles
    int numApps;
    //Declare an arrayList
    ArrayList<String> appList;
    String typeOfPhone;

    
    //Constructors
    public SmartPhone() {
        appList = new ArrayList<String>();
        numApps = 0;

        //No phone type was sent - pick random
        int randType = (int) (Math.random() * 3 + 1);
        //Determine user choices to give appropriate functions
        if (randType == 1) {
            typeOfPhone = "iPhone";
        } else if (randType == 2) {
            typeOfPhone = "Android";
        } else {
            typeOfPhone = "Blackberry";
        }
    }

    //Alternate constructors
    public SmartPhone(String smrtPhnType) {
        appList = new ArrayList<String>();
        numApps = 0;
        typeOfPhone = smrtPhnType;
    }

    /**
     * method to add user input of their application to the array list
     * @param appName 
     */
    public void addApp(String appName) {
        appList.add(appName);
        numApps++;
    }

    /**
     * method to remove the application user requested from the array list
     * @param location 
     */
    public void removeApp(int location) {
        appList.remove(location);
        numApps--;
    }

    /**
     * method to display all info of the user phone and application
     * @return the phone info in string
     */
    public String toString() {
        String output = "The following apps are installed on your " + typeOfPhone + ":\n";
        for (int i = 0; i < numApps; i++) {
            output += "App #" + i + " - " + appList.get(i) + "\n";
        }
        return output;
    }
}
