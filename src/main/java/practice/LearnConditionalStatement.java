package practice;

public class LearnConditionalStatement {
    public void learnIfStatement(int x) {
        if (x < 20) {
            System.out.println("Value of x is: " + x);
        }
    }

    public void learnIfElseStatement(int x) {
        if(x < 20) {
            System.out.println("This is if Statement");
        } else {
            System.out.println("This is else statement");
        }
    }
    // Print Result based on the grade
    public void switchStatement(char grade) {
        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
            case 'C':
                System.out.println("Well done" );
                break;
            case 'D':
                System.out.println("You passed");
                break;
            case 'F':
                System.out.print("Better Try again");
                break;
            default:
                System.out.println("Invalid grade");
        }
        System.out.println("Your grade is: " + grade);
    }

    public void printGrades(char grade) {
        if(grade == 'A') {
            System.out.println("Excellent");
        } else if (grade == 'B') {
            System.out.println("Well done" );
        } else if (grade == 'C') {
            System.out.println("Well done" );
        } else if (grade == 'D') {
            System.out.println("You passed");
        } else if (grade =='F') {
            System.out.print("Better Try again");
        } else {
            System.out.println("Invalid grade");
        }
        System.out.println("Your grade is: " + grade);
    }

    public void conditionalOperator() {
        int a,b;
        a = 10;
        b = (a == 10) ? 20 : 30;
        System.out.println(" Value of B is: " + b);
    }
}
