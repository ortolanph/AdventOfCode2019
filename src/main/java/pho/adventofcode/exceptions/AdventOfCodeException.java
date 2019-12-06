package pho.adventofcode.exceptions;

public class AdventOfCodeException extends Exception {

    public AdventOfCodeException(int day, int part, Throwable cause) {
        super(
            String.format("Error processing day %d part %d.", day, part), 
            cause);    
    }

}