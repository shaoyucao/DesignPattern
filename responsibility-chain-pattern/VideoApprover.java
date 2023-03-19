import org.apache.commons.lang.StringUtils;
public class VideoApprover extends Approver {
    @Override
    protected void approve(Course course) {
        if (StringUtils.isNotEmpty(course.getVideo())) {
            System.out.println(course.getName() + "含有视频，批准！");
            if (approver != null) {
                approver.approve(course);
            }
        } else {
            System.out.println(course.getName() + "不含有视频，不批准，流程结束！");
        }
    }
}
