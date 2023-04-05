/**
 * 具体命令一
 */
public class CourseVideoOpenCommand implements Command{
    private final CourseVideo courseVideo;

    public CourseVideoOpenCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override
    public void execute() {
        courseVideo.open();
    }
}
