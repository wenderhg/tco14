public class TaroFriends {

    private int leftMost;
    private int rightMost;

    public int getNumber(int[] coordinates, int X) {
        initializePositions(coordinates);

        for (int i = 0; i < coordinates.length; i++) {
            int newCoordinate = getNewCoordinate(coordinates[i], X);

            setLeftMost(newCoordinate);
            setRightMost(newCoordinate);
        }

        return rightMost - leftMost;
    }

    private void initializePositions(int[] coordinates) {
        leftMost = 100000000;
        rightMost = -100000000;
    }

    private int getNewCoordinate(int currentCoordinate, int X) {
        if (currentCoordinate < 0)
            return currentCoordinate + X;
        else
            return currentCoordinate - X;
    }

    private void setLeftMost(int newCoordinate) {
        if (leftMost > newCoordinate)
            leftMost = newCoordinate;
    }

    private void setRightMost(int newCoordinate) {
        if (rightMost < newCoordinate)
            rightMost = newCoordinate;
    }
    
}
