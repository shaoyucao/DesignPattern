public class Test {
    public static void main(String[] args) {
        AbstractCourse javaCourse = new JavaCourse();
        javaCourse.makeCourse();
        System.out.println("==========");

        AbstractCourse goCourse = new GoCourse(true);
        goCourse.makeCourse();
    }
}
