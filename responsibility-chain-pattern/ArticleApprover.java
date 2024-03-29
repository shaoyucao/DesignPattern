import org.apache.commons.lang.StringUtils;
public class ArticleApprover extends Approver{
    @Override
    protected void approve(Course course) {
        if (StringUtils.isNotEmpty(course.getArticle())) {
            System.out.println(course.getName() + "含有手记，批准！");
            if (approver != null) {
                approver.approve(course);
            }
        } else {
            System.out.println(course.getName() + "不含有手记，不批准，结束流程！");
        }
    }
}
