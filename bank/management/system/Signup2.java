package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Signup2 extends JFrame implements ActionListener {
    JComboBox<String> comboBox, comboBox2, comboBox3, comboBox4, comboBox5;
    JTextField textPan, textAadhar;
    JRadioButton r1, r2, e1, e2;
    JButton next;

    String formno;

    Signup2(String formno) {
        super("APPLICATION FORM");

        this.formno = formno;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(140, 5, 80, 80);
        add(image);

        JLabel l1 = new JLabel("Page 2 :-");
        l1.setFont(new Font("Raleway", Font.BOLD, 20));
        l1.setBounds(280, 25, 600, 30);
        add(l1);

        JLabel l2 = new JLabel("Additional Details");
        l2.setFont(new Font("Raleway", Font.BOLD, 20));
        l2.setBounds(280, 55, 600, 30);
        add(l2);

        JLabel l3 = new JLabel("Religion :");
        l3.setFont(new Font("Raleway", Font.BOLD, 16));
        l3.setBounds(80, 110, 100, 25);
        add(l3);

        String religion[] = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
        comboBox = new JComboBox<>(religion);
        comboBox.setBackground(new Color(252, 208, 76));
        comboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox.setBounds(300, 110, 250, 25);
        add(comboBox);

        JLabel l4 = new JLabel("Category : ");
        l4.setFont(new Font("Raleway", Font.BOLD, 16));
        l4.setBounds(80, 160, 100, 25);
        add(l4);

        String Category[] = {"General", "OBC", "SC", "ST", "Other"};
        comboBox2 = new JComboBox<>(Category);
        comboBox2.setBackground(new Color(252, 208, 76));
        comboBox2.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox2.setBounds(300, 160, 250, 25);
        add(comboBox2);

        JLabel l5 = new JLabel("Income : ");
        l5.setFont(new Font("Raleway", Font.BOLD, 16));
        l5.setBounds(80, 210, 100, 25);
        add(l5);

        String income[] = {"Null", "<1,50,000", "<2,50,000", "5,00,000", "Up to 10,00,000", "Above 10,00,000"};
        comboBox3 = new JComboBox<>(income);
        comboBox3.setBackground(new Color(252, 208, 76));
        comboBox3.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox3.setBounds(300, 210, 250, 25);
        add(comboBox3);

        JLabel l6 = new JLabel("Education : ");
        l6.setFont(new Font("Raleway", Font.BOLD, 16));
        l6.setBounds(80, 260, 120, 25);
        add(l6);

        String educational[] = {"Non-Graduate", "Graduate", "Post-Graduate", "Doctorate", "Others"};
        comboBox4 = new JComboBox<>(educational);
        comboBox4.setBackground(new Color(252, 208, 76));
        comboBox4.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox4.setBounds(300, 260, 250, 25);
        add(comboBox4);

        JLabel l7 = new JLabel("Occupation : ");
        l7.setFont(new Font("Raleway", Font.BOLD, 16));
        l7.setBounds(80, 310, 120, 25);
        add(l7);

        String Occupation[] = {"Salaried", "Self-Employed", "Business", "Student", "Retired", "Other"};
        comboBox5 = new JComboBox<>(Occupation);
        comboBox5.setBackground(new Color(252, 208, 76));
        comboBox5.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox5.setBounds(300, 310, 250, 25);
        add(comboBox5);

        JLabel l8 = new JLabel("PAN Number : ");
        l8.setFont(new Font("Raleway", Font.BOLD, 16));
        l8.setBounds(80, 360, 150, 25);
        add(l8);

        textPan = new JTextField();
        textPan.setFont(new Font("Raleway", Font.BOLD, 14));
        textPan.setBounds(300, 360, 250, 25);
        add(textPan);

        JLabel l9 = new JLabel("Aadhar Number : ");
        l9.setFont(new Font("Raleway", Font.BOLD, 16));
        l9.setBounds(80, 410, 170, 25);
        add(l9);

        textAadhar = new JTextField();
        textAadhar.setFont(new Font("Raleway", Font.BOLD, 14));
        textAadhar.setBounds(300, 410, 250, 25);
        add(textAadhar);

        JLabel l10 = new JLabel("Senior Citizen : ");
        l10.setFont(new Font("Raleway", Font.BOLD, 16));
        l10.setBounds(80, 460, 150, 25);
        add(l10);

        r1 = new JRadioButton("Yes");
        r1.setBackground(new Color(252, 208, 76));
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBounds(300, 460, 80, 25);
        add(r1);

        r2 = new JRadioButton("No");
        r2.setBackground(new Color(252, 208, 76));
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBounds(400, 460, 80, 25);
        add(r2);

        ButtonGroup seniorGroup = new ButtonGroup();
        seniorGroup.add(r1);
        seniorGroup.add(r2);

        JLabel l11 = new JLabel("Existing Account : ");
        l11.setFont(new Font("Raleway", Font.BOLD, 16));
        l11.setBounds(80, 510, 170, 25);
        add(l11);

        e1 = new JRadioButton("Yes");
        e1.setBackground(new Color(252, 208, 76));
        e1.setFont(new Font("Raleway", Font.BOLD, 14));
        e1.setBounds(300, 510, 80, 25);
        add(e1);

        e2 = new JRadioButton("No");
        e2.setBackground(new Color(252, 208, 76));
        e2.setFont(new Font("Raleway", Font.BOLD, 14));
        e2.setBounds(400, 510, 80, 25);
        add(e2);

        ButtonGroup existGroup = new ButtonGroup();
        existGroup.add(e1);
        existGroup.add(e2);

        JLabel l12 = new JLabel("Form No : ");
        l12.setFont(new Font("Raleway", Font.BOLD, 14));
        l12.setBounds(650, 10, 100, 25);
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway", Font.BOLD, 14));
        l13.setBounds(710, 10, 80, 25);
        add(l13);

        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.setBounds(470, 580, 90, 28);
        next.addActionListener(this);
        add(next);

        setLayout(null);
        setSize(800, 680);
        setLocationRelativeTo(null); // center on screen
        getContentPane().setBackground(new Color(252, 208, 76));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String rel = (String) comboBox.getSelectedItem();
        String cate = (String) comboBox2.getSelectedItem();
        String inc = (String) comboBox3.getSelectedItem();
        String edu = (String) comboBox4.getSelectedItem();
        String occ = (String) comboBox5.getSelectedItem();

        String pan = textPan.getText();
        String addhar = textAadhar.getText();

         String scitizen = " ";

           if ((r1.isSelected())){
            scitizen = "Yes";
        } else if (r2.isSelected()) {
            scitizen ="No";
        }
        String eAccount = " ";
        if ((r1.isSelected())){
            eAccount = "Yes";
        } else if (r2.isSelected()) {
            eAccount ="No";
        }
         try{
            if (textPan.getText().equals("") || textAadhar.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }else {
                Conn c = new Conn();
                String q = "insert into Signuptwo values('"+formno+"', '"+rel+"', '"+cate+"','"+inc+"','"+edu+"','"+occ+"','"+pan+"','"+addhar+"','"+scitizen+"','"+eAccount+"')";
                c.statement.executeUpdate(q);
                new Signup3(formno);
                setVisible(false);
            }


        }catch (Exception E){
            E.printStackTrace();
        }


    }
    

    public static void main(String[] args) {
        new Signup2(" ");
    }
}
