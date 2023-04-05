/**
 * 课程视频关闭命令
 */
public class CourseVideoCloseCommand implements Command{
    private CourseVideo courseVideo;

    public CourseVideoCloseCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override
    public void execute() {
        courseVideo.close();
    }
}
