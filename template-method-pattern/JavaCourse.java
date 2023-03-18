public class JavaCourse extends AbstractCourse {
    @Override
    protected void makepackage() {
        System.out.println("完成Java课程制作");
    }

    @Override
    boolean needWriteArticle() {
        return true;
    }
}
