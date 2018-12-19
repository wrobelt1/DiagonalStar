package pl.coderstrust.udemy.section5;

public class Main {

    public static void main(String[] args) {
	    printSquareStar(5);
	    printSquareStar(12);
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }
        for (int i=0; i<number; i++) {

            for (int j=0; j<number; j++) {
                if (i == j || i == 0 || j == 0 || i == number-1 || j == number -1 || i == number- j-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
