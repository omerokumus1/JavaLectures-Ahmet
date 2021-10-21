public class LockerPuzzle {
    public static void main(String[] args) {

        int size = 100;
        boolean[] lockers = new boolean[size];

        startLockerPuzzle(lockers);
        printOpenLockers(lockers);
    }

    private static void startLockerPuzzle(boolean[] lockers) {
        handleFirstStudent(lockers);
        printCurrentState(0, lockers);
        handleSecondStudent(lockers);
        printCurrentState(1, lockers);
        handleOtherStudents(lockers);
    }

    private static void handleOtherStudents(boolean[] lockers) {
        for (int studentIndex = 2; studentIndex < lockers.length; studentIndex++) {
            moveThroughLockersAndChangeIfNecessary(lockers, studentIndex);
            printCurrentState(studentIndex, lockers);
        }
    }

    private static void handleSecondStudent(boolean[] lockers) {
        for (int lockerIndex = 1; lockerIndex < lockers.length; lockerIndex++) {
            changeState(lockers, lockerIndex);
        }
    }

    private static void handleFirstStudent(boolean[] lockers) {
        for (int lockerIndex = 0; lockerIndex < lockers.length; lockerIndex++) {
            changeState(lockers, lockerIndex);
        }
    }

    private static void moveThroughLockersAndChangeIfNecessary(boolean[] lockers, int studentIndex) {
        for (int lockerIndex = studentIndex; lockerIndex < lockers.length; lockerIndex++) {
            if (shouldBeChanged(studentIndex, lockerIndex)) {
                changeState(lockers, lockerIndex);
            }
        }
    }

    private static void changeState(boolean[] lockers, int lockerIndex) {
        lockers[lockerIndex] =!lockers[lockerIndex];
    }

    private static boolean shouldBeChanged(int studentIndex, int lockerIndex) {
        return ((lockerIndex + 1) % (studentIndex + 1)) == 0;
    }

    private static void printOpenLockers(boolean[] lockers) {
        for (int i = 0; i < lockers.length; i++) {
            if (lockers[i]){
                System.out.println("locker number: " + (i+1));
            }
        }
    }

    private static void printCurrentState(int studentIndex, boolean[] lockers) {
        System.out.println("After " + (studentIndex+1) + ".th student");
        for (int j = 0; j < lockers.length; j++) {
            System.out.print(lockers[j] + ", ");
        }
        System.out.println();
    }
}
