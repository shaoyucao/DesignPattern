public class Test_Responsibility_Chain {
    public static void main(String[] args) {
        Approver articleApprover = new ArticleApprover();
        Approver videoApprover = new VideoApprover();

        Course course = new Course();
        course.setName("Java课程");
        course.setArticle("Java手记");
        course.setVideo("Java视频");

        articleApprover.setApprover(videoApprover);
        articleApprover.approve(course);
    }
}
