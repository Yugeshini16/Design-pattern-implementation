//Creational-Pattern_Singleton focus on only one object creation & provide access to it
    class LightSwitch {

        private LightSwitch() { // Private constructor to prevent instantiation(creating objects) outside the class
        }

        private static LightSwitch instance; /*(static, is the class variable)
                                              the ONLY ONE INSTANCE */
        public static LightSwitch getInstance() { // Method to get the singleton instance(the only way to get)
            if (instance == null) {
                instance = new LightSwitch(); //if null it creates a new object
            }
            return instance; //return the existing instance
        }

        public void switchOn() { // Method to switch on the light
            System.out.println("The light is on.");
        }

        public void switchOff() { // Method to switch off the light
            System.out.println("The light is off.");
        }
    }

     class Singleton {
        public static void main(String[] args) {
            LightSwitch switch1 = LightSwitch.getInstance(); //as it's static method we call by class name
            LightSwitch switch2 = LightSwitch.getInstance();


            // Check if both switches refer to the same instance
            System.out.println(switch1 == switch2);

            // Using the singleton instance to switch on & off the light
            switch1.switchOn();
            switch2.switchOff();
        }
    }


