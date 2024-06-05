import java.util.Optional;

class ErrorHandling {

    void handleErrorByThrowingIllegalArgumentException() {
        try {
            throw new Exception();
        } catch (Exception exception) {
            throw new IllegalArgumentException();
        }
    }

    void handleErrorByThrowingIllegalArgumentExceptionWithDetailMessage(String message) {
        try {
            throw new Exception();
        } catch (Exception exception) {
            throw new IllegalArgumentException(message);
        }
    }

    void handleErrorByThrowingAnyCheckedException() throws Exception {
        try {
            throw new Exception();
        } catch (Exception exception) {
            throw new Exception();
        }
    }

    void handleErrorByThrowingAnyCheckedExceptionWithDetailMessage(String message) throws Exception{
        try {
            throw new Exception();
        } catch (Exception exception) {
            throw new Exception(message);
        }
    }

    void handleErrorByThrowingAnyUncheckedException() {
        try {
            throw new Exception();
        } catch (Exception exception) {
            throw new RuntimeException();
        }
    }

    void handleErrorByThrowingAnyUncheckedExceptionWithDetailMessage(String message) {
        try {
            throw new Exception();
        } catch (Exception exception) {
            throw new RuntimeException(message);
        }
    }

    void handleErrorByThrowingCustomCheckedException() throws CustomCheckedException{
        try {
            throw new Exception();
        } catch (Exception exception) {
            throw new CustomCheckedException();
        }
    }

    void handleErrorByThrowingCustomCheckedExceptionWithDetailMessage(String message) throws CustomCheckedException {
        try {
            throw new Exception();
        } catch (Exception exception) {
            throw new CustomCheckedException(message);
        }
    }

    void handleErrorByThrowingCustomUncheckedException() {
        try {
            throw new Exception();
        } catch (Exception exception) {
            throw new CustomUncheckedException();
        }
    }

    void handleErrorByThrowingCustomUncheckedExceptionWithDetailMessage(String message) {
        try {
            throw new Exception();
        } catch (Exception exception) {
            throw new CustomUncheckedException(message);
        }
    }

    Optional<Integer> handleErrorByReturningOptionalInstance(String integer) {
        try {
            return Optional.of(Integer.parseInt(integer));
        } catch (Exception exception) {
            return Optional.empty();
        }
    }
}
