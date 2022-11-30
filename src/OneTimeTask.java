import java.time.LocalDateTime;

public class OneTimeTask extends Task implements Repeatability {

    public OneTimeTask(String header, String description, LocalDateTime deadline, Boolean isPersonalTask) {
        super(header, description, deadline, isPersonalTask);
    }

    @Override
    public LocalDateTime getNextDeadline() {
        if (LocalDateTime.now().isBefore(getDeadline())) {
            return getDeadline();
        } else return null;
    }

    @Override
    public String toString() {
        return super.toString() + "\nВремя выполнения: " + getNextDeadline() + '\n';
    }
}
