import java.util.ArrayList;
import java.util.List;

/**
 * 员工类，命令执行者
 */
public class Staff {
    private List<Command> commandList = new ArrayList<>();

    public void addCommand(Command command) {
        commandList.add(command);
    }


    public void executeCommand() {
        for(Command command : commandList) {
            command.execute();
        }
        commandList.clear();
    }

}
