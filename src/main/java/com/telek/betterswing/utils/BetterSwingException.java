package com.telek.betterswing.utils;


public final class BetterSwingException extends RuntimeException {


    public BetterSwingException(String message) {
        super(message);
    }


    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static class InvalidExtensionException extends RuntimeException {

        public InvalidExtensionException() {
            super("The extension must be either \"PNG\" or \"JPG\"");
        }

    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static class ValueOutOfRangeException extends RuntimeException {

        public ValueOutOfRangeException(int value, int left, int right) {
            super(String.format("Your value (%d) is not in the range [%d, %d]", value, left, right));
        }

        public ValueOutOfRangeException(double value, double left, double right) {
            super(String.format("Your value (%f) is not in the range [%f, %f]", value, left, right));
        }

        public ValueOutOfRangeException(float value, float left, float right) {
            super(String.format("Your value (%f) is not in the range [%f, %f]", value, left, right));
        }

    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    /**
     * Used to get rid of compiler errors, this is not an actual exception.
     */
    public static class ThisLineIsNeverExecutedException extends RuntimeException {

        public ThisLineIsNeverExecutedException() {
            super("An unexpected error has occured");
        }

    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


}

