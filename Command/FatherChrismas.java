package Command;

public class FatherChrismas {

        private static FatherChrismas instance;

        private FatherChrismas() {

        }

        public static FatherChrismas getInstance() {

            if (instance == null) {
                instance = new FatherChrismas();
            }

            return instance;
        }

        public void postMessage(String message) {
            System.out.println("Posting a message" + message);
        }


    public void Doll(){
        System.out.println("I want dolls");
    }

    public void Wheel(){
        System.out.println("I want Wheels");

    }

}

