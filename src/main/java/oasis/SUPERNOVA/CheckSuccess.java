package oasis.SUPERNOVA;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CheckSuccess {
    private boolean success;

    public CheckSuccess(boolean success) {
        this.success = success;
    }
}
