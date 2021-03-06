package org.abstractfactory.factory;

import org.abstractfactory.bean.Note;
import org.abstractfactory.bean.Video;

/**
 * 抽象工厂接口声明了一组能返回不同抽象产品的方法。这些产品属于同一个系列
 * 且在高层主题或概念上具有相关性。同系列的产品通常能相互搭配使用。系列产
 * 品可有多个变体，但不同变体的产品不能搭配使用
 */
public interface CourseFactory {
    /**
     * 创建视频对象
     */
    Video createVideo();

    /**
     * 创建笔记对象
     */
    Note createNote();
}
