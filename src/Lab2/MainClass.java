package Lab2;

import javax.swing.*;

/**
 * Created by Max on 10.04.2017.
 */

class MainFrame {

    MainFrame() {

        JFrame mainframe = new JFrame("Студенты");

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Таблица");
        JMenuItem menuNew = new JMenuItem("Новая");
        JMenuItem menuOpen = new JMenuItem("Открыть");
        JMenuItem menuAdd = new JMenuItem("Добавить запись");
        JMenuItem menuSave = new JMenuItem("Сохранить");
        JMenuItem menuDelete = new JMenuItem("Удалить запись");
        JMenuItem menuSearch = new JMenuItem("Поиск записи");

    }
}

public class MainClass {
}
