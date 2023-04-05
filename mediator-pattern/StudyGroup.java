import java.util.Date;

/**
 * 学习小组
 */
public class StudyGroup {
    /**
     * 显示谁说了什么话
     * @param user
     * @param message
     */
    public static void showMessage(User user, String message) {
        System.out.println(new Date() + " [" + user.getName() + "]: " + message);
    }
}
