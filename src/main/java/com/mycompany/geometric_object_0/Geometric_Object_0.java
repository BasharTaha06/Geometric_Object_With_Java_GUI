package com.mycompany.geometric_object_0;

import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Geometric_Object_0 {

    public static void main(String[] args) {

        GUI g = new GUI();
    }
}

class GUI extends JFrame {

    private JComboBox<String> shape;
    private JPanel p, p2;
    private JLabel t1, t2, t3, t4, t5, t6;
    private JTextField f1, f2, Area, Perimeter;
    private JButton but;
    private ImageIcon img;

    public GUI() {
        setTitle("Geometric Object");
        setSize(650, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBackground(Color.CYAN);

        initUI();
        pack();
        setVisible(true);
    }

    private void initUI() {

        
        but = new JButton("Calculate and Display");
        add(but, BorderLayout.AFTER_LAST_LINE);
        p2 = new JPanel();
        img = new ImageIcon("00.jpg");
        t4 = new JLabel(img);
        p2.add(t4);
        add(p2, BorderLayout.NORTH);

        p = new JPanel(new GridLayout(5, 2));

        t6 = new JLabel("  Select Shape:");
        shape = new JComboBox<>(new String[]{"Rectangle", "Square", "Circle"});

        t1 = new JLabel("  Width");
        f1 = new JTextField(22);

        t2 = new JLabel("  Height");
        f2 = new JTextField(22);

        t3 = new JLabel("  Area");
        Area = new JTextField(22);
        Area.setEditable(false);

        t5 = new JLabel("  Perimeter");
        Perimeter = new JTextField(22);
        Perimeter.setEditable(false);

        p.add(t6);
        p.add(shape);
        p.add(t1);
        p.add(f1);
        p.add(t2);
        p.add(f2);
        p.add(t3);
        p.add(Area);
        p.add(t5);
        p.add(Perimeter);

        add(p);

        but.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculate();
            }
        });

        shape.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ("Square".equals(shape.getSelectedItem())) {
                    t1.setVisible(false);
                    t2.setText("  Side");
                    f1.setVisible(false);

                } else if ("Circle".equals(shape.getSelectedItem())) {
                    t1.setVisible(false);
                    t2.setText("  Redius");
                    f1.setVisible(false);

                } else if ("Rectangle".equals(shape.getSelectedItem())) {
                    f1.setVisible(true);
                    t1.setVisible(true);
                    f2.setVisible(true);
                    t1.setText("  Width");
                    t2.setText("  Height");
                }
            }
        });
    }

    private void calculate() {
        String selected = (String) shape.getSelectedItem();
        double w = Double.parseDouble(f2.getText());

           if (selected.equals("Rectangle")) {
           double h = Double.parseDouble(f1.getText());

               Rectangle r1 = new Rectangle(w, h);
            if (w > 0 && h > 0) {
                Area.setText(r1.getArea() + "");
                Perimeter.setText(r1.getPerimeter() + "");
            } else {
                Area.setText("Invaled, Enter another width and height ");
                Perimeter.setText("Invaled, Enter another width and height ");
            }
        } else if (selected.equals("Square")) {
            Square s = new Square(w);
            if (w > 0) {
                Area.setText(s.getArea() + "");
                Perimeter.setText(s.getPerimeter() + "");

            } else {
                Area.setText("Invaled, Enter another Side");
                Perimeter.setText("Invaled, Enter another Side");

            }
        } else if (selected.equals("Circle")) {

            Circle c = new Circle(w);
            if (c.getRadius() > 0) {
                Area.setText(c.getArea() + "");
                Perimeter.setText(c.getPerimeter() + "");

            } else {
                Area.setText("Invaled, Enter another Radius");
                Perimeter.setText("Invaled, Enter another Radius");
            }
        }
    }

}
