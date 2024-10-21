//Structural Pattern_Facade Pattern: pattern that provides a simplified interface to a complex system

//05 Subsystems are here(WakeUp, EatBreakfast, GoToWork, EatDinner & Sleep)

// Subsystem 1
        class WakeUp {
            public void wakeUp() {
                System.out.println("Waking up...");
            }
        }

// Subsystem 2
        class EatBreakfast {
            public void eat() {
                System.out.println("Eating breakfast...");
            }
        }

// Subsystem 3
        class GoToWork {
            public void work() {
                System.out.println("Going to work...");
            }
        }

// Subsystem 4
        class EatDinner {
            public void eat() {
                System.out.println("Eating dinner...");
            }
        }

// Subsystem 5
        class Sleep {
            public void sleep() {
                System.out.println("Going to sleep...");
            }
        }


 /* facade encapsulates the complexity of interacting with the subsystems and provides
 a simplified interface (startDay) to execute the daily routine. */


     class DailyRoutine { //facade class
        private WakeUp wakeUp; //private attribute(ref.variable) named wakeUp which will hold an instance of the WakeUp class
        private EatBreakfast eatBreakfast;
        private GoToWork goToWork;
        private EatDinner eatDinner;
        private Sleep sleep;

        //Constructor
        public DailyRoutine() { //initializing the instances of each subsystem
            this.wakeUp = new WakeUp();
            this.eatBreakfast = new EatBreakfast();
            this.goToWork = new GoToWork();
            this.eatDinner = new EatDinner();
            this.sleep = new Sleep();
        }

        public void startDay() { //simplified interface by facade(collect all the subsystems'
            wakeUp.wakeUp();
            eatBreakfast.eat();
            goToWork.work();
            eatDinner.eat();
            sleep.sleep();
        }
    }

    public class User {
        public static void main(String[] args) {
            DailyRoutine dailyRoutine = new DailyRoutine();
            dailyRoutine.startDay(); //uses the facade without dealing with the sub systems
        }
    }


