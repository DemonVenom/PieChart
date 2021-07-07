
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.*;
import java.awt.geom.Arc2D;


public class PieChart extends JComponent {


    private double pieSlice1;
    private double pieSlice2;
    private double pieSlice3;
    private double pieSlice4;


    public void paint(Graphics g) {

        // Create pie section 1
        Graphics2D g1 = (Graphics2D) g;
        g1.setPaint(Color.RED);
        g1.fill(new Arc2D.Double(50, 50, 300, 300, 0, pieSlice1, Arc2D.PIE));

        // Create pie section 2
        Graphics2D g2 = (Graphics2D) g;
        g2.setPaint(Color.BLUE);
        g2.fill(new Arc2D.Double(50, 50, 300, 300, (pieSlice1), pieSlice2, Arc2D.PIE));

        // Create pie section 3
        Graphics2D g3 = (Graphics2D) g;
        g3.setPaint(Color.GREEN);
        g3.fill(new Arc2D.Double(50, 50, 300, 300, (pieSlice1 + pieSlice2), pieSlice3, Arc2D.PIE));

        // Create pie section 4
        Graphics2D g4 = (Graphics2D) g;
        g4.setPaint(Color.PINK);
        g4.fill(new Arc2D.Double(50, 50, 300, 300, (pieSlice1 + pieSlice2 + pieSlice3), pieSlice4, Arc2D.PIE));


    }

    // Create set methods for pie slices
    public void setPieSlice1(double pieSlice1) {

        this.pieSlice1 = pieSlice1;
    }
    public void setPieSlice2(double pieSlice2) {

        this.pieSlice2 = pieSlice2;
    }
    public void setPieSlice3(double pieSlice3) {

        this.pieSlice3 = pieSlice3;
    }
    public void setPieSlice4(double pieSlice4) {

        this.pieSlice4 = pieSlice4;
    }




}
