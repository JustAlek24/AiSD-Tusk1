package ru.vsu.cs.aisd25.g8.berestnev_a_a.poject_task1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyW extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JButton startStopBtn;

    private Timer t = new Timer(1000, new AbstractAction() {
        private int cnt = 0;
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.printf("\r%d", cnt++);
        }
    });

    public MyW() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        startStopBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (t.isRunning())
                    t.stop();
                else
                    t.start();
            }
        });
    }

    public static void main(String[] args) {
        MyW dialog = new MyW();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
