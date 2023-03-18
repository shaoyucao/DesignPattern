
public class GoCourse extends AbstractCourse {

    // 为了使用钩子函数
    private boolean needWriteArticle;

    @Override
    protected void makepackage() {
        System.out.println("完成Go课程制作");
    }

    public GoCourse() {
    }

    public GoCourse(Boolean needWriteArticle) {
        this.needWriteArticle = needWriteArticle;
    }

    // 重写钩子函数
    @Override
    boolean needWriteArticle() {
        return this.needWriteArticle;
    }
}
