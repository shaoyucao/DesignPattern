package com.syc.study.pattern.creational.simplefactory;

public class VideoFactory {
    public Video getVideo(String type) {
        if("Java".equalsIgnoreCase(type)) {
            return new JavaVideo();
        }
        else if("Python".equalsIgnoreCase(type)) {
            return new PythonVideo();
        }
        return null;
    }

    /**
     * 需求二：使用开闭原则扩展简单工厂
     */
    public Video getVideo2(Class c) {
        Video video;
        try {
            video = (Video) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return video;
    }
}
