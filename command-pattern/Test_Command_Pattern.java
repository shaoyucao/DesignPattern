/**
 * 测试类
 */
public class Test_Command_Pattern {
    public static void main(String[] args) {
        CourseVideo courseVideo = new CourseVideo("Java");

        Command openCommand = new CourseVideoOpenCommand(courseVideo);
        CourseVideoCloseCommand closeCommand = new CourseVideoCloseCommand(courseVideo);

        Staff staff = new Staff();
        staff.addCommand(openCommand);
        staff.addCommand(closeCommand);
        staff.executeCommand();

    }
}
