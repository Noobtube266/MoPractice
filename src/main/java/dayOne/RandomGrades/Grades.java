package dayOne.RandomGrades;


public class Grades {
    public static void main(String[] args) {


        int grade = rand.nextInt(max - min + 1) + min;
        if (grade >= 90) {
            System.out.println("You got an A");
        }else if (grade >= 80) {
            System.out.println("You got a B");
        }else if (grade >= 70) {
            System.out.println("You got a C");
        }else if(grade >= 60){
            System.out.println("You got a D");
        } else {
            System.out.println("You failed F");
        }

    }

}
