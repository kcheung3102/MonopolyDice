public class Main {

    public static void main(String[] args) {
        int dice1 = (int) (Math.random() * 6) + 1;
        int dice2 = (int) (Math.random() * 6) + 1;
        int counter = 0; //used to count number of times dice has been rolled
        int sum = dice1 + dice2;

        while(counter < 3) {
            if(counter == 0 && dice1 != dice2) {
                System.out.println("User Rolled " + dice1 + " & " + dice2);
                System.out.println("User moves " + sum + " spaces and stops");
                counter++;

            } else if( dice1 == dice2 ) {
                System.out.println("User Rolled " + dice1 + " & " + dice2);
                System.out.println("User moves " + sum + " spaces and goes again ");
                counter++;
            }

            if(counter >= 3 ) {
                System.out.println("GO TO JAIL!");
            }
        }




    }
}
