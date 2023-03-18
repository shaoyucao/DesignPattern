public abstract class AbstractCourse {
    final void makeCourse() {
        makeVideo();
        makePPT();
        if(needWriteArticle()) {
            writeArticle();
        }
        makepackage();
    }

    protected final void makeVideo() {
        System.out.println("制作视频");
    }

    protected final void makePPT() {
        System.out.println("制作PPT");
    }

    protected final void writeArticle() {
        System.out.println("写手记");
    }

    boolean needWriteArticle() {
        return false;
    }

    protected abstract void makepackage();
}
