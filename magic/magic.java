public class Magic {
	public static void main(String[] args) {
    int myNumber = 23563;
    // We will refer to myNumber as "original number from now on".
		int stepOne = myNumber * myNumber;
    int stepTwo = stepOne + myNumber;
    int stepThree = stepTwo / myNumber;
    int stepFour = stepThree + 17;
    int stepFive = stepFour - myNumber;
    int stepSix = stepFive / 6;
    System.out.println(stepSix);
	}
}